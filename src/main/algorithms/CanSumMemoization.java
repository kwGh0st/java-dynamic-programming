package main.algorithms;

import java.util.HashMap;
/*
The function should return a boolean value indicating whether or not
it is possible to generate the targetSum using numbers from the array

We may use an element of the array as many times as needed

Nonnegative input numbers
 */

public class CanSumMemoization {

    public static boolean canSum(long targetSum, long[] array) {
        HashMap<Long, Boolean> map = new HashMap<>();
        return _canSum(targetSum, array, map);
    }

    private static boolean _canSum(long targetSum, long[] array, HashMap<Long, Boolean> map) {
        if (map.containsKey(targetSum)) return map.get(targetSum);
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;

        for (long number : array) {
            long remainder = targetSum - number;
            if (_canSum(remainder, array, map)) {
                map.put(remainder, true);
                return true;
            }
        }
        map.put(targetSum, false);
        return false;
    }
}
