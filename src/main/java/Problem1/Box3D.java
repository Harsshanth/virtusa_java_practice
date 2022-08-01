package Problem1;

public class Box3D extends Box {
    int height;
    Box3D() {
        super();
        this.height = 0;
    }
    Box3D(int length, int breadth) {
        super(length, breadth);
    }

    Box3D(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public int volume() {
        return length * breadth * height;
    }
}
