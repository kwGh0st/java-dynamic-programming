package main;

import main.algorithms.FibonacciMemoization;

public class Main {
    public static void main(String[] args) {
        System.out.println(FibonacciMemoization.findNFibonacci(1));  // 1
        System.out.println(FibonacciMemoization.findNFibonacci(3));  // 2
        System.out.println(FibonacciMemoization.findNFibonacci(8));  // 21
        System.out.println(FibonacciMemoization.findNFibonacci(10)); // 55
        System.out.println(FibonacciMemoization.findNFibonacci(33)); // 3524578
        System.out.println(FibonacciMemoization.findNFibonacci(50)); // 12586269025
    }
}
