import java.sql.SQLOutput;

public class Example2 {
    // method 1, passing 1 parameter
    static void myMethod(String fName, int age){
        System.out.println(fName + " Potter" + ", age " + age);
    }

    // method 2, passing 2 parameters
    static void myMethod(String fName, String lName){
        System.out.println(fName + " " + lName);
    }

    // create method 3, passing 3 parameters fName, mName, lName
    static void myMethod(String fName, String mName, String lName){
        System.out.println(fName + " " + mName + " " + lName);
    }
    // main method
    public static void main(String[] args) {
        // pass on parameters values
        myMethod("James", 45);
        myMethod("Lilly", 40);
        myMethod("Harry", 5);
        myMethod("Ginny", 1);
        myMethod("Albus", "Dumbledore");
        myMethod("Draco", "Lucius", "Malfoy");
    }
}
