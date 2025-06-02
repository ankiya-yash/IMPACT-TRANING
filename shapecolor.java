class shape {
    String color;

    public shape(String color) {
        this.color = color;

    }
    void displayColor(){
        System.out.println("color" + color);
    }
    
}
class Circle extends shape{
    double radius;

    public Circle(String color , double radius) {
        super(color);
        this.radius = radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }

    void display(){
        displayColor();
        System.out.println("Radius" + radius);
        System.out.println("Area" + area());

    }
    
}
public class shapecolor{
    public static void main(String[] args) {
        Circle c = new Circle("Red" , 5.0);
        c.display();
    }
}
