class Main {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle(10, 20);
        shape1.printArea(); 
        
        Triangle shape2 = new Triangle(30, 40);
        shape2.printArea();  
        
        Circle shape3 = new Circle(1);
        shape3.printArea();  
    }
}

abstract class Shape {
    int a;
    int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Rectangle is: " + (a * b));
    }
}

class Triangle extends Shape {
    public Triangle(int a, int b) {
        super(a, b);
    }

    void printArea() {
        System.out.println("Area of Triangle is: " + (0.5 * a * b));
    }
}

class Circle extends Shape {
    public Circle(int r) {
        super(r, 0); 
    }

    void printArea() {
        System.out.println("Area of Circle is: " + (3.14 * a * a)); 
    }
}
output:
Area of Rectangle is: 200
Area of Triangle is: 600.0
Area of Circle is: 3.14

=== Code Execution Successful ===