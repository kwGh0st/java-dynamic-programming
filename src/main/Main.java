package main;

import main.algorithms.CanSumMemoization;

public class Main {
    public static void main(String[] args) {
       long[] arr1 = new long[] {2, 3};
       long[] arr2 = new long[] {5, 3, 4, 7};
       long[] arr3 = new long[] {2, 4};
       long[] arr4 = new long[] {2, 3, 5};
       long[] arr5 = new long[] {7, 14};
       long[] arr6 = new long[] {7, 14, 8, 99, 32};

        System.out.println(CanSumMemoization.canSum(7,arr1));
        System.out.println(CanSumMemoization.canSum(7,arr2));
        System.out.println(CanSumMemoization.canSum(7,arr3));
        System.out.println(CanSumMemoization.canSum(8,arr4));
        System.out.println(CanSumMemoization.canSum(300,arr5));
        System.out.println(CanSumMemoization.canSum(10000, arr6));
    }
}
