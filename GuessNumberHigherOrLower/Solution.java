package GuessNumberHigherOrLower;

import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Solution {
     public static int guessNumber(int n) {
            int left = 0, right = n;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (guess(mid) == 0) return mid;
                else if (guess(mid) == -1) {
                    right = mid - 1;

                } else if (guess(mid) == 1) {
                    left = mid + 1;
                }
            }
            return 1;
        }

/*
Stellt die API nach, die in der Aufgabe benutzt wird
 */
    public static int guess(int number){
        if (number == 5){
            return 0;
        }
        else if (number < 5){
            return 1;
        }
        return -1;
    }
}


class TestSolution {
    @Test
    public void testSolution () {
        assertEquals(Solution.guessNumber(100), 5);
    }
}