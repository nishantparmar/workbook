package com.nishant;

import java.util.ArrayList;
import java.util.List;

public class NumbersOperation {

    public List<Integer> convertToBinary(int num) {
        List<Integer> binary = new ArrayList<>();
        int id = 0;
        // Number should be positive
        while (num > 0) {
            binary.add(num % 2);
            num = num / 2;
        }
        return binary;
    }

    int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }

    // Main Driver Code
    public static void main(String[] args) {
        // Entered number to be convert into binary
        NumbersOperation no = new NumbersOperation();
        System.out.println(no.convertToBinary(25));
        System.out.println(Integer.parseInt("10011",2));
    }
}
