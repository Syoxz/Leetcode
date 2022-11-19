package IsUgly;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/*
https://leetcode.com/problems/ugly-number/
 */
public class Solution {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        return n == 1;
    }
}


class TestSolution {
    @Test
    public void testIsUgly (){
        assertEquals(Solution.isUgly(6), true);
        assertEquals(Solution.isUgly(1), true);
        assertEquals(Solution.isUgly(14), false);

    }
}