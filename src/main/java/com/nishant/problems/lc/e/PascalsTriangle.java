package com.nishant.problems.lc.e;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/pascals-triangle/
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();

        if (numRows == 1) {
            List<Integer> list = new ArrayList();
            list.add(1);
            result.add(list);
            return result;
        }

        if (numRows == 2) {
            List<Integer> list = new ArrayList();
            list.add(1);
            list.add(1);
            result.add(list);
            return result;
        }

        generatePT(numRows, result);
        return result;
    }

    void generatePT(int numRows, List<List<Integer>> result) {
        if (numRows < 3) {
            return;
        }

        int mid = numRows/2;
        List<Integer> newRow = new ArrayList<>();
        //left
        for (int i = 0; i < mid; i++) {
            List row =result.get(numRows-1);


        }
        //right
        for (int i = mid+1; i < numRows; i++) {

        }

        //mid
        if(numRows%2 !=0){

        }


        numRows--;
        generatePT(numRows, result);
    }

    public static void main(String[] args) {
        PascalsTriangle pt = new PascalsTriangle();
        List<List<Integer>> result = pt.generate(5);
        System.out.println(result);
    }


}
