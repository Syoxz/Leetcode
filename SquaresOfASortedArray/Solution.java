package SquaresOfASortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

/*
https://leetcode.com/problems/squares-of-a-sorted-array/submissions/
 */
public class Solution {

    public static int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] sortedSquaresArray = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) >= Math.abs(nums[right])) {
                sortedSquaresArray[i] = nums[left] * nums[left];
                left++;

            } else {
                sortedSquaresArray[i] = nums[right] * nums[right];
                right--;
            }
        }
        return sortedSquaresArray;
    }
}


class TestSolution {
    @Test
    public void testSortedSquares() {
        assertArrayEquals(Solution.sortedSquares(new int[]{-4, -1, 0, 3, 10}), new int[]{0, 1, 9, 16, 100});
        assertArrayEquals(Solution.sortedSquares(new int[]{-7, -3, 2, 3, 11}), new int[]{4, 9, 9, 49, 121});
        assertArrayEquals(Solution.sortedSquares(new int[]{-3, -1, 1, 2, 9}), new int[]{1, 1, 4, 9, 81});

    }
}
