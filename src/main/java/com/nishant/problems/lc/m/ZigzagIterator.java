package com.nishant.problems.lc.m;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/zigzag-iterator/
//COMPLETED
public class ZigzagIterator {

    List<Integer> l1;
    List<Integer> l2;
    List<Integer> resultList = new ArrayList<>();
    int index = 0;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.l1 = v1;
        this.l2 = v2;
    }

    boolean left = true;
    boolean right = true;

    public int next() {
        if (l1.size() > 0 && left) {
            left = false;
            resultList.add(l1.get(0));
            index++;
            l1.remove(0);
            if (l2.size() > 0) right = true;
            return resultList.get(index - 1);
        } else if (l2.size() > 0 && right) {
            right = false;
            resultList.add(l2.get(0));
            index++;
            l2.remove(0);
            if (l1.size() > 0) left = true;
            return resultList.get(index - 1);
        }

        if(l2.size() > 0 && l1.size() ==0){
            resultList.add(l2.get(0));
            l2.remove(0);
            index++;
            return resultList.get(index - 1);
        }else if(l1.size() > 0 && l2.size() == 0){
            resultList.add(l1.get(0));
            l1.remove(0);
            index++;
            return resultList.get(index - 1);
        }

        return -1;
    }

    public boolean hasNext() {
        if (l1.size() > 0 || l2.size() > 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);

        ZigzagIterator iterator = new ZigzagIterator(l1, l2);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
