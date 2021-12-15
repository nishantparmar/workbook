package com.nishant.ds.hashtable;

import java.util.HashMap;
import java.util.Map;

public class NonRepeativeChar {

    public static void main(String[] args) {

        String str = "a green apple";

        var map = new HashMap<Character, Integer>();

        for (char c : str.toCharArray()) {
            if (map.get(c) != null) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1) {
                System.out.println(key.toString());
            }

        }

    }
}
