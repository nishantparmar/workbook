package com.nishant.problems.misc;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {8, 9, 2, 11, 15, 3, 8};
        int[] result = addElementAtk(numbers, 3, 22);
        System.out.println(result);
    }

    public static int[] addElementAtk(int[] numbers, int index, int target) {
        int[] result = new int[numbers.length + 1];
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i < index) {
                result[i] = numbers[i];
            } else if (i == index) {
                temp = numbers[i];
                result[i] = target;
            } else if (i > index) {
                result[i] = temp;
                temp = numbers[i];
            }
            result[i+1] = temp;
        }
        return result;
    }

}
