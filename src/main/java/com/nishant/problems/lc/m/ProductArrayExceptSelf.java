package com.nishant.problems.lc.m;

import com.nishant.Utilities;

//https://leetcode.com/problems/product-of-array-except-self/
//COMPLETED
public class ProductArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {7, 5, 3, 4};
        ProductArrayExceptSelf paes = new ProductArrayExceptSelf();
        int[] result = paes.productExceptSelf(nums);

        Utilities.printArray(result);

    }

    public int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        // Base case
        if (n == 1) {
            return arr;
        }

        int i;
        /* Allocate memory for the product array */
        int prod[] = new int[n];

        /* Initialize the product array as 1 */
        for (int j = 0; j < n; j++) //[1,1,1,1,1,1....]
            prod[j] = 1;

        int temp1 = 1;
        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp1;
            temp1 *= arr[i];
        }

        /* Initialize temp to 1 for product on right side */

        int temp2 = 1;
        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp2;
            temp2 *= arr[i];
        }
        return prod;
    }

    public int[] productExceptSelf_otherSoln(int[] nums) {
        int size = nums.length;

        if (size == 1) {
            return nums;
        }

        int[] left = new int[size];
        int[] right = new int[size];
        int[] prod = new int[size];

        left[0] = 1;
        for (int i = 1; i < size; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        right[size - 1] = 1;
        for (int j = size - 2; j >= 0; j--) {
            right[j] = right[j + 1] * nums[j + 1];
        }


        for (int index = 0; index < size; index++) {
            prod[index] = right[index] * left[index];
        }
        return prod;
    }
}
