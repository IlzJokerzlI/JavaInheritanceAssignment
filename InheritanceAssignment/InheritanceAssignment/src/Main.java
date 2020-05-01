public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Color: " + shape.getColor());
        System.out.println("Fill: " + shape.isFilled());
        shape.setColor("red");
        shape.setFilledStatus(false);
        System.out.println(shape.toString());

        System.out.println();

        Circle circle = new Circle(857, "pink", true);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Parameter: " + circle.getPerimeter());
        circle.setRadius(1.0);
        circle.setColor("black");
        circle.setFilledStatus(false);
        System.out.println(circle.toString());

        System.out.println();

        Rectangle rectangle = new Rectangle(857, 578, "white", true);
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        rectangle.setLength(1.0);
        rectangle.setWidth(1.0);
        rectangle.setColor("Purple");
        rectangle.setFilledStatus(false);
        System.out.println(rectangle.toString());

        System.out.println();

        Square square = new Square(857, "blue", true);
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        square.setSide(10);
        square.setLength(1.0);
        square.setWidth(5.0);
        square.setColor("grey");
        square.setFilledStatus(false);
        System.out.println(square.toString());
    }
}
