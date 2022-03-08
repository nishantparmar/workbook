package com.nishant.problems.lc.e;

class ExcelTitleNumber {
    public int titleToNumber(String columnTitle) {
        char[] chs = columnTitle.toCharArray();
        int result=0;
        for (int i = 0; i < chs.length; i++) {
            result = result + 26*i  +  getNumberForChar(chs[i]);
        }
        return result;
    }

    private int getNumberForChar(char ch){
        return ch - 64;
    }

    public static void main(String[] args) {
        ExcelTitleNumber tn = new ExcelTitleNumber();
        System.out.println(tn.titleToNumber("ZY"));
    }
}