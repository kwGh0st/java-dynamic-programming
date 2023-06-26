package main;

import main.algorithms.CanConstructMemoization;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        System.out.println(CanConstructMemoization.canConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd"))); // true
        System.out.println(CanConstructMemoization.canConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar"))); //false
        System.out.println(CanConstructMemoization.canConstruct("enterapotentpot", Arrays.asList("a", "p", "ent", "enter", "ot", "o", "t"))); //true
        System.out.println(CanConstructMemoization.canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", Arrays.asList("e", "ee", "eee", "eeee", "eeeee"))); // false
    }
}
