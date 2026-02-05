import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        /* ===============================
           ARRAY INITIALIZATION
           =============================== */
        int[] arr = {1, 33, 100, 45, 12, 13, 6};

        /* ===============================
           MERGE SORT
           =============================== */
        System.out.println(Arrays.toString(merge(arr)));

        /* ===============================
           SELECTION SORT
           =============================== */
        int[] arr1 = {1, 33, 100, 45, 12, 13, 6};
        for (int i = 0; i < arr1.length - 1; i++) {
            int min = i;

            for (int j = i; j < arr1.length; j++) {
                if (arr1[min] > arr1[j]) {
                    min = j;
                }
            }

            int temp = arr1[min];
            arr1[min] = arr1[i];
            arr1[i] = temp;
        }
        System.out.println(Arrays.toString(arr1));

        /* ===============================
           BUBBLE SORT
           =============================== */
        int[] arr2 = {1, 33, 100, 45, 12, 13, 6};
        int n2 = arr2.length;
        for (int i = n2 - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr2[j] > arr2[j + 1]) {
                    int temp = arr2[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr2));

        /* ===============================
           INSERTION SORT
           =============================== */
        int[] arr3 = {1, 33, 100, 45, 12, 13, 6};
        int n3 = arr3.length;

        for (int i = 1; i < n3; i++) {
            int j = i;
            while (j > 0 && arr3[j - 1] > arr3[j]) {
                int temp = arr3[j - 1];
                arr3[j - 1] = arr3[j];
                arr3[j] = temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr3));

        /* ===============================
           QUICK SORT
           =============================== */
        int[] arr4 = {1, 33, 100, 45, 12, 13, 6};
        sort(arr4, 0, arr4.length - 1);
        System.out.println(Arrays.toString(arr4));
    }

    /* ===============================
       MERGE SORT FUNCTIONS
       =============================== */
    static int[] merge(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
        int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));

        return merging(left, right);
    }

    static int[] merging(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k++] = first[i++];
            } else {
                mix[k++] = second[j++];
            }
        }

        while (i < first.length) {
            mix[k++] = first[i++];
        }

        while (j < second.length) {
            mix[k++] = second[j++];
        }

        return mix;
    }

    /* ===============================
       QUICK SORT FUNCTION
       =============================== */
    static void sort(int[] num, int low, int high) {
        if (low >= high) return;

        int start = low;
        int end = high;
        int mid = low + (high - low) / 2;
        int pivot = num[mid];

        while (start <= end) {
            while (num[start] < pivot) start++;
            while (num[end] > pivot) end--;

            if (start <= end) {
                int temp = num[start];
                num[start] = num[end];
                num[end] = temp;
                start++;
                end--;
            }
        }

        sort(num, low, end);
        sort(num, start, high);
    }
}
