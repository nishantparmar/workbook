package com.nishant.problems.lc.e;

//https://leetcode.com/problems/check-if-a-number-is-majority-element-in-a-sorted-array/
//COMPLETED
class NumberMajoritySortedArr {
    public boolean isMajorityElement(int[] nums, int target) {
        MajorityElement me = new MajorityElement();
        int maj = me.majorityElement(nums);
        return maj == target;
    }

    public static void main(String[] args) {
        int[] nums = {10,100,101,101} ;
        int target = 100;
        NumberMajoritySortedArr me2 = new NumberMajoritySortedArr();
        System.out.println(me2.isMajorityElement(nums, target));
    }
}