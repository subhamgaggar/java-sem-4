package sem4_java;
import java.awt.*;




public class assignment5Main {
    public static void main(String[] args) {
        Circle circle =  new Circle(7);
        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        Triangle triangle = new Triangle(5 ,6 ,7);
        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());

        Rectangle rectangle = new Rectangle(7, 4);
        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());
    }
}




