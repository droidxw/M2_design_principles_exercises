package patterns.creational.prototype;

import java.util.ArrayList;

public class Application
{
    ArrayList<Shape> shapes;

    public Application()
    {
        shapes = new ArrayList<>();

        Shape circle = new Circle();
        circle.setX(10);
        circle.setY(10);
        ((Circle) circle).setRadius(20);
        shapes.add(circle);

        Shape anotherCircle = circle.clone();
        shapes.add(anotherCircle);

        Shape rectangle = new Rectangle();
        ((Rectangle) rectangle).setWidth(10);
        ((Rectangle) rectangle).setHeight(20);
        shapes.add(rectangle);
    }

    public void businessLogic() {
        ArrayList<Shape> shapesCopy = new ArrayList<>();

        for (Shape shape: shapes) {
            shapesCopy.add(shape.clone());
        }

        System.out.println("Original shapes:");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }

        System.out.println("Cloned shapes:");
        for (Shape shape: shapesCopy) {
            System.out.println(shape);
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.businessLogic();
    }
}
