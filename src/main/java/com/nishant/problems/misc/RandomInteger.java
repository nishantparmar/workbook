package com.nishant.problems.misc;

public class RandomInteger {

    public static int getRandom(int[] array) {
        int rnd = (int)(Math.random()*array.length);
        return array[rnd];
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
