package com.nishant.problems.misc;

import java.util.ArrayList;
import java.util.List;

public class Miscellaneous {
    public static void main(String[] args) {
        Miscellaneous m = new Miscellaneous();
        int number = 1234;
        System.out.println(sumOfDigits(number));
        System.out.println(prodOfDigits(number));
        System.out.println(factorial(5));
        System.out.println(count(123, 0));
        System.out.println(m.getDigits(12345));
    }

    List<Integer> getDigits(int number) {
        ArrayList<Integer> result = new ArrayList<>();

        while (number > 0) {
            int digit = number % 10;
            result.add(digit);
            number /= 10;
        }
        return result; // LSD at start of list
    }

    //Basic Recursive problems - Start
    static int sumOfDigits(int number) {
        if (number == 0) return 0;
        return number % 10 + sumOfDigits(number / 10);
    }

    static int prodOfDigits(int number) {
        if (number % 10 == number) return number;
        return number % 10 * prodOfDigits(number / 10);
    }

    static int factorial(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    static int countZero(int number) {
        if (number == 0) {
            return 1;
        }
        return count(number, 0);
    }

    private static int count(int number, int count) {
        if (number / 10 == 0) {
            return count;
        }
        if (number % 10 == 0) {
            count++;
        }
        return count(number / 10, count);
    }

    static String skipCharacter(String input, String element) {


        return input;
    }


}
