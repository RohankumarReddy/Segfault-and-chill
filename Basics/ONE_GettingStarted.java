import java.util.Scanner;

public class ONE_GettingStarted {
    public static void  main(String[]args){
        // Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Basic output
        System.out.println("Hello");

        // Taking integer input and performing addition
        int a = 10;
        System.out.println("Enter a number");
        int ab = input.nextInt();
        int t = ab + a;
        System.out.println(t);

        // Different data types
        int roll = 12;
        String name = "Rohan";
        char letter = 'R';
        float f = 111.21F;
        double d = 11112312.1131231231232123213;
        long l = 13123123123123123L;
        boolean boo = true;

        // Type casting examples
        float num1 = input.nextInt();      // implicit type casting
        int num2 = (int) (22.3f);          // explicit type casting
        byte bytes = (byte) (112);         // narrowing type casting

        // While loop example
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        // For loop example
        for (int count1 = 5; count1 > 0; count1--) {
            if (count1 > 1) {
                System.out.println(count1);
            }
        }

        // Celsius to Fahrenheit conversion
        System.out.println("Enter Celsius");
        float celsius = input.nextFloat();
        System.out.println("Entered value: " + celsius);

        // Formula: Fahrenheit = (Celsius × 1.8) + 32
        float fahrenheit = (celsius * 1.8f) + 32;
        System.out.println("Degree Fahrenheit for the value entered is: " + fahrenheit);

        // Closing the scanner
        input.close();
    }

}
