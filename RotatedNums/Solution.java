package RotatedNums;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
/*
https://leetcode.com/problems/rotate-array/
 */
public class Solution {
    public static int [] rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }


    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}





class TestSolution{
    @Test
    public void testRemoveDuplicates (){
        assertArrayEquals(Solution.rotate(new int[]{1,2,3,4,5,6,7}, 3), new int[] {5,6,7,1,2,3,4});
        assertArrayEquals(Solution.rotate(new int[]{-1,-100,3,99},  2), new int[] {3,99,-1,-100});
        assertArrayEquals(Solution.rotate(new int[]{1,2}, 3), new int[] {2,1});




    }
}