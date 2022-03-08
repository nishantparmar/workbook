package com.nishant.problems.lc.e.completed;
//https://leetcode.com/problems/happy-number/
//COMPLETED
class HappyNumber {
    public boolean isHappy(int number) {
        if (number == 1) return true;
        int fast = number;
        int slow = number;
        do {
            slow = findSqr(slow);
            fast = findSqr(findSqr(fast));
        } while (fast != slow);
        return slow == 1;
    }

    int findSqr(int number) {
        int result = 0;
        while (number > 0) {
            int rem = number % 10;
            result = result + rem * rem;
            number = number / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        HappyNumber hn = new HappyNumber();
        System.out.println(hn.isHappy(2));
    }

}