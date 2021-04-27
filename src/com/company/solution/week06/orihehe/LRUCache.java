package com.company.solution.week06.orihehe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 146
// O(N)
public class LRUCache {

    private final int[] values = new int[3001];
    private final List<Integer> que = new ArrayList<>();
    private final Map<Integer, Integer> validKeys = new HashMap<>();

    private final int capacity;
    private int qIdx = 0;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!validKeys.containsKey(key)) {
            return -1;
        }

        addOne(key);
        return values[key];
    }

    public void put(int key, int value) {
        values[key] = value;
        addOne(key);

        if (validKeys.size() > capacity) {
            removeOne();
        }
    }

    private void addOne(int key) {
        que.add(key);
        validKeys.put(key, que.size() - 1);
    }

    private void removeOne() {
        while (qIdx < que.size() && (!validKeys.containsKey(que.get(qIdx)) || validKeys.get(que.get(qIdx)) > qIdx)) {
            qIdx++;
        }
        validKeys.remove(que.get(qIdx));
    }
}
