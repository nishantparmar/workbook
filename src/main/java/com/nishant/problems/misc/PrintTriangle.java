package com.nishant.problems.misc;

public class PrintTriangle {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        printTriangle(numbers);
    }

    static void printTriangle(int[] numbers){
        print(numbers,0, "");
        printStar(numbers.length,"", 0);
    }

    static void print(int[] numbers, int index, String str){
        if(index == numbers.length-1)return;
        str += numbers[index];
        System.out.println(str);
        print(numbers, index+1,str);
    }

    static void printStar(int size, String str, int index){
        if(index == size-1)return;
        str += "*";
        System.out.println(str);
        printStar(size, str, index+1);
    }
}