package com.company.solution.week10.bbahngju;

import java.util.Stack;

//155
//O(N)
public class MinStack {
    Stack<Integer> answer, minimum;
    /** initialize your data structure here. */
    public MinStack() {
        answer = new Stack<>();
        minimum = new Stack<>();
    }

    public void push(int val) {
        answer.push(val);
        if(minimum.empty()) minimum.push(val);
        else if(minimum.peek() >= val) minimum.push(val);
    }

    public void pop() {
        int result = answer.pop();
        if(minimum.peek() == result) minimum.pop();
    }

    public int top() {
        return answer.peek();
    }

    public int getMin() {
        return minimum.peek();
    }
}
