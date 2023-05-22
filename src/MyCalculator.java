// 1. import scanner
import java.util.Scanner;
public class MyCalculator {

    // 6. method 1 to add
    static int plusMethod(int x, int y){
        return x + y;
    }

    // 7. method 2 to subtract
    static int minMethod(int x, int y){
        return x - y;
    }

    // 8. method 3 to multiply
    static int multMethod(int x, int y){
        return x * y;
    }

    // 9. method 4 to divide
    static double divMethod(double x, double y){
        return x / y;
    }


    // main method
    public static void main(String[] args) {
        // 2. create object scanner
        Scanner reader = new Scanner(System.in);
        // 3. ask user to enter two numbers (int)
        System.out.println("WELCOME TO CALCULATOR PROGRAM");
        System.out.println("Enter first number : ");
        int num1 = reader.nextInt();
        System.out.println("Enter second number :");
        // 4. read user input as num1 and num2
        int num2 = reader.nextInt();
        // 10. now, call the methods to print all results of math. operations
        System.out.println(num1 + " + " + num2 + " equals " + plusMethod(num1, num2));
        System.out.println(num1 + " - " + num2 + " equals " + minMethod(num1, num2));
        System.out.println(num1 + " x " + num2 + " equals " + multMethod(num1, num2));
        System.out.println(num1 + " : " + num2 + " equals " + divMethod((double)num1, (double)num2));

    }// end of main
}
