abstract class Shape {
    int n1, n2;
    abstract void printArea();
}
class Rectangle extends Shape {
    int x, y, z;
    void printArea() {
        z=x*y;
        System.out.println("Area of Rectangle = "+z);
    }
}
class Triangle extends Shape {
    double z;
    int x, y;
    void printArea() {
        z=(0.5)*x*y;
        System.out.println("Area of Triangle = "+z);
    }
}
class Circle extends Shape {
    double z;
    int x;
    void printArea() {
        z=(3.14)*x*x;
        System.out.println("Area of Circle = "+z);
    }
}
class ShapesAreaUsingAbstract {
    public static void main(String s[]) {
        Rectangle r = new Rectangle();
        r.x=4;
        r.y=3;
        r.printArea();
        Triangle t = new Triangle();
        t.x=4;
        t.y=3;
        t.printArea();
        Circle c = new Circle();
        c.x=4;
        c.printArea();
    }
}