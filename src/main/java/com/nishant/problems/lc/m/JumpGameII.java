package com.nishant.problems.lc.m;

public class JumpGameII {
    public int canJump(int[] nums) {
        int reachable = 0;
        for(int i=0; i<nums.length; i++){

            reachable = Math.max(reachable, i + nums[i]);
        }
        return reachable;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,0,1,4};
        JumpGameII jg = new JumpGameII();
        System.out.println(jg.canJump(nums));

    }
}
