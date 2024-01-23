import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number Fibonacci series: ");
        int x = scanner.nextInt();

        System.out.println("Fibonacci series " + x + " terms:");

        for (int i = 0; i < x; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
