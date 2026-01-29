import java.util.Arrays;

public class SEVEN_QuestionsOnArrays {

    public static void main(String[] args) {

        /* =============================
           1. SWAPPING ELEMENTS
           ============================= */

        int[] swapArray = {1, 2, 3};
        swap(swapArray, 1, 2);
        System.out.println(Arrays.toString(swapArray));


        /* =============================
           2. MAXIMUM ELEMENT IN ARRAY
           ============================= */

        int[] maxArray = {12, 3, 34, 4};
        System.out.println(max(maxArray));


        /* =============================
           3. REVERSING AN ARRAY
           ============================= */

        int[] reverseArray = {1, 2, 3, 4};
        reverse(reverseArray);
        System.out.println(Arrays.toString(reverseArray));
    }


    /* =============================
       SWAP METHOD
       ============================= */
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    /* =============================
       FIND MAXIMUM ELEMENT
       ============================= */
    static int max(int[] arr) {
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }


    /* =============================
       REVERSE ARRAY
       ============================= */
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
