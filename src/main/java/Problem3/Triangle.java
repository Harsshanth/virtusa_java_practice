package Problem3;

public class Triangle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing Triangle :)");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Erasing Triangle :(");
    }
}
