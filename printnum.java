import java.util.Scanner;

public class PrintInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            System.out.println(A);
        }
        
        scanner.close();
    }
}
