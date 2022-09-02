package Shape;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input user = new Input();
        System.out.println("Enter a radius for a cirle:");
        double radius = user.getInt();
        CircleApp circle = new CircleApp(radius);
        circleApp.printCircleApp();
    }



}
