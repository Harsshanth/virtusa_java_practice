package Problem3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Square square = new Square();
        circle.draw();
        triangle.draw();
        square.draw();
        circle.erase();
        triangle.erase();
        square.erase();

    }
}
