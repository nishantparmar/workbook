package com.nishant.problems.lc.m.completed;
//https://leetcode.com/problems/jump-game/
//COMPLETED
public class JumpGame {
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i=0; i<nums.length; i++){
            if( reachable < i ){
                return false;
            }
            reachable = Math.max(reachable, i + nums[i]);//maximum jump
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        JumpGame jg = new JumpGame();
        System.out.println(jg.canJump(nums));

    }
}
