package Problem3;

public class Square extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing Square :)");
    }

    @Override
    public void erase() {
        super.erase();
        System.out.println("Erasing Square :(");
    }

}
