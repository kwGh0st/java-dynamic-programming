package main.algorithms;

import java.util.HashMap;

public class FibonacciMemoization {
    private static final HashMap<Long, Long> HASH_MAP = new HashMap<>();

    public static long findNFibonacci(long n) {
        if (HASH_MAP.containsKey(n)) return HASH_MAP.get(n);

        if (n <= 2) return 1;

        HASH_MAP.put(n, (findNFibonacci(n - 1) + findNFibonacci(n - 2)));

        return HASH_MAP.get(n);
    }
}
