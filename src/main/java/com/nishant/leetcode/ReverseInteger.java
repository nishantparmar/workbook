package com.nishant.leetcode;

//PENDING
public class ReverseInteger {

    public static void main(String[] args){
        int number = 2147483647;

//        System.out.println(number%10);

        System.out.println(reverseInteger(number));

    }

    private static int reverseInteger(int number) {
        int result=0;
        for(int i=0; i< 10; i++){

            int position = number%i;
            result = result + position ;
        }

        return result;
    }


}
