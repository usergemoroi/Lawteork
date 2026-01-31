package com.topjohnwu.superuser.internal;

import java.util.AbstractList;
/* loaded from: classes.dex */
public class NOPList extends AbstractList<String> {
    private static NOPList list;

    public static NOPList getInstance() {
        if (list == null) {
            list = new NOPList();
        }
        return list;
    }

    private NOPList() {
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int index, String element) {
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int index, String element) {
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int index) {
        return null;
    }
}
