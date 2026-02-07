import java.util.Scanner;

public class TWO_ConditionalsAndLoops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ================= IF–ELSE : SALARY CALCULATION =================
        int salaryInput = input.nextInt();

        if (salaryInput == 10000) {
            salaryInput += 25000;
        } else if (salaryInput == 15000) {
            salaryInput += 20000;
        } else if (salaryInput > 20000) {
            salaryInput += 4500;
        } else if (salaryInput > 10000) {
            salaryInput += 1000;
        } else {
            salaryInput = 100;
        }
        System.out.println("Salary is: " + salaryInput);

        // ================= WHILE LOOP =================
        int whileCounter = 1;
        while (whileCounter <= 5) {
            System.out.println(whileCounter);
            whileCounter++;
        }

        // ================= FOR LOOP =================
        for (int forCounter = 0; forCounter <= 5; forCounter++) {
            System.out.println(forCounter);
        }

        // ================= DO WHILE LOOP =================
        int doCounter = 1;
        do {
            System.out.println(doCounter);
            doCounter++;
        } while (doCounter <= 5);

        // ================= LARGEST OF THREE NUMBERS =================
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println(n1);
        } else if (n2 > n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

        // ================= CASE CHECK =================
        String wordInput = input.next();
        char firstChar = wordInput.trim().charAt(0);

        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

        // ================= FIBONACCI SERIES =================
        int fibCount = input.nextInt();
        int fibA = 0, fibB = 1;

        for (int i = 0; i < fibCount; i++) {
            System.out.println(fibA);
            int temp = fibA + fibB;
            fibA = fibB;
            fibB = temp;
        }

        // ================= COUNT OCCURRENCE OF DIGIT =================
        int number = input.nextInt();
        int digit = input.nextInt();
        int digitCount = 0;

        while (number > 0) {
            int rem = number % 10;
            if (rem == digit) {
                digitCount++;
            }
            number /= 10;
        }
        System.out.println(digitCount);

        // ================= REVERSE A NUMBER =================
        int revNum = 12345;
        int reversed = 0;

        while (revNum > 0) {
            int rem = revNum % 10;
            reversed = reversed * 10 + rem;
            revNum /= 10;
        }
        System.out.println(reversed);

        // ================= SIMPLE CALCULATOR =================
        double calcNum1 = input.nextDouble();
        double calcNum2 = input.nextDouble();

        System.out.println("Press 1 for Add");
        System.out.println("Press 2 for Subtract");
        System.out.println("Press 3 for Multiply");
        System.out.println("Press 4 for Divide");

        int operation = input.nextInt();
        double result;

        if (operation == 1) {
            result = calcNum1 + calcNum2;
            System.out.println("Result: " + result);

        } else if (operation == 2) {
            result = calcNum1 - calcNum2;
            System.out.println("Result: " + result);

        } else if (operation == 3) {
            result = calcNum1 * calcNum2;
            System.out.println("Result: " + result);

        } else if (operation == 4) {
            if (calcNum2 != 0) {
                result = calcNum1 / calcNum2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Division by zero not allowed");
            }
        } else {
            System.out.println("Invalid operation");
        }

        input.close();
    }
}
