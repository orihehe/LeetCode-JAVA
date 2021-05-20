package com.company.solution.week10.orihehe;

import java.util.Optional;
import java.util.Stack;
import java.util.TreeMap;

// 155
// O(NlogN)
public class MinStack {

    private TreeMap<Integer, Integer> map;
    private Stack<Integer> stack;

    /** initialize your data structure here. */
    public MinStack() {
        map = new TreeMap<>();
        stack = new Stack<>();
    }

    public void push(int val) {
        map.put(val, Optional.ofNullable(map.get(val)).orElse(0) + 1);
        stack.add(val);
    }

    public void pop() {
        int val = stack.pop();
        map.put(val, map.get(val) - 1);
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        while (map.firstEntry().getValue() == 0) {
            map.remove(map.firstKey());
        }
        return map.firstKey();
    }
}
