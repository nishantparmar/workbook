package com.nishant.problems.lc.m.completed;

//https://leetcode.com/problems/sum-of-two-integers/
//COMPLETED
public class GetSum {
    public int getSum(int a, int b) {
        while (a != 0) {
            int carry = b & a; //carry is AND of two bits
            b = a ^ b; // Sum of two bits is a XOR b
            a = carry << 1; // Shift carry to 1 bit to calculate sum
        }
        return b;
    }

    //Recursive
    public int add(int a, int b) {
        if (b == 0) return a;
        int sum = a ^ b; //SUM of two integer is A XOR B
        int carry = (a & b) << 1;  //CARRY of two integer is A AND B
        return add(sum, carry);
    }

    public static void main(String[] args) {
        GetSum s = new GetSum();
        System.out.println(s.add(13, 4));
    }
}
