package com.nishant.problems.lc.m;

import java.util.ArrayList;
import java.util.List;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        Integer vers1 = Integer.parseInt(version1.replaceAll("\\.", ""));
        Integer vers2 = Integer.parseInt(version2.replaceAll("\\.", ""));

        if (version1.length() > version2.length()) {
            int delta = version1.length() - version2.length();
            for (int i = 0; i <= delta - 1; i++) {
                vers2 = vers2*10;
            }
        } else if (version2.length() > version1.length()) {
            int delta = version2.length() - version1.length();
            for (int i = 0; i <= delta - 1; i++) {
                vers1 = vers1*10;
            }
        }

        if(vers1 > vers2){
            return 1;
        }else if(vers2 > vers1){
            return -1;
        }else {
            return 0;
        }
    }

    public int compareVersion_2nd(String version1, String version2) {
        List<Integer> version1Arr = convertToList(version1.split("\\."));
        List<Integer> version2Arr = convertToList(version2.split("\\."));

        if (version1Arr.size() > version2Arr.size()) {
            int delta = version1Arr.size() - version2Arr.size();
            for (int i = 0; i <= delta - 1; i++) {
                version2Arr.add(0);
            }
        } else if (version2Arr.size() > version1Arr.size()) {
            int delta = version2Arr.size() - version1Arr.size();
            for (int i = 0; i <= delta - 1; i++) {
                version1Arr.add(0);
            }
        }

        int end = version1Arr.size() > version2Arr.size() ? version1Arr.size() - 1 : version2Arr.size() - 1;
        int index = 0;
        while (index <= end) {
            if (version1Arr.get(index) > version2Arr.get(index)) {
                return 1;
            } else if (version1Arr.get(index) < version2Arr.get(index)) {
                return -1;
            } else {
                index++;
                continue;
            }
        }
        return 0;
    }

    private List<Integer> convertToList(String[] arr) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i <= arr.length - 1; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        return list;
    }

    public static void main(String[] args) {
        CompareVersionNumbers cvn = new CompareVersionNumbers();
        System.out.println(cvn.compareVersion("7.5.2.4", "7.5.3"));
    }
}
