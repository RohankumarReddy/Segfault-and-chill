import java.util.HashSet;
//Largest element in an array
//
//Second largest element in an array
//
//Check if array is sorted
//
//Left rotation of array by 1
//
//Linear search
//
//Union of two arrays using HashSet
//
//Intersection of two arrays
//
//Find missing number (1 to N)
//
//Longest subarray with sum = K (brute force)

public class ArraysForDSA {

    public static void main(String[] args) {

        // ===============================
        // 1. Largest Element in Array
        // ===============================
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 32, 51, 66};
        int maxIndex = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr1[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Largest element: " + arr1[maxIndex]);

        // ===============================
        // 2. Second Largest Element
        // ===============================
        int maxVal = arr1[0];
        int secondMax = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > maxVal) {
                maxVal = arr1[i];
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > secondMax && arr1[i] < maxVal) {
                secondMax = arr1[i];
            }
        }
        System.out.println("Second largest: " + secondMax);

        // ===============================
        // 3. Check if Array is Sorted
        // ===============================
        boolean isSorted = true;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] > arr1[i + 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println("Is sorted: " + isSorted);

        // ===============================
        // 4. Left Rotate Array by 1
        // ===============================
        int tempLeft = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            arr1[i - 1] = arr1[i];
        }
        arr1[arr1.length - 1] = tempLeft;

        // ===============================
        // 5. Linear Search
        // ===============================
        int target = 4;
        boolean found = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == target) {
                found = true;
                break;
            }
        }
        System.out.println("Target found: " + found);

        // ===============================
        // 6. Union of Two Arrays (Using HashSet)
        // ===============================
        int[] unionA = {1, 2, 3, 4, 5, 6};
        int[] unionB = {2, 3, 4, 5, 6, 7, 8, 9};

        HashSet<Integer> unionSet = new HashSet<>();
        for (int x : unionA) {
            unionSet.add(x);
        }
        for (int y : unionB) {
            unionSet.add(y);
        }
        System.out.println("Union: " + unionSet);

        // ===============================
        // 7. Intersection of Two Arrays
        // ===============================
        int[] interA = {1, 2, 3, 4};
        int[] interB = {2, 3, 4};

        HashSet<Integer> interSet = new HashSet<>();
        for (int i = 0; i < interA.length; i++) {
            for (int j = 0; j < interB.length; j++) {
                if (interA[i] == interB[j]) {
                    interSet.add(interA[i]);
                }
            }
        }
        System.out.println("Intersection: " + interSet);

        // ===============================
        // 8. Missing Number (1 to N)
        // ===============================
        int[] missArr = {8, 2, 4, 5, 3, 7, 1};
        int size = missArr.length + 1;

        for (int i = 1; i <= size; i++) {
            boolean present = false;

            for (int j = 0; j < missArr.length; j++) {
                if (missArr[j] == i) {
                    present = true;
                    break;
                }
            }

            if (!present) {
                System.out.println("Missing number: " + i);
                break;
            }
        }

        // ===============================
        // 9. Longest Subarray with Sum K (Brute Force)
        // ===============================
        int[] subArr = {1, 2, 11, 1, 1, 1};
        int k = 3;
        System.out.println("Longest subarray length: " + sub(subArr, k));
    }

    // ===============================
    // Helper Method: Longest Subarray Sum = K
    // ===============================
    static int sub(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }
}
