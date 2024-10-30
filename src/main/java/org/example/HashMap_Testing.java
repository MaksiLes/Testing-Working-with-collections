package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_Testing {
    public static void main(String[] args) {
        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Red", 1);
        newMap.put("Green", 2);
        newMap.put("Black", 1);
        newMap.put("White", 3);
        newMap.put("Blue", 4);

        System.out.println(newMap);
        System.out.println(newMap.size());

        HashMap<String, Integer> copyMap = new HashMap<>();
        copyMap.put("Orange", 6);
        copyMap.put("Yellow", 6);

        newMap.putAll(copyMap);
        System.out.println(newMap);

        HashMap<String, Integer> cloneMap = new HashMap<>();
        cloneMap = (HashMap<String, Integer>) copyMap.clone();
        System.out.println(cloneMap);

        if(newMap.containsKey("Orange")) {
            System.out.println("Такой ключ существует");
        } else {
            System.out.println("Такой ключ не существует");
        }

        if(newMap.containsValue(5)) {
            System.out.println("Такое значение существует");
        } else {
            System.out.println("Такое значение не существует");
        }

        System.out.println(newMap.entrySet());

        System.out.println(newMap.get("Red"));
        System.out.println(newMap.keySet());
        System.out.println(newMap.values());



    }
}
