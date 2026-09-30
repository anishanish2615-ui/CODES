package DSA;
import java.util.*;

public class split {

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // Find the maximum element and total sum
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // Binary search between max element and total sum
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        int result = splitArray(nums, k);
        System.out.println("Minimum largest sum after splitting: " + result);
    }
}

