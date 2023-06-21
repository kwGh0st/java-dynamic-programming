package main.algorithms;

import java.util.HashMap;
/*
How many options are there to go from x to o
[x] [ ] [ ]
[ ] [ ] [ ]
[ ] [ ] [o]
 */
public class GridTravellerMemoization {
    private static HashMap<String, Long> map = new HashMap<>();

    public static long gridTraveller(long x, long y) {
        String key = x + "," + y;
        if (map.containsKey(key)) return map.get(key);
        if (x == 1 && y == 1) return 1;
        if (x == 0 || y == 0) return 0;
        map.put(key, (gridTraveller(x - 1, y) + gridTraveller(x, y - 1)));

        return map.get(key);
    }
}
