package main.algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
function should return an array containing any combination of elements that add
up to exactly the targetSum. If there is no combination that adds up to the
targetSum, then return null


If there are multiple combinations possible, you may return any single one
 */


//m - target sum
//n = list.size
//
//time: O(n^m + m)
//space: O(m)

public class HowSumMemoization {

    public static ArrayList<Integer> howSum(int targetSum, List<Integer> list) {
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        return _howSum(targetSum, list, hashMap);
    }

    private static ArrayList<Integer> _howSum(int targetSum, List<Integer> list, HashMap<Integer, ArrayList<Integer>> memo) {
        if (memo.containsKey(targetSum)) return memo.get(targetSum);
        if (targetSum == 0) return new ArrayList<>(0);
        if (targetSum < 0) return null;

        for (int number : list) {
            int remainder = targetSum - number;
            ArrayList<Integer> remainderResult = _howSum(remainder, list, memo);
            if (remainderResult != null) {
                remainderResult.add(number);
                memo.put(targetSum, remainderResult);
                return memo.get(targetSum);
            }
        }

        memo.put(targetSum, null);
        return null;
    }
}
