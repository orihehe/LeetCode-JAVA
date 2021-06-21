package com.company.solution.week14.bbahngju;

import java.util.HashMap;

//1396
//O(N)
public class DesignUndergroundSystem {
    HashMap<String, Integer> totalSum;
    HashMap<String, Integer> totalCnt;
    HashMap<Integer, String> startStation;
    HashMap<Integer, Integer> startTime;

    public DesignUndergroundSystem() {
        totalSum = new HashMap<>();
        totalCnt = new HashMap<>();

        startStation = new HashMap<>();
        startTime = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        startStation.put(id, stationName);
        startTime.put(id, t);
    }

    public void checkOut(int id, String stationName, int t) {
        StringBuilder sb = new StringBuilder();
        String start = startStation.get(id);
        int distinct = t - startTime.get(id);

        String startToEnd = sb.append(start).append("to").append(stationName).toString();

        totalSum.put(startToEnd, totalSum.getOrDefault(startToEnd, 0) + distinct);
        totalCnt.put(startToEnd, totalCnt.getOrDefault(startToEnd, 0) + 1);
        startStation.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {
        String startToEnd = startStation + "to" + endStation;
        return (double) totalSum.get(startToEnd) / totalCnt.get(startToEnd);
    }
}
