public class Main {
    public static void main(String [] argv){
        AreaCalculator calculator = new AreaCalculator();

        Circle circle = new Circle(0.7);
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println("Area circle = " + calculator.calculateArea(circle));

        System.out.println("Area Rectangle = " + calculator.calculateArea(rectangle));
    }
}
