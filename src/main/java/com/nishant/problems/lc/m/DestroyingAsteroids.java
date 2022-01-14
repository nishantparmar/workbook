package com.nishant.problems.lc.m;

import java.util.Arrays;
//https://leetcode.com/problems/destroying-asteroids/
//MEDIUM
//COMPLETED
public class DestroyingAsteroids {

    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        if (asteroids.length == 1) {
            if (mass >= asteroids[0]) {
                return true;
            } else {
                return false;
            }
        }
        Arrays.sort(asteroids);
        long newPlanetMass = mass;
        boolean isDestroyed = true;
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > newPlanetMass) {
                return false;
            } else {
                if (newPlanetMass < 100000) {
                    newPlanetMass = newPlanetMass + asteroids[i];
                }else{
                    return  true;
                }
                isDestroyed = true;
            }
        }
        return isDestroyed;
    }

    public static void main(String[] args) {
        int[] asteroids4 = {97};
        System.out.println(asteroidsDestroyed(5, asteroids4));

        int mass = 5;
        int[] asteroids1 = {4, 9, 23, 4};
        System.out.println(asteroidsDestroyed(5, asteroids1));

        int[] asteroids2 = {3, 9, 19, 5, 21};
        System.out.println(asteroidsDestroyed(10, asteroids2));

        int[] asteroids3 = {1, 1};
        System.out.println(asteroidsDestroyed(2, asteroids3));

    }

}
