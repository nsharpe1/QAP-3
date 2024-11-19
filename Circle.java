public class Circle extends Shape {
    public double radius = 1.0;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * Math.pow(radius, 2));
    }

    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Area: " + getArea() + " " + "Perimeter: " + getPerimeter();
    }
}