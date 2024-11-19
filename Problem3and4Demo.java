public class Problem3and4Demo {
    public static void main(String[] args) {
        Ellipse e1 = new Ellipse("Ellipse 1",10, 5);
        Circle c1 = new Circle("Circle 1",5.0);
        Triangle t1 = new Triangle("Triangle 1",6, 8, 10);
        EquilateralTriangle et1 = new EquilateralTriangle("Equilateral Triangle 1", 5);

        Shape[] arr = {e1,c1,t1,et1};

        for(Shape shape: arr){
            System.out.println(shape);
        }
    }
}
