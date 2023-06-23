package main;

import main.algorithms.HowSumMemoization;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {



        System.out.println(HowSumMemoization.howSum(7, Arrays.asList(2, 3) )); // [3, 2, 2]
        System.out.println(HowSumMemoization.howSum(7, Arrays.asList(5, 3, 4, 7))); // [4, 3]
        System.out.println(HowSumMemoization.howSum(7, Arrays.asList(2, 4) )); // null
        System.out.println(HowSumMemoization.howSum(8, Arrays.asList(2, 3, 5))); // [2, 2, 2, 2]
        System.out.println(HowSumMemoization.howSum(300, Arrays.asList(7, 14))); // null

    }
}
