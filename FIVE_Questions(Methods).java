import java.util.Scanner;

public class FIVE_Questions {

    // Main Method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = in.nextInt();

        if (isPrime(a)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

        int num = 153;
        if (ams(num) == num) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        all();
    }

    // Prime Number Checking Method
    static boolean isPrime(int a) {
        if (a <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= a) {
            if (a % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

    // Armstrong Calculation Method
    static int ams(int a) {
        int ans = 0;

        while (a > 0) {
            int rem = a % 10;
            ans = ans + rem * rem * rem;
            a = a / 10;
        }
        return ans;
    }

    // Printing Armstrong Numbers Between 100 and 999
    static void all() {
        for (int i = 100; i < 1000; i++) {
            if (ams(i) == i) {
                System.out.println(i + " is armstrong");
            } else {
                System.out.println(i + " not armstrong");
            }
        }
    }
}
