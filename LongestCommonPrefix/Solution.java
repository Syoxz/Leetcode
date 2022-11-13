package LongestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
}


class SolutionTest {
    @Test
    public void testLongestCommonPrefix() {
        assertEquals(Solution.longestCommonPrefix(new String[] {"flower", "flow", "flight"}), "fl");
        assertEquals(Solution.longestCommonPrefix(new String[] {"dog", "racecar", "car"}), "");
        assertEquals(Solution.longestCommonPrefix(new String[] {"abflo", "cbflo", "deflo"}), "");
        assertEquals(Solution.longestCommonPrefix(new String[] {"abflo", "abft", "abflo"}), "abf");

    }
}