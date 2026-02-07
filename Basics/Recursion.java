import java.util.Arrays;
import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* --------------------------------------------------
           1. Print a name N times using recursion
           -------------------------------------------------- */
        printName(1, 5);


        /* --------------------------------------------------
           2. Print numbers from 1 to N (linear recursion)
           -------------------------------------------------- */
        printLinear(1, 5);
        System.out.println();


        /* --------------------------------------------------
           3. Print numbers from N to 1 (reverse recursion)
           -------------------------------------------------- */
        printReverse(5);
        System.out.println();


        /* --------------------------------------------------
           4. Print numbers from 1 to N (backtracking)
           -------------------------------------------------- */
        printBacktrack(5);
        System.out.println();


        /* --------------------------------------------------
           5. Sum of first N numbers using recursion
           -------------------------------------------------- */
        sumN(5, 0);


        /* --------------------------------------------------
           6. Factorial using recursion
           -------------------------------------------------- */
        int factResult = factorial(5);
        System.out.println(factResult);


        /* --------------------------------------------------
           7. Reverse an array using recursion
           -------------------------------------------------- */
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(0, arr, arr.length);
        System.out.println(Arrays.toString(arr));


        /* --------------------------------------------------
           8. Palindrome check using recursion
           -------------------------------------------------- */
        String str = "madam";
        boolean isPalin = isPalindrome(0, str, str.length());
        System.out.println(isPalin);


        /* --------------------------------------------------
           9. Fibonacci number (iterative)
           -------------------------------------------------- */
        fib(7);
    }


    /* --------------------------------------------------
       Function Definitions
       -------------------------------------------------- */

    // 1. Print name N times
    static void printName(int current, int limit) {
        if (current > limit) {
            return;
        }
        System.out.println("Rohan");
        printName(current + 1, limit);
    }

    // 2. Print 1 to N
    static void printLinear(int current, int limit) {
        if (current > limit) {
            return;
        }
        System.out.print(current + " ");
        printLinear(current + 1, limit);
    }

    // 3. Print N to 1
    static void printReverse(int num) {
        if (num < 1) {
            return;
        }
        System.out.print(num + " ");
        printReverse(num - 1);
    }

    // 4. Print 1 to N using backtracking
    static void printBacktrack(int num) {
        if (num < 1) {
            return;
        }
        printBacktrack(num - 1);
        System.out.print(num + " ");
    }

    // 5. Sum of first N numbers
    static void sumN(int num, int sum) {
        if (num < 1) {
            System.out.println(sum);
            return;
        }
        sumN(num - 1, sum + num);
    }

    // 6. Factorial
    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    // 7. Reverse array using recursion
    static void reverseArray(int index, int[] arr, int size) {
        if (index >= size / 2) {
            return;
        }
        int temp = arr[index];
        arr[index] = arr[size - index - 1];
        arr[size - index - 1] = temp;

        reverseArray(index + 1, arr, size);
    }

    // 8. Palindrome check
    static boolean isPalindrome(int index, String str, int length) {
        if (index >= length / 2) {
            return true;
        }
        if (str.charAt(index) != str.charAt(length - index - 1)) {
            return false;
        }
        return isPalindrome(index + 1, str, length);
    }

    // 9. Fibonacci (iterative version)
    static void fib(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;

        if (n == 0) {
            System.out.println(0);
            return;
        }

        for (int i = 2; i <= n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        System.out.println(sum);
    }
}
