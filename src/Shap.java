abstract class Shap {

    public abstract void calcArea();
    public abstract void calcPermiters();
}

//Rectangle
class Rectangle extends Shap{
    double width;
    double hight;


    @Override
    public void calcArea() {

        double areaOfReg = width * hight;
        System.out.println(areaOfReg);
    }

    @Override
    public void calcPermiters() {

        double permitersOfReg = 2 * (width + hight);
        System.out.println(permitersOfReg);
    }


}
//Triangle
class Triangle extends Shap{
    double base;
    double trianHight;

    double sideA;
    double sideB;
    double sideC;

    @Override
    public void calcArea() {
        double areaOfTrin = 0.5 * (base * trianHight);
        System.out.println(areaOfTrin);
    }

    @Override
    public void calcPermiters() {
        double permitersOfTrin = sideA + sideB + sideC;
        System.out.println(permitersOfTrin);
    }
}

//Circle
class Circle extends Shap{

    double by = 3.14;
    double radius;



    @Override
    public void calcArea() {
        double areaOfCircle = by * radius * radius;
        System.out.println(areaOfCircle);
    }

    @Override
    public void calcPermiters() {
        double permitersOfCircle = 2 * radius * by;
        System.out.println(permitersOfCircle);
    }
}