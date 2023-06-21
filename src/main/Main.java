package main;

import main.algorithms.GridTravellerMemoization;

public class Main {
    public static void main(String[] args) {
        System.out.println(GridTravellerMemoization.gridTraveller(1, 1));  // 1
        System.out.println(GridTravellerMemoization.gridTraveller(2, 3));  // 3
        System.out.println(GridTravellerMemoization.gridTraveller(3, 2));  // 3
        System.out.println(GridTravellerMemoization.gridTraveller(3, 3));  // 6
        System.out.println(GridTravellerMemoization.gridTraveller(18, 18)); // 2333606220
    }
}
