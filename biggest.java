import java.util.Scanner;

public class biggest
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("num1: ");
        double num1 = scanner.nextDouble();

        System.out.println("num2: ");
        double num2 = scanner.nextDouble();

        System.out.println("num3: ");
        double num3 = scanner.nextDouble();

       if(num1>num2 && num1>num3)
       {
        System.out.println("num 1 is greater");
       }
       else if(num2>num1 && num2>num3)
       {
        System.out.println("num 2 is greater");
       }
       else
       {
        System.out.println("num 3 is greater");
       }
    }
}
