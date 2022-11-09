package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i
 */
public class Solution {
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int recursiveBinarySearch(int nums[], int left, int right, int target) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) return mid;
        if (left == right) return -1;

        else if (nums[mid] > target) {
            return recursiveBinarySearch(nums, left, mid - 1, target);
        }
        else if (nums[mid] < target) {
            return recursiveBinarySearch(nums, mid + 1, right, target);
        }
        return -1;
    }

}


class SolutionTest {
    @Test
    public void testBinarySearch() {
        assertEquals(Solution.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 9), 4);
        assertEquals(Solution.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 2), -1);
        assertEquals(Solution.binarySearch(new int[]{-1, 0, 3, 5, 9, 12}, 3), 2);

    }

    @Test
    public void testRecursiveBinarySearch() {
        int arr[] = {-1, 0, 3, 5, 9, 12};
        assertEquals(Solution.recursiveBinarySearch(arr, 0, arr.length - 1, 9), 4);
        assertEquals(Solution.recursiveBinarySearch(arr, 0, arr.length - 1, 2), -1);
        assertEquals(Solution.recursiveBinarySearch(arr, 0, arr.length - 1, 3), 2);

    }
}