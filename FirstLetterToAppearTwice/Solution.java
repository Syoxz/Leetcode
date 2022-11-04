package FirstLetterToAppearTwice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

/*
https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
 */

public class Solution {
    public static char repeatedCharacter(String s) {
        HashSet<Character> charSet = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            if (!charSet.add(c)) {
                return c;
            }
        }
        throw new RuntimeException("There must be two repeating characters");


    }
}

class TestingSolution {
    @Test
    public void testRepeatedCharacter() {
        assertEquals(Solution.repeatedCharacter("asdasd"), 'a');
        Assertions.assertThrows(RuntimeException.class, () -> {
            Solution.repeatedCharacter("abcdefgh");
        });

    }
}
