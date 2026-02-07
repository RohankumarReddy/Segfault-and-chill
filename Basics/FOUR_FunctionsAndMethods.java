import java.util.Arrays;

public class FOUR_FunctionsAndMethods {

    // Static data member
    static int staticValue = 33;

    // Main method
    public static void main(String[] args) {

        // Method overloading demonstration
        funny("R", "U");
        funny(1, 4);

        // Varargs examples
        fun(4, 5, 2, 2, 32, 2, 32, 212, 12, 2);
        fun2(4, 5, 2, 2, 32, 2, 32, 212, 12, 2);

        // Shadowing example
        int shadowValue = 222; // local variable shadows class staticValue
        System.out.println("Shadowed value: " + shadowValue);
        System.out.println("Static value: " + staticValue);
    }

    // Varargs method
    static void fun(int... values) {
        System.out.println("Varargs values: " + Arrays.toString(values));
    }

    // Varargs with fixed parameters
    static void fun2(int first, int second, int... values) {
        int sum = first + second;
        for (int num : values) {
            sum += num;
        }
        System.out.println("Sum with varargs: " + sum);
    }

    // Method overloading with integers
    static void funny(int num1, int num2) {
        System.out.println("Sum of integers: " + (num1 + num2));
    }

    // Method overloading with strings
    static void funny(String text1, String text2) {
        System.out.println("Concatenated strings: " + text1 + text2);
    }
}
