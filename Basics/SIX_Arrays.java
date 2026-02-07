import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SIX_Arrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* =============================
           1. ONE-DIMENSIONAL ARRAY
           ============================= */

        // Declaration and initialization
        int[] numbers = new int[5];

        // Input values into array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Output array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();


        /* =============================
           2. STRING ARRAY
           ============================= */

        String[] names = new String[3];

        // Input strings
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }

        // Print using Arrays utility
        System.out.println(Arrays.toString(names));


        /* =============================
           3. TWO-DIMENSIONAL ARRAY
           ============================= */

        int[][] matrix = new int[2][2];

        // Input 2D array
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = input.nextInt();
            }
        }

        // Output 2D array
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }


        /* =============================
           4. DYNAMIC ARRAY (ArrayList)
           ============================= */

        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(112);
        list.add(123);
        list.add(3);
        list.add(21);

        // Modifying elements
        list.set(2, 12);
        list.remove(1);

        // Checking element
        System.out.println(list.contains(3));

        // Printing ArrayList
        System.out.println(list);

        /*
         NOTE:
         ArrayList is dynamic because it automatically resizes
         when elements are added or removed.
         It provides built-in methods like add, remove, set, contains,
         making it more flexible than arrays.
        */

        input.close();
    }
}
