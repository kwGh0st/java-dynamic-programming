package main.algorithms;

import java.util.HashMap;
import java.util.List;

/*
Write a function "canConstruct(target, words) that accpets a target string and an array of strings.

The function should return a boolean indicating whether or not the "target
can be constructed by concatenating elements of the "words" array.

You may reuse elements of "words" as many times as needed.

O(n * m^2) time
O(m^2) space
 */

public class CanConstructMemoization {
    public  static boolean canConstruct(String targetWord, List<String> words) {
        HashMap<String, Boolean> map = new HashMap<>();
        return _canConstruct(targetWord, words, map);
    }

    private static boolean _canConstruct(String target, List<String> words, HashMap<String, Boolean> memo) {
        if (memo.containsKey(target)) return memo.get(target);
        if (target.length() == 0) return true;

        for (String word : words) {
            if (target.indexOf(word) == 0) {
                String suffix = target.substring(word.length());
                if (_canConstruct(suffix, words, memo)) {
                    memo.put(target, true);
                    return true;
                }
            }
        }

        memo.put(target, false);
        return false;
    }
}
