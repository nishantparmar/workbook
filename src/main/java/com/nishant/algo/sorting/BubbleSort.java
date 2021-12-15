package com.nishant.algo.sorting;

import java.util.Arrays;

public class BubbleSort {

    //[8,2,4,6,1,11,5]
    public int[] sortRecursive(int[] input) {
        bubbleSort(input, input.length);
        return input;
    }

    private void bubbleSort(int[] input, int index) {
        if (index == 1) return;
        for (int i = 0; i < input.length; i++) {

            if (i == input.length - 1) break;
            if (input[i] > input[i + 1]) {
                int temp = input[i + 1];
                input[i + 1] = input[i];
                input[i] = temp;
            }
        }
        bubbleSort(input, index - 1);
    }

    public static void sortItr(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int j = nums[i] - 1;
            if (nums[i] != nums[j])
                swap(nums, i, j);
            else
                i++;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 5, 4, 2};
        //CyclicSort.sort(arr);
        Arrays.sort(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[]{2, 6, 4, 3, 1, 5};
        BubbleSort.sortItr(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        arr = new int[]{1, 5, 6, 4, 3, 2};
        BubbleSort.sortItr(arr);
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

    }

}
