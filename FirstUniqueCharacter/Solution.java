package FirstUniqueCharacter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/*
https://leetcode.com/problems/first-unique-character-in-a-string/
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */

class Solution {
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}

class SolutionTest {
    @Test
    public void testfirstUniqChar() {
        assertEquals(Solution.firstUniqChar("leetcode"), 0);
        assertEquals(Solution.firstUniqChar("loveleetcode"), 2);
        assertEquals(Solution.firstUniqChar("aabb"), -1);
    }
}