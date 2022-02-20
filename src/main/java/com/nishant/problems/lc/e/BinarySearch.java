package com.nishant.problems.lc.e;

//https://leetcode.com/problems/binary-search/
//COMPLETED
public class BinarySearch {
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length-1,target);
    }

    private int search(int[] numbers, int start, int end, int target){
        if(start>end)return -1;
        int mid = start + (end-start)/2;
        if(numbers[mid]==target)return mid;
        if(numbers[mid]>target){
            return  search(numbers,start,mid-1,target);
        }
        if(numbers[mid]<target){
            return  search(numbers,mid+1,end,target);
        }
        return start;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(new int[]{5,7}, 7));
    }
}
