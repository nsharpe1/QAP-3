public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String name, int a, int b, int c) {
        super(name);
        if(a+b > c || a+c>b || c+b>a){
            this.a = a;
            this.b = b;
            this.c = c;
        } else{
            System.out.println("Error Message!");
        }
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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getSValue() {
        double s = a + b + c / 2;
        return s;
    }

    public double getArea() {
        return (Math.sqrt(getSValue() * (getSValue() - a) * (getSValue() - b) * (getSValue() - c)));
    }

    public double getPerimeter() {
        return (a + b + c);
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Area: " + getArea() + " " + "Perimeter: " + getPerimeter();
    }
}