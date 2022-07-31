package Problem1;

public class Box {
    public int length, breadth;
    public Box(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Box() {
        this.length = this.breadth = 0;
    }

    public int area() {
        int res = length * breadth;
        return res;
    }
}
