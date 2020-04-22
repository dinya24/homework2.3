package ru.geekbrains.homeworks;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = {"apple", "dog", "meet", "meet", "green", "moron", "fork", "gold", "gold", "lock"};

        Map<String,Integer> map = new HashMap<>();

        for (String word:words) {
            map.put(word,map.getOrDefault(word,0) + 1);
        }
        System.out.println(map);

        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);


    }
}
