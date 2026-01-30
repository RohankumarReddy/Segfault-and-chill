public class EIGHT_Patterns {

    public static void main(String[] args) {

        // Uncomment ONE pattern call at a time to test

        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        // pattern4(5);
        // pattern5(4);
        // pattern6(4);

        pattern7(5);   // currently running
    }

    // --------------------------------------------------
    // Pattern 1: Right-angled triangle (*)
    // Output (n=5):
    // *
    // **
    // ***
    // ****
    // *****
    // --------------------------------------------------
    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // --------------------------------------------------
    // Pattern 2: Square pattern (*)
    // Output (n=5):
    // *****
    // *****
    // *****
    // *****
    // *****
    // --------------------------------------------------
    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // --------------------------------------------------
    // Pattern 3: Inverted right triangle (*)
    // Output (n=5):
    // ****
    // ***
    // **
    // *
    // --------------------------------------------------
    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n - row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // --------------------------------------------------
    // Pattern 4: Number triangle
    // Output (n=5):
    // 1
    // 12
    // 123
    // 1234
    // 12345
    // --------------------------------------------------
    static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // --------------------------------------------------
    // Pattern 5: Number diamond (without spaces)
    // Output (n=4):
    // 1
    // 12
    // 123
    // 1234
    // 123
    // 12
    // 1
    // --------------------------------------------------
    static void pattern5(int n){
        for(int row = 1; row <= 2*n - 1; row++){
            int total = row > n ? 2*n - row : row;
            for(int col = 1; col <= total; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    // --------------------------------------------------
    // Pattern 6: Star Diamond (center aligned)
    // Output (n=4):
    //    *
    //   * *
    //  * * *
    // * * * *
    //  * * *
    //   * *
    //    *
    // --------------------------------------------------
    static void pattern6(int n){
        for(int row = 1; row <= 2*n - 1; row++){

            int stars = row > n ? 2*n - row : row;
            int spaces = n - stars;

            for(int i = 1; i <= spaces; i++){
                System.out.print(" ");
            }

            for(int i = 1; i <= stars; i++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // --------------------------------------------------
    // Pattern 7: Palindrome Star Pyramid
    // Output (n=5):
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    // --------------------------------------------------
    static void pattern7(int n){
        for(int row = 1; row <= n; row++){

            // spaces
            for(int spaces = 0; spaces < n - row; spaces++){
                System.out.print(" ");
            }

            // left part
            for(int col = row; col >= 1; col--){
                System.out.print("*");
            }

            // right part
            for(int col = 2; col <= row; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
