package TwoSum;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.assertArrayEquals;
/*
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int searchedNum = target - nums[i];
            if (map.containsKey(searchedNum)) {
                return new int[]{map.get(searchedNum), i};
            }
            map.put(nums[i], i);
        }
        throw new RuntimeException("There must be a solution");
    }
}


class SolutionTest {

    @Test
    public void testTwoSum() {
        assertArrayEquals((Solution.twoSum(new int[]{2, 7, 11, 15}, 9)), new int[]{0, 1});
        assertArrayEquals((Solution.twoSum(new int[]{3, 2, 4}, 6)), new int[]{1, 2});
        assertArrayEquals((Solution.twoSum(new int[]{3, 3}, 6)), new int[]{0, 1});


    }
}