import util.Input;

public class Shape {
    public static void main(String[] args) {
        Input user = new Input();
        System.out.println("Enter a radius for a cirle:");
        double radius = user.getInt();
        Circle circle = new Circle(radius);
        circle.printCircle();
    }
}
