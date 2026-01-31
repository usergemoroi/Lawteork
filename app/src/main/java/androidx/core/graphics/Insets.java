package androidx.core.graphics;

import android.graphics.Rect;
/* loaded from: classes.dex */
public final class Insets {
    public static final Insets NONE = new Insets(0, 0, 0, 0);
    public final int bottom;
    public final int left;
    public final int right;

    /* renamed from: top  reason: collision with root package name */
    public final int f255top;

    private Insets(int left, int top2, int right, int bottom) {
        this.left = left;
        this.f255top = top2;
        this.right = right;
        this.bottom = bottom;
    }

    /* renamed from: of */
    public static Insets m204of(int left, int top2, int right, int bottom) {
        if (left == 0 && top2 == 0 && right == 0 && bottom == 0) {
            return NONE;
        }
        return new Insets(left, top2, right, bottom);
    }

    /* renamed from: of */
    public static Insets m203of(Rect r) {
        return m204of(r.left, r.top, r.right, r.bottom);
    }

    public static Insets add(Insets a, Insets b) {
        return m204of(a.left + b.left, a.f255top + b.f255top, a.right + b.right, a.bottom + b.bottom);
    }

    public static Insets subtract(Insets a, Insets b) {
        return m204of(a.left - b.left, a.f255top - b.f255top, a.right - b.right, a.bottom - b.bottom);
    }

    public static Insets max(Insets a, Insets b) {
        return m204of(Math.max(a.left, b.left), Math.max(a.f255top, b.f255top), Math.max(a.right, b.right), Math.max(a.bottom, b.bottom));
    }

    public static Insets min(Insets a, Insets b) {
        return m204of(Math.min(a.left, b.left), Math.min(a.f255top, b.f255top), Math.min(a.right, b.right), Math.min(a.bottom, b.bottom));
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Insets insets = (Insets) o;
        if (this.bottom == insets.bottom && this.left == insets.left && this.right == insets.right && this.f255top == insets.f255top) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int result = this.left;
        return (((((result * 31) + this.f255top) * 31) + this.right) * 31) + this.bottom;
    }

    public String toString() {
        return "Insets{left=" + this.left + ", top=" + this.f255top + ", right=" + this.right + ", bottom=" + this.bottom + '}';
    }

    @Deprecated
    public static Insets wrap(android.graphics.Insets insets) {
        return toCompatInsets(insets);
    }

    public static Insets toCompatInsets(android.graphics.Insets insets) {
        return m204of(insets.left, insets.top, insets.right, insets.bottom);
    }

    public android.graphics.Insets toPlatformInsets() {
        return Api29Impl.m202of(this.left, this.f255top, this.right, this.bottom);
    }

    /* loaded from: classes.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        /* renamed from: of */
        static android.graphics.Insets m202of(int left, int top2, int right, int bottom) {
            return android.graphics.Insets.of(left, top2, right, bottom);
        }
    }
}
