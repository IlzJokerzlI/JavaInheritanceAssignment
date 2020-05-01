public class Square extends Rectangle{
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filledStatus) {
        super(side, side, color, filledStatus);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return "A square with the side of " + super.getLength() + " is a subclass of " + super.toString();
    }
}
