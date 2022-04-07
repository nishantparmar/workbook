package com.nishant.problems.lc.e.completed;

//https://leetcode.com/problems/add-strings/
public class AddString {

    // 11 + 123 = 134
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0) {

            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';

            int sum = x + y + carry;

            ans.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;

        }
        if(carry > 0 ) ans.append("1");
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        AddString as = new AddString();
        System.out.println(as.addStrings("11", "123"));

    }


}
