public class Rectangle {
    private double width; 
    private double length;
    public Rectangle(double length) {
        this.width = 8;
        this.length = length;
    }
    public Rectangle() {
        this.width = 8;
        this.length = 4;
    }
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
}