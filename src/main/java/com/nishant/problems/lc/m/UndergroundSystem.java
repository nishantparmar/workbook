package com.nishant.problems.lc.m;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/design-underground-system/
class UndergroundSystem {

    Map<Integer, Integer> timing;
    Map<Integer, String> travel;
    public UndergroundSystem() {
        timing = new HashMap<>();
        travel = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
            travel.put(id, stationName+"-"+t);
    }

    public void checkOut(int id, String stationName, int t) {
            if(travel.get(id) != null){
                String data = travel.get(id);
                String[] arr = data.split("-");

            }
    }

    public double getAverageTime(String startStation, String endStation) {

        return 0.0;
    }

    public static void main(String[] args) {
        UndergroundSystem obj = new UndergroundSystem();
        obj.checkIn(32, "New York", 10);
        obj.checkOut(32, "Philadelphia", 18);
        double param_3 = obj.getAverageTime("New York", "Philadelphia");

        System.out.println(param_3);
    }
}
