package androidx.constraintlayout.solver.widgets;
/* loaded from: classes.dex */
public class Rectangle {
    public int height;
    public int width;

    /* renamed from: x */
    public int f44x;

    /* renamed from: y */
    public int f45y;

    public void setBounds(int x, int y, int width, int height) {
        this.f44x = x;
        this.f45y = y;
        this.width = width;
        this.height = height;
    }

    void grow(int w, int h) {
        this.f44x -= w;
        this.f45y -= h;
        this.width += w * 2;
        this.height += h * 2;
    }

    boolean intersects(Rectangle bounds) {
        int i;
        int i2;
        int i3 = this.f44x;
        int i4 = bounds.f44x;
        return i3 >= i4 && i3 < i4 + bounds.width && (i = this.f45y) >= (i2 = bounds.f45y) && i < i2 + bounds.height;
    }

    public boolean contains(int x, int y) {
        int i;
        int i2 = this.f44x;
        return x >= i2 && x < i2 + this.width && y >= (i = this.f45y) && y < i + this.height;
    }

    public int getCenterX() {
        return (this.f44x + this.width) / 2;
    }

    public int getCenterY() {
        return (this.f45y + this.height) / 2;
    }
}
