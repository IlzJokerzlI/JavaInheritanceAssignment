public class Circle extends Shape {
    private final double pi = 3.14;
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filledStatus) {
        super(color, filledStatus);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return pi * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 2 * pi * this.radius;
    }

    @Override
    public String toString() {
        return  "A Circle with the radius of" + this.radius + ", is a subclass of " + super.toString();
    }
}
