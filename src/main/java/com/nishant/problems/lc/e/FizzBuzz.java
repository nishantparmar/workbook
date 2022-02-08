package com.nishant.problems.lc.e;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/
//COMPLETED
class FizzBuzz {
    public List<String> fizzBuzz(int number) {
        List<String> result = new ArrayList<>();
        int index = 1;
        while (index <= number) {
            int signal = 0;
            if (index % 3 == 0) {
                signal = 1;
            }
            if (index % 5 == 0) {
                signal = signal + 2;
            }
            if (signal == 0) {
                result.add("" + index);
            } else if (signal == 1) {
                result.add("Fizz");
            } else if (signal == 2) {
                result.add("Buzz");
            } else if (signal == 3) {
                result.add("FizzBuzz");
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        System.out.println(fb.fizzBuzz(19));
    }
}