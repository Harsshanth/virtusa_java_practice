package Problem3;

public class Circle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing Circle:)");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Erasing Circle:(");
    }
}
