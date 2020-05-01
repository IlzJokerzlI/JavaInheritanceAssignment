public class Shape {
    private String color;
    private boolean isFilled;

    public Shape() {
        this("green", true);
    }

    public Shape(String color, boolean filledStatus) {
        this.color = color;
        this.isFilled = filledStatus;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setFilledStatus(boolean filledStatus) {
        this.isFilled = filledStatus;
    }

    @Override
    public String toString() {
        return "A Shape with " + this.color + " color and " + ((this.isFilled) ? "is filled" : "is not filled.");
    }
}
