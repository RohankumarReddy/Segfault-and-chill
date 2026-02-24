import java.util.*;

public class Arrays_Medium {

    public static void main(String[] args) {

        // 1. Two Sum (Brute Force)
        int[] arr1 = {2, 6, 5, 8, 11};
        boolean foundPair = false;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == 14) {
                    foundPair = true;
                    System.out.println(foundPair + " " + i + " " + j);
                }
            }
        }


        // 2. Dutch National Flag (Sort 0s,1s,2s)
        int[] arr2 = {2, 0, 2, 1, 1, 0};
        int low = 0, mid = 0, high = arr2.length - 1;

        while (mid <= high) {
            if (arr2[mid] == 0) {
                int temp = arr2[low];
                arr2[low] = arr2[mid];
                arr2[mid] = temp;
                low++;
                mid++;
            } else if (arr2[mid] == 1) {
                mid++;
            } else {
                int temp = arr2[high];
                arr2[high] = arr2[mid];
                arr2[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr2));


        // 3. Majority Element (Using HashMap)
        int[] arr3 = {1,2,3,2,4,2,5,2,6,2};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : arr3){
            map.put(x, map.getOrDefault(x,0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key) >= arr3.length/2){
                System.out.println(key);
            }
        }


        // 4. Best Time to Buy and Sell Stock
        int[] arr4 = {7,1,5,3,6,4};
        int minPrice = arr4[0];
        int maxProfit = 0;

        for (int i = 1; i < arr4.length; i++) {
            if(arr4[i] < minPrice){
                minPrice = arr4[i];
            }
            int profit = arr4[i] - minPrice;
            if (profit > maxProfit){
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);


        // 5. Rearrange Array Elements by Sign
        int[] arr5 = {3,1,-2,-5,2,-4};
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i] > 0){
                pos.add(arr5[i]);
            } else {
                neg.add(arr5[i]);
            }
        }

        for (int i = 0; i < arr5.length/2; i++) {
            arr5[2*i] = pos.get(i);
            arr5[2*i+1] = neg.get(i);
        }

        System.out.println(Arrays.toString(arr5));


        // 6. Leaders in an Array
        int[] arr6 = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = arr6[arr6.length - 1];
        leaders.add(maxRight);

        for (int i = arr6.length - 2; i >= 0; i--) {
            if (arr6[i] > maxRight) {
                leaders.add(arr6[i]);
                maxRight = arr6[i];
            }
        }

        System.out.println(leaders);


        // 7. Longest Consecutive Sequence (Brute Force)
        int[] arr7 = {100, 4, 200, 1, 3, 2};
        int longest = 1;

        for (int i = 0; i < arr7.length; i++) {
            int x = arr7[i];
            int count = 1;

            while (true) {
                boolean found = false;

                for (int j = 0; j < arr7.length; j++) {
                    if (arr7[j] == x + 1) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    x = x + 1;
                    count++;
                } else {
                    break;
                }
            }

            longest = Math.max(longest, count);
        }

        System.out.println(longest);


        // 8. Spiral Matrix
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int top = 0, bottom = matrix1.length - 1;
        int left = 0, right = matrix1[0].length - 1;

        List<Integer> spiral = new ArrayList<>();

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                spiral.add(matrix1[top][i]);
            top++;

            for (int i = top; i <= bottom; i++)
                spiral.add(matrix1[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    spiral.add(matrix1[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    spiral.add(matrix1[i][left]);
                left++;
            }
        }

        System.out.println(spiral);


        // 9. Rotate Matrix by 90 Degrees
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix2.length;
        int[][] rotated = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - i - 1] = matrix2[i][j];
            }
        }

        for (int i = 0; i < rotated.length; i++) {
            for (int j = 0; j < rotated[0].length; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }


        // 10. Subarray Sum Equals K (Brute Force)
        int[] arr8 = {3, 1, 2, 4};
        int target = 6;
        int countSub = 0;

        for (int i = 0; i < arr8.length; i++) {
            for (int j = i; j < arr8.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr8[k];
                }
                if (sum == target) {
                    countSub++;
                }
            }
        }

        System.out.println(countSub);
    }


    // 11. Kadane's Algorithm (Maximum Subarray Sum)
    static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}