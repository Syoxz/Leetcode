package Maximum69Number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/longest-common-prefix/
 */
public class Solution {
    public static int maximum69Number(int num) {
        char[] arr = ("" + num).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }
}

class SolutionTest {
    @Test
    public void testMaximum69Number () {
        assertEquals (Solution.maximum69Number(9669), 9969);
        assertEquals (Solution.maximum69Number(9996), 9999);
        assertEquals (Solution.maximum69Number(9999), 9999);

    }
}