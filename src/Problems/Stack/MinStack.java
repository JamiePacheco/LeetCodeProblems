package Problems.Stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> mainStack;
    int min;

    public MinStack() {
        this.mainStack = new Stack<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (mainStack.isEmpty()) {
            min = val;
        }else if (val < min) {
            min = val;
        }
    }

    public void pop() {
        if (this.mainStack.isEmpty()) return;
        if (this.mainStack.pop() == min) {

        }
    }

//    public int top() {
//
//    }
//
//    public int getMin() {
//
//    }
}
