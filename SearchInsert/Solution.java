package SearchInsert;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/search-insert-position/
 */
public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return left;

    }
}

class SolutionTest {
    @Test
    public void testSearchInsert() {
        assertEquals(Solution.searchInsert(new int[]{1}, 2), 1);
        assertEquals(Solution.searchInsert(new int[]{1, 3, 5, 6}, 5), 2);
        assertEquals(Solution.searchInsert(new int[]{1, 3, 5, 6}, 7), 4);


    }
}