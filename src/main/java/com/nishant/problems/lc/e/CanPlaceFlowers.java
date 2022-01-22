package com.nishant.problems.lc.e;

//https://leetcode.com/problems/can-place-flowers/submissions/
//COMPLETED
public class CanPlaceFlowers {

    public static void main(String[] args) {
        int[] flowerbed = {0,0};

        CanPlaceFlowers flower = new CanPlaceFlowers();
        System.out.println(flower.canPlaceFlowers(flowerbed, 1));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        //handling for size =1
        if (flowerbed.length == 1 && n == 1) {
            if (flowerbed[0] == 0) {
                n--;
            } else {
                return false;
            }
        }

        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) {
                return true;
            }
            //First Index
            if (i == 0 && flowerbed[0] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                if (n > 0) {
                    n--;
                    continue;
                } else {
                    return true;
                }

            }

            //Last Index
            if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                if (n > 0) {
                    n--;
                    continue;
                } else {
                    return true;
                }
            }

            //Middle Index
            if ((i > 0 && i < flowerbed.length) &&
                    (flowerbed[i] == 0
                            && flowerbed[i - 1] == 0
                            && flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                if (n > 0) {
                    n--;
                    continue;
                } else {
                    return true;
                }
            }

        }
        if (n <= 0) {
            return true;
        } else {
            return false;
        }
    }


    //Efficient Solution
    public class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
            int i = 0, count = 0;
            while (i < flowerbed.length) {
                if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                        && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    flowerbed[i] = 1;
                    count++;
                }
                i++;
            }
            return count >= n;
        }
    }


}
