package ReverseWordsInAString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution {
    public static String reverseWords(String s) {
        String[] cleanedString = s.trim().replaceAll(" +", " ").split(" ");
        String reversedString = "";
        /*
        Anstatt der IF und Else Abzweigung, ist ein reversedString.trim() im return auch möglich.
        Die hier benutzte Lösung ist etwas schneller und effizienter, macht aber keinen großen Unterschied.
         */
        for (int i = cleanedString.length - 1; i >= 0; i--) {
            if (i == 0) reversedString += cleanedString[i];
            else reversedString += cleanedString[i] + " ";
        }
        return reversedString;
    }
// Schnellste Lösung
    public static String reverseWordsWithStringBuilder(String s) {
        String[] words = s.split("\\s+");
        StringBuilder str = new StringBuilder();

        for (int i = words.length - 1; i >= 0; --i) {
            str.append(words[i] + " ");
        }
        return str.toString().trim();
    }
}

class TestSolution {
    @Test
    public void testReverseWords() {
        assertEquals(Solution.reverseWords(" Ich  bins  Marcel  "), "Marcel bins Ich");
    }

    @Test
    public void testReverseWordsWithStringBuilder(){
        assertEquals(Solution.reverseWordsWithStringBuilder(" Ich bins Marcel  "), "Marcel bins Ich");
    }
}
