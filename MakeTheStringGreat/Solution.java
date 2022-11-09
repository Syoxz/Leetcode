package MakeTheStringGreat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*
https://leetcode.com/problems/make-the-string-great/
 */
public class Solution {

    public static String makeGood(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) == 32) {
                return makeGood(s.substring(0, i) + s.substring((i + 2)));
            }
        }
        return s;
    }

}

class SolutionTest {
    @Test
    public void testMakeGood() {
        assertEquals(Solution.makeGood("leEeetcode"), "leetcode");
        assertEquals(Solution.makeGood("abBAcC"), "");
        assertEquals(Solution.makeGood("s"), "s");


    }
}
