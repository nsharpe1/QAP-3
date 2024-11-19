public class Ellipse extends Shape {
    private int a;
    private int b;

    public Ellipse(String name, int  a, int b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getPerimeter() {
        return (Math.PI * Math.sqrt(2 * (Math.pow(a,2) + Math.pow(b,2)) - Math.pow(a - b,2) / 2));
    }

    public double getArea() {
        return (Math.PI * a * b);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Area: " + getArea() + " " + "Perimeter: " + getPerimeter();
    }
}