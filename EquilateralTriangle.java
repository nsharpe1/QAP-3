public class EquilateralTriangle extends Shape {
    private double a;

    public EquilateralTriangle(String name, double a){
        super(name);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        return (Math.sqrt(3) / 4 * Math.pow(a, 2));
    }

    public double getPerimeter() {
        return (3 * a);
    }

    @Override
    public String toString() {
    
        return super.toString() + " " + "Area: " + getArea() + " " + "Perimeter: " + getPerimeter();
    }
}