package PalinedromeNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


/*
https://leetcode.com/problems/palindrome-number/
Given an integer x, return true if x is a palindrome, and false otherwise.
 */
class Solution {
    public static boolean isPalindrome(int x) {
        int tmp = x, cache = 0;
        while(tmp > 0){
            cache = cache*10 + tmp % 10;
            tmp /= 10;
        }
        return x >= 0 && cache == x;
    }
}


class SolutionTest {

@Test
public void testIsPalindrome () {
    assertTrue(Solution.isPalindrome(121));
    assertFalse(Solution.isPalindrome(-121));
    assertFalse(Solution.isPalindrome(10));


}
}