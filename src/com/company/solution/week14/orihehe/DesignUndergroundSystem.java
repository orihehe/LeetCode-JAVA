package com.company.solution.week14.orihehe;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

// 1396
public class DesignUndergroundSystem {

    private static class Info {
        long totalTime;
        long totalPerson;

        public Info() {
            totalPerson = 0;
            totalTime = 0;
        }
    }

    private final Map<Integer, Pair<String, Integer>> checkInMap = new HashMap<>();
    private final Map<Pair<String, String>, Info> pathMap = new HashMap<>();

    public DesignUndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new Pair<>(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> p = checkInMap.get(id);
        Pair<String, String> path = new Pair<>(p.getKey(), stationName);
        if (!pathMap.containsKey(path)) {
            pathMap.put(path, new Info());
        }

        pathMap.get(path).totalPerson++;
        pathMap.get(path).totalTime += t - p.getValue();
    }

    public double getAverageTime(String startStation, String endStation) {
        Info info = pathMap.get(new Pair<>(startStation,endStation));
        return (double) info.totalTime / info.totalPerson;
    }
}
