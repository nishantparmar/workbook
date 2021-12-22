package com.nishant.problems.leetcode;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
//COMPLETED
public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] nums = {01,22,333,22};

        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (even(numbersOfDigits(nums[i]))) {
                count++;
            }
        }
        return count;
    }

    private static boolean even(int num) {
        return num % 2 == 0;
    }

    private static int numbersOfDigits(int number) {
//        String[] str = (""+number).split("");
//        int length = 0;
//        for (int i=0; i< str.length;i++){
//            length++;
//        }
//        return length;
        int count = 0;
        while(number>0){
            count++;
            number = number/10;
        }
        return count;
    }

}
