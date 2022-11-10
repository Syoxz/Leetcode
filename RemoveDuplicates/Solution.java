package RemoveDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class Solution {
    public static String removeDuplicates(String S) {
        StringBuilder sb = new StringBuilder();

        for (char c : S.toCharArray()) {
            int size = sb.length();
            if (size > 0 && sb.charAt(size - 1) == c) {
                sb.deleteCharAt(size - 1);
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

class TestSolution{
    @Test
    public void testRemoveDuplicates (){
        assertEquals (Solution.removeDuplicates("abbaca"), "ca");
        assertEquals (Solution.removeDuplicates("azxxzy"), "ay");
        assertEquals (Solution.removeDuplicates("abcdef"), "abcdef");

    }
}
