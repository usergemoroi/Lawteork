package top.niunaijun.blackbox.core.system.p027pm;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.MutableInt;
import android.util.PrintWriterPrinter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import top.niunaijun.blackbox.core.system.p027pm.BPackage;
import top.niunaijun.blackbox.core.system.p027pm.BPackage.IntentInfo;
import top.niunaijun.blackbox.utils.Slog;
/* renamed from: top.niunaijun.blackbox.core.system.pm.IntentResolver */
/* loaded from: classes3.dex */
public abstract class IntentResolver<F extends BPackage.IntentInfo, R> {
    private static final boolean DEBUG = false;
    private static final String TAG = "IntentResolver";
    private static final boolean localLOGV = false;
    private static final boolean localVerificationLOGV = false;
    private static final Comparator mResolvePrioritySorter = new Comparator() { // from class: top.niunaijun.blackbox.core.system.pm.IntentResolver.1
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int priority = ((IntentFilter) obj).getPriority();
            int priority2 = ((IntentFilter) obj2).getPriority();
            if (priority > priority2) {
                return -1;
            }
            return priority < priority2 ? 1 : 0;
        }
    };
    private final HashSet<F> mFilters = new HashSet<>();
    private final ArrayMap<String, F[]> mTypeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mBaseTypeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mWildTypeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mSchemeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mActionToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mTypedActionToFilter = new ArrayMap<>();

    /* renamed from: top.niunaijun.blackbox.core.system.pm.IntentResolver$IteratorWrapper */
    /* loaded from: classes3.dex */
    public class IteratorWrapper implements Iterator<F> {
        private F mCur;

        /* renamed from: mI */
        private final Iterator<F> f246mI;

        public IteratorWrapper(Iterator<F> it) {
            this.f246mI = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f246mI.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            F f = this.mCur;
            if (f != null) {
                IntentResolver.this.removeFilterInternal(f);
            }
            this.f246mI.remove();
        }

        @Override // java.util.Iterator
        public F next() {
            F next = this.f246mI.next();
            this.mCur = next;
            return next;
        }
    }

    private final void addFilter(ArrayMap<String, F[]> arrayMap, String str, F f) {
        F[] fArr = arrayMap.get(str);
        if (fArr == null) {
            F[] newArray = newArray(2);
            arrayMap.put(str, newArray);
            newArray[0] = f;
            return;
        }
        int length = fArr.length;
        int i = length;
        while (i > 0 && fArr[i - 1] == null) {
            i--;
        }
        if (i < length) {
            fArr[i] = f;
            return;
        }
        F[] newArray2 = newArray((length * 3) / 2);
        System.arraycopy(fArr, 0, newArray2, 0, length);
        newArray2[length] = f;
        arrayMap.put(str, newArray2);
    }

    private void buildResolveList(Intent intent, FastImmutableArraySet<String> fastImmutableArraySet, boolean z, boolean z2, String str, String str2, F[] fArr, List<R> list, int i) {
        String str3;
        F f;
        String str4;
        Uri uri;
        String str5;
        String str6;
        F[] fArr2 = fArr;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str7 = intent.getPackage();
        int length = fArr2 != null ? fArr2.length : 0;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length && (f = fArr2[i2]) != null) {
            if (z) {
                Slog.m14v(TAG, "Matching against filter " + f);
            }
            if (str7 != null && !isPackageForFilter(str7, f)) {
                if (z) {
                    str6 = "  Filter is not from package " + str7 + "; skipping";
                    Slog.m14v(TAG, str6);
                }
                str4 = action;
                uri = data;
            } else if (allowFilterResult(f, list)) {
                str4 = action;
                uri = data;
                int match = f.intentFilter.match(action, str, str2, data, fastImmutableArraySet, TAG);
                if (match >= 0) {
                    if (z) {
                        Slog.m14v(TAG, "  Filter matched!  match=0x" + Integer.toHexString(match) + " hasDefault=" + f.intentFilter.hasCategory("android.intent.category.DEFAULT"));
                    }
                    if (!z2 || f.intentFilter.hasCategory("android.intent.category.DEFAULT")) {
                        R newResult = newResult(f, match, i);
                        if (z) {
                            Slog.m14v(TAG, "    Created result: " + newResult);
                        }
                        if (newResult != null) {
                            list.add(newResult);
                        }
                    } else {
                        z3 = true;
                    }
                } else if (z) {
                    switch (match) {
                        case -4:
                            str5 = "category";
                            break;
                        case -3:
                            str5 = "action";
                            break;
                        case -2:
                            str5 = "data";
                            break;
                        case -1:
                            str5 = "type";
                            break;
                        default:
                            str5 = "unknown reason";
                            break;
                    }
                    Slog.m14v(TAG, "  Filter did not match: ".concat(str5));
                }
            } else {
                if (z) {
                    str6 = "  Filter's target already added";
                    Slog.m14v(TAG, str6);
                }
                str4 = action;
                uri = data;
            }
            i2++;
            fArr2 = fArr;
            action = str4;
            data = uri;
        }
        if (z && z3) {
            if (list.size() == 0) {
                str3 = "resolveIntent failed: found match, but none with CATEGORY_DEFAULT";
            } else if (list.size() <= 1) {
                return;
            } else {
                str3 = "resolveIntent: multiple matches, only some with CATEGORY_DEFAULT";
            }
            Slog.m14v(TAG, str3);
        }
    }

    private ArrayList<F> collectFilters(F[] fArr, IntentFilter intentFilter) {
        F f;
        ArrayList<F> arrayList = null;
        if (fArr != null) {
            for (int i = 0; i < fArr.length && (f = fArr[i]) != null; i++) {
                if (filterEquals(f.intentFilter, intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(f);
                }
            }
        }
        return arrayList;
    }

    public static boolean filterEquals(IntentFilter intentFilter, IntentFilter intentFilter2) {
        int countActions = intentFilter.countActions();
        if (countActions != intentFilter2.countActions()) {
            return false;
        }
        for (int i = 0; i < countActions; i++) {
            if (!intentFilter2.hasAction(intentFilter.getAction(i))) {
                return false;
            }
        }
        int countCategories = intentFilter.countCategories();
        if (countCategories != intentFilter2.countCategories()) {
            return false;
        }
        for (int i2 = 0; i2 < countCategories; i2++) {
            if (!intentFilter2.hasCategory(intentFilter.getCategory(i2))) {
                return false;
            }
        }
        int countDataSchemes = intentFilter.countDataSchemes();
        if (countDataSchemes != intentFilter2.countDataSchemes()) {
            return false;
        }
        for (int i3 = 0; i3 < countDataSchemes; i3++) {
            if (!intentFilter2.hasDataScheme(intentFilter.getDataScheme(i3))) {
                return false;
            }
        }
        return intentFilter.countDataSchemeSpecificParts() == intentFilter2.countDataSchemeSpecificParts();
    }

    private static FastImmutableArraySet<String> getFastIntentCategories(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new FastImmutableArraySet<>((String[]) categories.toArray(new String[categories.size()]));
    }

    private final int register_intent_filter(F f, Iterator<String> it, ArrayMap<String, F[]> arrayMap, String str) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            addFilter(arrayMap, it.next(), f);
        }
        return i;
    }

    private final int register_mime_types(F f, String str) {
        String str2;
        Iterator<String> typesIterator = f.intentFilter.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next.concat("/*");
            }
            addFilter(this.mTypeToFilter, next, f);
            addFilter(indexOf > 0 ? this.mBaseTypeToFilter : this.mWildTypeToFilter, str2, f);
        }
        return i;
    }

    private final void remove_all_objects(ArrayMap<String, F[]> arrayMap, String str, Object obj) {
        F[] fArr = arrayMap.get(str);
        if (fArr != null) {
            int length = fArr.length - 1;
            while (length >= 0 && fArr[length] == null) {
                length--;
            }
            int i = length;
            while (length >= 0) {
                if (fArr[length] == obj) {
                    int i2 = i - length;
                    if (i2 > 0) {
                        System.arraycopy(fArr, length + 1, fArr, length, i2);
                    }
                    fArr[i] = null;
                    i--;
                }
                length--;
            }
            if (i < 0) {
                arrayMap.remove(str);
            } else if (i < fArr.length / 2) {
                F[] newArray = newArray(i + 2);
                System.arraycopy(fArr, 0, newArray, 0, i + 1);
                arrayMap.put(str, newArray);
            }
        }
    }

    private final int unregister_intent_filter(F f, Iterator<String> it, ArrayMap<String, F[]> arrayMap, String str) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            remove_all_objects(arrayMap, it.next(), f);
        }
        return i;
    }

    private final int unregister_mime_types(F f, String str) {
        String str2;
        Iterator<String> typesIterator = f.intentFilter.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next.concat("/*");
            }
            remove_all_objects(this.mTypeToFilter, next, f);
            remove_all_objects(indexOf > 0 ? this.mBaseTypeToFilter : this.mWildTypeToFilter, str2, f);
        }
        return i;
    }

    public boolean allowFilterResult(F f, List<R> list) {
        return true;
    }

    public void dumpFilter(PrintWriter printWriter, String str, F f) {
        printWriter.print(str);
        printWriter.println(f);
    }

    public void dumpFilterLabel(PrintWriter printWriter, String str, Object obj, int i) {
        printWriter.print(str);
        printWriter.print(obj);
        printWriter.print(": ");
        printWriter.println(i);
    }

    public boolean dumpMap(PrintWriter printWriter, String str, String str2, String str3, ArrayMap<String, F[]> arrayMap, String str4, boolean z, boolean z2) {
        boolean z3;
        String str5;
        F f;
        PrintWriterPrinter printWriterPrinter;
        boolean z4;
        ArrayMap<String, F[]> arrayMap2 = arrayMap;
        String str6 = str3 + "  ";
        String str7 = str3 + "    ";
        ArrayMap arrayMap3 = new ArrayMap();
        String str8 = str2;
        int i = 0;
        boolean z5 = false;
        PrintWriterPrinter printWriterPrinter2 = null;
        while (i < arrayMap.size()) {
            F[] valueAt = arrayMap2.valueAt(i);
            int length = valueAt.length;
            if (!z2 || z) {
                z3 = z5;
                str8 = str8;
                printWriterPrinter2 = printWriterPrinter2;
                int i2 = 0;
                boolean z6 = false;
                while (i2 < length) {
                    F f2 = valueAt[i2];
                    if (f2 != null) {
                        if (str4 == null || isPackageForFilter(str4, f2)) {
                            if (str8 != null) {
                                printWriter.print(str);
                                printWriter.println(str8);
                                str8 = null;
                            }
                            if (!z6) {
                                printWriter.print(str6);
                                printWriter.print(arrayMap2.keyAt(i));
                                printWriter.println(":");
                                z6 = true;
                            }
                            dumpFilter(printWriter, str7, f2);
                            if (z) {
                                if (printWriterPrinter2 == null) {
                                    printWriterPrinter2 = new PrintWriterPrinter(printWriter);
                                }
                                f2.intentFilter.dump(printWriterPrinter2, str7 + "  ");
                            }
                            z3 = true;
                        }
                        i2++;
                        arrayMap2 = arrayMap;
                    }
                }
            } else {
                arrayMap3.clear();
                int i3 = 0;
                while (true) {
                    str5 = str8;
                    if (i3 >= length || (f = valueAt[i3]) == null) {
                        break;
                    }
                    if (str4 == null || isPackageForFilter(str4, f)) {
                        Object filterToLabel = filterToLabel(f);
                        printWriterPrinter = printWriterPrinter2;
                        int indexOfKey = arrayMap3.indexOfKey(filterToLabel);
                        if (indexOfKey < 0) {
                            z4 = z5;
                            arrayMap3.put(filterToLabel, new MutableInt(1));
                        } else {
                            z4 = z5;
                            ((MutableInt) arrayMap3.valueAt(indexOfKey)).value++;
                        }
                    } else {
                        z4 = z5;
                        printWriterPrinter = printWriterPrinter2;
                    }
                    i3++;
                    str8 = str5;
                    printWriterPrinter2 = printWriterPrinter;
                    z5 = z4;
                }
                z3 = z5;
                PrintWriterPrinter printWriterPrinter3 = printWriterPrinter2;
                str8 = str5;
                int i4 = 0;
                boolean z7 = false;
                while (i4 < arrayMap3.size()) {
                    if (str8 != null) {
                        printWriter.print(str);
                        printWriter.println(str8);
                        str8 = null;
                    }
                    if (!z7) {
                        printWriter.print(str6);
                        printWriter.print(arrayMap2.keyAt(i));
                        printWriter.println(":");
                        z7 = true;
                    }
                    dumpFilterLabel(printWriter, str7, arrayMap3.keyAt(i4), ((MutableInt) arrayMap3.valueAt(i4)).value);
                    i4++;
                    z3 = true;
                }
                printWriterPrinter2 = printWriterPrinter3;
            }
            z5 = z3;
            i++;
            arrayMap2 = arrayMap;
        }
        return z5;
    }

    public Iterator<F> filterIterator() {
        return new IteratorWrapper(this.mFilters.iterator());
    }

    public void filterResults(List<R> list) {
    }

    public Set<F> filterSet() {
        return Collections.unmodifiableSet(this.mFilters);
    }

    public Object filterToLabel(F f) {
        return "IntentFilter";
    }

    public ArrayList<F> findFilters(IntentFilter intentFilter) {
        if (intentFilter.countDataSchemes() == 1) {
            return collectFilters(this.mSchemeToFilter.get(intentFilter.getDataScheme(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() == 0 || intentFilter.countActions() != 1) {
            if (intentFilter.countDataTypes() == 0 && intentFilter.countDataSchemes() == 0 && intentFilter.countActions() == 1) {
                return collectFilters(this.mActionToFilter.get(intentFilter.getAction(0)), intentFilter);
            }
            Iterator<F> it = this.mFilters.iterator();
            ArrayList<F> arrayList = null;
            while (it.hasNext()) {
                F next = it.next();
                if (filterEquals(next.intentFilter, intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return collectFilters(this.mTypedActionToFilter.get(intentFilter.getAction(0)), intentFilter);
    }

    public boolean isFilterStopped(F f, int i) {
        return false;
    }

    public abstract boolean isPackageForFilter(String str, F f);

    public abstract F[] newArray(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public R newResult(F f, int i, int i2) {
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<R> queryIntent(Intent intent, String str, boolean z, int i) {
        F[] fArr;
        F[] fArr2;
        F[] fArr3;
        F[] fArr4;
        F[] fArr5;
        String str2;
        int indexOf;
        F[] fArr6;
        StringBuilder sb;
        String arrays;
        String scheme = intent.getScheme();
        ArrayList arrayList = new ArrayList();
        boolean z2 = (intent.getFlags() & 8) != 0;
        if (z2) {
            Slog.m14v(TAG, "Resolving type=" + str + " scheme=" + scheme + " defaultOnly=" + z + " userId=" + i + " of " + intent);
        }
        if (str != null && (indexOf = str.indexOf(47)) > 0) {
            String substring = str.substring(0, indexOf);
            if (!substring.equals("*")) {
                if (str.length() == indexOf + 2 && str.charAt(indexOf + 1) == '*') {
                    fArr = this.mBaseTypeToFilter.get(substring);
                    if (z2) {
                        Slog.m14v(TAG, "First type cut: " + Arrays.toString(fArr));
                    }
                    fArr6 = this.mWildTypeToFilter.get(substring);
                    if (z2) {
                        sb = new StringBuilder("Second type cut: ");
                        arrays = Arrays.toString(fArr6);
                        Slog.m14v(TAG, sb.append(arrays).toString());
                    }
                    F[] fArr7 = this.mWildTypeToFilter.get("*");
                    if (z2) {
                    }
                    fArr2 = fArr6;
                    fArr3 = fArr7;
                } else {
                    fArr = this.mTypeToFilter.get(str);
                    if (z2) {
                        Slog.m14v(TAG, "First type cut: " + Arrays.toString(fArr));
                    }
                    fArr6 = this.mWildTypeToFilter.get(substring);
                    if (z2) {
                        sb = new StringBuilder("Second type cut: ");
                        arrays = Arrays.toString(fArr6);
                        Slog.m14v(TAG, sb.append(arrays).toString());
                    }
                    F[] fArr72 = this.mWildTypeToFilter.get("*");
                    if (z2) {
                        Slog.m14v(TAG, "Third type cut: " + Arrays.toString(fArr72));
                    }
                    fArr2 = fArr6;
                    fArr3 = fArr72;
                }
                if (scheme != null) {
                    F[] fArr8 = this.mSchemeToFilter.get(scheme);
                    if (z2) {
                        Slog.m14v(TAG, "Scheme list: " + Arrays.toString(fArr8));
                    }
                    fArr4 = fArr8;
                } else {
                    fArr4 = null;
                }
                if (str == null && scheme == null && intent.getAction() != null) {
                    fArr = this.mActionToFilter.get(intent.getAction());
                    if (z2) {
                        Slog.m14v(TAG, "Action list: " + Arrays.toString(fArr));
                    }
                }
                fArr5 = fArr;
                FastImmutableArraySet<String> fastIntentCategories = getFastIntentCategories(intent);
                if (fArr5 != null) {
                    str2 = TAG;
                    buildResolveList(intent, fastIntentCategories, z2, z, str, scheme, fArr5, arrayList, i);
                } else {
                    str2 = TAG;
                }
                if (fArr2 != null) {
                    buildResolveList(intent, fastIntentCategories, z2, z, str, scheme, fArr2, arrayList, i);
                }
                if (fArr3 != null) {
                    buildResolveList(intent, fastIntentCategories, z2, z, str, scheme, fArr3, arrayList, i);
                }
                if (fArr4 != null) {
                    buildResolveList(intent, fastIntentCategories, z2, z, str, scheme, fArr4, arrayList, i);
                }
                filterResults(arrayList);
                if (z2) {
                    Slog.m14v(str2, "Final result list:");
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Slog.m14v(str2, "  " + arrayList.get(i2));
                    }
                }
                return arrayList;
            } else if (intent.getAction() != null) {
                fArr = this.mTypedActionToFilter.get(intent.getAction());
                if (z2) {
                    Slog.m14v(TAG, "Typed Action list: " + Arrays.toString(fArr));
                }
                fArr2 = null;
                fArr3 = null;
                if (scheme != null) {
                }
                if (str == null) {
                    fArr = this.mActionToFilter.get(intent.getAction());
                    if (z2) {
                    }
                }
                fArr5 = fArr;
                FastImmutableArraySet<String> fastIntentCategories2 = getFastIntentCategories(intent);
                if (fArr5 != null) {
                }
                if (fArr2 != null) {
                }
                if (fArr3 != null) {
                }
                if (fArr4 != null) {
                }
                filterResults(arrayList);
                if (z2) {
                }
                return arrayList;
            }
        }
        fArr = null;
        fArr2 = null;
        fArr3 = null;
        if (scheme != null) {
        }
        if (str == null) {
        }
        fArr5 = fArr;
        FastImmutableArraySet<String> fastIntentCategories22 = getFastIntentCategories(intent);
        if (fArr5 != null) {
        }
        if (fArr2 != null) {
        }
        if (fArr3 != null) {
        }
        if (fArr4 != null) {
        }
        filterResults(arrayList);
        if (z2) {
        }
        return arrayList;
    }

    public List<R> queryIntentFromList(Intent intent, String str, boolean z, ArrayList<F[]> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = (intent.getFlags() & 8) != 0;
        FastImmutableArraySet<String> fastIntentCategories = getFastIntentCategories(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            buildResolveList(intent, fastIntentCategories, z2, z, str, scheme, arrayList.get(i2), arrayList2, i);
        }
        filterResults(arrayList2);
        return arrayList2;
    }

    public void removeFilter(F f) {
        removeFilterInternal(f);
        this.mFilters.remove(f);
    }

    public void removeFilterInternal(F f) {
        int unregister_intent_filter = unregister_intent_filter(f, f.intentFilter.schemesIterator(), this.mSchemeToFilter, "      Scheme: ");
        int unregister_mime_types = unregister_mime_types(f, "      Type: ");
        if (unregister_intent_filter == 0 && unregister_mime_types == 0) {
            unregister_intent_filter(f, f.intentFilter.actionsIterator(), this.mActionToFilter, "      Action: ");
        }
        if (unregister_mime_types != 0) {
            unregister_intent_filter(f, f.intentFilter.actionsIterator(), this.mTypedActionToFilter, "      TypedAction: ");
        }
    }

    public void sortResults(List<R> list) {
        Collections.sort(list, mResolvePrioritySorter);
    }

    public void addFilter(F f) {
        this.mFilters.add(f);
        int register_intent_filter = register_intent_filter(f, f.intentFilter.schemesIterator(), this.mSchemeToFilter, "      Scheme: ");
        int register_mime_types = register_mime_types(f, "      Type: ");
        if (register_intent_filter == 0 && register_mime_types == 0) {
            register_intent_filter(f, f.intentFilter.actionsIterator(), this.mActionToFilter, "      Action: ");
        }
        if (register_mime_types != 0) {
            register_intent_filter(f, f.intentFilter.actionsIterator(), this.mTypedActionToFilter, "      TypedAction: ");
        }
    }
}
