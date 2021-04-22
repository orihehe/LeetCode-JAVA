package com.company.solution.week06.bbahngju;

import java.util.LinkedHashMap;
import java.util.Map;

//146
//O(N)
public class LRUCache {
    int limited;
    Map<Integer, Integer> store = new LinkedHashMap<>() {
        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > limited;
        }
    };

    public LRUCache(int capacity) {
        this.limited = capacity;
    }

    public int get(int key) {
        if(store.containsKey(key)) {
            int v = store.get(key);
            store.remove(key);
            store.put(key, v);
            return v;
        }
        else return -1;
    }

    public void put(int key, int value) {
        store.remove(key);
        store.put(key, value);
    }
}
