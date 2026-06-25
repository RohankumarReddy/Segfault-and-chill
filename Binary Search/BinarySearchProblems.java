import java.util.*;

public class BinarySearchProblems {

    // =========================================================
    // RECURSIVE BINARY SEARCH
    // =========================================================
    static int recursiveBS(int start, int end, int[] arr, int target) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return recursiveBS(mid + 1, end, arr, target);
        }

        return recursiveBS(start, mid - 1, arr, target);
    }

    public static void main(String[] args) {

        // =========================================================
        // 1. RECURSIVE BINARY SEARCH
        // =========================================================

        int[] arr = {-1, 0, 3, 4, 5, 9, 12};
        int target = 12;

        System.out.println(recursiveBS(0, arr.length - 1, arr, target));


        // =========================================================
        // 2. ITERATIVE BINARY SEARCH
        // =========================================================

        int[] arr1 = {-1, 0, 3, 4, 5, 9, 12};
        int target1 = 12;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                break;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }


        // =========================================================
        // 3. LOWER BOUND
        // First element >= target
        // =========================================================

        int[] arr2 = {-1, 0, 3, 4, 5, 9, 12};
        int target2 = 5;

        int start2 = 0;
        int end2 = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);


        // =========================================================
        // 4. UPPER BOUND
        // First element > target
        // =========================================================

        int[] arr3 = {-1, 0, 3, 4, 5, 9, 12};
        int target3 = 5;

        int start1 = 0;
        int end1 = arr.length - 1;
        int ans1 = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println(ans);


        // =========================================================
        // 5. FIRST AND LAST OCCURRENCE (BRUTE FORCE)
        // =========================================================

        int[] nums4 = {2, 4, 6, 8, 8, 8, 11, 13};
        int target4 = 8;

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums4.length; i++) {

            if (nums4[i] == target) {
                first = i;
                break;
            }
        }

        for (int i = nums4.length - 1; i >= 0; i--) {

            if (nums4[i] == target) {
                last = i;
                break;
            }
        }

        System.out.println("First = " + first);
        System.out.println("Last = " + last);


        // =========================================================
        // 6. FIND PEAK ELEMENT
        // =========================================================

        int[] nums = {1, 2, 3, 1};

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        System.out.println("Peak Index = " + low);


    }
}