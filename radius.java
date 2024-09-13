import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        
        if (radius < 0) {
            System.out.println("Error");
        } else {
            double circumference = 2 * Math.PI * radius;
            System.out.printf("%.2f%n", circumference);
        }
        
        scanner.close();
    }
}
