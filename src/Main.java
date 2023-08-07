public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.hight = 16;
        rectangle.width = 17;
        rectangle.calcArea();
        rectangle.calcPermiters();

        System.out.println("=======");

        Circle circle = new Circle();
        circle.radius = 6;
        circle.calcArea();
        circle.calcPermiters();

        System.out.println("=======");

        Triangle triangle = new Triangle();
        triangle.base = 6;
        triangle.trianHight = 6;
        triangle.calcArea();

        triangle.sideA = 2;
        triangle.sideB = 2;
        triangle.sideC = 2;
        triangle.calcPermiters();
    }
}