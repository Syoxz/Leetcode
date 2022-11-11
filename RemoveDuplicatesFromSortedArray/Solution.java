package RemoveDuplicatesFromSortedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class Solution {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }

}

class TestSolution {

    @Test
    public void testRemoveDuplicates() {
        assertEquals(Solution.removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 4}), 4);
        assertEquals(Solution.removeDuplicates(new int[]{1, 1, 2}), 2);
        assertEquals(Solution.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}), 5);
    }
}