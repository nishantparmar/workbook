package com.nishant.problems.misc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomInteger {

    public static int getRandom(int[] array) {
        int rnd = (int)(Math.random()*array.length);
        return array[rnd];
    }

    Map<Integer, Integer> map = new HashMap();
    List list = new ArrayList();

    public int getRandom() {
        int rnd = (int)(Math.random()*list.size());
        return map.get(rnd);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));
        System.out.println(getRandom(array));



    }
}
