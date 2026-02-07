import java.util.Scanner;

public class BasicMath {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        /* --------------------------------------------------
           1. Digit Extraction (Reverse order printing)
           -------------------------------------------------- */
        int extractNum = 1245;
        while (extractNum > 0) {
            int digit = extractNum % 10;
            System.out.print(digit);
            extractNum = extractNum / 10;
        }
        System.out.println();


        /* --------------------------------------------------
           2. Count Occurrence of a Digit in a Number
           -------------------------------------------------- */
        int numberToCheck = 1231232;
        int digitToCount = in.nextInt();   // digit to count
        int count = 0;

        while (numberToCheck > 0) {
            int digit = numberToCheck % 10;
            if (digit == digitToCount) {
                count++;
            }
            numberToCheck = numberToCheck / 10;
        }
        System.out.println(count);


        /* --------------------------------------------------
           3. Reverse a Number
           -------------------------------------------------- */
        int reverseInput = 1234;
        int reversed = 0;

        while (reverseInput != 0) {
            int digit = reverseInput % 10;
            reversed = reversed * 10 + digit;
            reverseInput = reverseInput / 10;
        }
        System.out.println(reversed);


        /* --------------------------------------------------
           4. Count Number of Digits
           -------------------------------------------------- */
        int digitCountInput = 1234;
        int digitCount = 0;

        while (digitCountInput > 0) {
            digitCount++;
            digitCountInput = digitCountInput / 10;
        }
        System.out.println(digitCount);


        /* --------------------------------------------------
           5. Palindrome Number Check
           -------------------------------------------------- */
        int palindromeNum = 121;
        int copyPalindrome = palindromeNum;
        int palindromeRev = 0;

        while (palindromeNum != 0) {
            int digit = palindromeNum % 10;
            palindromeRev = palindromeRev * 10 + digit;
            palindromeNum = palindromeNum / 10;
        }

        if (copyPalindrome == palindromeRev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        /* --------------------------------------------------
           6. Armstrong Number Check (3-digit)
           -------------------------------------------------- */
        int armstrongNum = 153;
        int copyArmstrong = armstrongNum;
        int armstrongSum = 0;

        while (armstrongNum != 0) {
            int digit = armstrongNum % 10;
            armstrongSum = armstrongSum + (digit * digit * digit);
            armstrongNum = armstrongNum / 10;
        }

        if (armstrongSum == copyArmstrong) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }


        /* --------------------------------------------------
           7. Factors of a Number
           -------------------------------------------------- */
        int factorNum = 35;
        for (int i = 1; i <= factorNum; i++) {
            if (factorNum % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        /* --------------------------------------------------
           8. GCD using Euclidean Algorithm
           -------------------------------------------------- */
        int gcdA = 20;
        int gcdB = 40;

        while (gcdA > 0 && gcdB > 0) {
            if (gcdA > gcdB) {
                gcdA = gcdA % gcdB;
            } else {
                gcdB = gcdB % gcdA;
            }
        }

        if (gcdA == 0) {
            System.out.println(gcdB);
        } else {
            System.out.println(gcdA);
        }
    }
}
