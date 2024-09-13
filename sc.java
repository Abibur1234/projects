import java.util.Scanner;
import java.text.DecimalFormat;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Principal amount, Interest rate, Time
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        
        // Calculate Simple Interest
        double simpleInterest = (principal * rate * time) / 100;
        
        // Output: Print Simple Interest rounded to two decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(simpleInterest));
        
        scanner.close();
    }
}
