import java.util.*;

public class bsOnAnswers {

    // ==========================================================
    // Koko Bananas
    // ==========================================================

    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;
        for (int x : piles) {
            max = Math.max(x, max);
        }

        int low = 0;
        int high = max;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int totalhrs = 0;

            for (int pile : piles) {
                totalhrs += (int) Math.ceil((double) pile / mid);
            }

            if (totalhrs <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // ==========================================================
    // Minimum Number of Days to Make m Bouquets
    // ==========================================================

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    // ==========================================================
    // Helper - Can Make Bouquets
    // ==========================================================

    public boolean canMake(int[] bloomDay, int m, int k, int day) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }

            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }

    // ==========================================================
    // Find the Smallest Divisor Given a Threshold
    // ==========================================================

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            for (int num : nums) {
                sum += (int) Math.ceil((double) num / mid);
            }

            if (sum <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // ==========================================================
    // Capacity to Ship Packages Within D Days
    // ==========================================================

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for (int x : weights) {
            low = Math.max(low, x);
            high += x;
        }

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int need = 1;
            int cap = 0;

            for (int x : weights) {

                if (x + cap <= mid) {
                    cap += x;
                } else {
                    need++;
                    cap = x;
                }
            }

            if (need <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // ==========================================================
    // Kth Missing Positive Number
    // ==========================================================

    public int findKthPositive(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {
            set.add(x);
        }

        int count = 0;
        int max = arr[arr.length - 1];

        for (int i = 1; i <= max + k; i++) {

            if (!set.contains(i)) {
                count++;
            }

            if (count == k) {
                return i;
            }
        }

        return -1;
    }

    // ==========================================================
    // Median of 2 Sorted Arrays of Different Sizes
    // ==========================================================

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int x : nums1) {
            a.add(x);
        }

        for (int y : nums2) {
            a.add(y);
        }

        Collections.sort(a);

        int n = a.size();

        if (n % 2 == 0) {
            return (a.get(n / 2) + a.get(n / 2 - 1)) / 2.0;
        } else {
            return a.get(n / 2);
        }
    }
}