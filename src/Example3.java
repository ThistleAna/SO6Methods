// QS 8, PlusMethod
public class Example3 {
    // method 1 : my own method to add a number to 5
    static int plusMethod(int x){
        return x + 5;
    }

    // method 2: add x + y and return the result
    static int plusMethod(int x, int y){
        return x + y;
    }

    // method 3: overload the add method with different x y datatypes
    static double plusMethod(double x, double y){
        return x + y;
    }
    // main method
    public static void main(String[] args) {
        System.out.println(plusMethod(4));// 4 + 5
        System.out.println(plusMethod(5)); // 5 + 5
        System.out.println(plusMethod(300, 500)); // 800

        System.out.println(plusMethod(23.6, 45.8));
        // print out with different scenarios
        int myNum1 = plusMethod(8, 5);
        System.out.println(myNum1);
    }
}
