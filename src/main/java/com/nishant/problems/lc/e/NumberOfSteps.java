package com.nishant.problems.lc.e;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
//PENDING
public class NumberOfSteps {
    public static void main(String[] args) {
//        System.out.println(numberOfSteps(14));
//        System.out.println(numberOfSteps(8));
//        System.out.println(numberOfSteps(123));
//        int[] nums = {1,3,2,5,9,10};
        int[] nums = {10, 9, 11, 8, 7, 6};
//        System.out.println(isSorted(nums));
        System.out.println(find(nums,9));
        System.out.println(find(nums,6));
        System.out.println(find(nums,90));
    }

    static int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }
        return steps(num, 0);
    }

    private static int steps(int number, int count) {
        if (number == 0) {
            return count;
        }

        if (number % 2 == 0) {
            //even
            count++;
            return steps(number / 2, count);
        } else {
            //odd
            count++;
            return steps(number - 1, count);
        }
    }

    public static boolean isSorted(int[] numbers) {
        if (numbers.length == 1) {
            return true;
        }
        if (numbers[0] < numbers[1]) {
            return sortedAsc(numbers, 0);
        } else {
            return sortedDsc(numbers, 0);
        }
    }

    private static boolean sortedAsc(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return true;
        }
        if (numbers[index] > numbers[index + 1]) {
            return false;
        }
        return sortedAsc(numbers, index + 1);
    }

    private static boolean sortedDsc(int[] numbers, int index) {
        if (index == numbers.length - 1) {
            return true;
        }
        if (numbers[index] < numbers[index + 1]) {
            return false;
        }
        return sortedDsc(numbers, index + 1);
    }

    public static int find(int[] numbers, int target){
        if(numbers.length ==0) return -1;
        return findTarget(numbers, target, 0);
    }

    private static int findTarget(int[] numbers, int target, int index){
        if(index > numbers.length - 1) return -1;
        if(numbers[index] == target) return index;
        return findTarget(numbers, target, index +1);
    }
}
