package com.nishant.problems.lc.m.completed;

import java.util.*;

//https://leetcode.com/problems/insert-delete-getrandom-o1/
//COMPLETED
class RandomizedSet {

    Map<Integer, Integer> map = new HashMap();
    ArrayList<Integer> list = new ArrayList();
    Random rn = new Random();

    public RandomizedSet() {
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        map.put(val, list.size());
        list.add(list.size(), val);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int lastElement = list.get(list.size() - 1);
        int index = map.get(val);
        list.set(index, lastElement);
        map.put(lastElement, index);

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        if (list.size() == 1) return list.get(0);
        return list.get(rn.nextInt(list.size()));
    }

    public static void main(String[] args) {
        RandomizedSet s = new RandomizedSet();
        System.out.println(s.insert(1));//[1]
        System.out.println(s.remove(2));//[1]
        System.out.println(s.insert(2));//[1,2]
        System.out.println(s.getRandom());
        System.out.println(s.remove(1));//[2]
        System.out.println(s.insert(2));//[2]
        System.out.println(s.getRandom());
    }

}