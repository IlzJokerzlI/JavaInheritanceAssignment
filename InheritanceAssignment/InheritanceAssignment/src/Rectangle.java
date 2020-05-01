public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        super();
        this.length = (length > 0) ? length : 1.0;
        this.width = (width > 0) ? width : 1.0;
    }

    public Rectangle(double length, double width, String color, boolean filledStatus) {
        super(color, filledStatus);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "A rectangle with the length of " + this.length + " and the width of " + this.width + " is a subclass of " + super.toString();
    }
}
