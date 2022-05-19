package com.revature.challenge;
import java.util.Stack;

//  2) Stack Min: How would you design a stack which, in addition to push and pop,
//        has a function min which returns the minimum element? Push, pop and min should all operate in 0(1) time.

public class StackMin {

    private Integer min;

    Stack<Integer> stack = new Stack<>();

    public void push(Integer element) {
        if (stack.isEmpty()) {
            min = element;
        }
        else if (element < min) {
            min = element;
        }
        stack.push(element);
    }

    public void pop() {
        if (stack.peek() == min) {
            stack.pop();
            min = stack.peek();
            for (int i = 0; i < stack.size(); i++) {
                if (stack.get(i) < min) {
                    min = stack.get(i);
                }
            }
        } else {
            stack.pop();
        }
    }

    public void getMin() {
        System.out.println("The min is: " + min);
    }

    public static void main(String[] args) {
        
        StackMin stackMin = new StackMin();

        stackMin.push(34);
        stackMin.push(64);
        stackMin.push(36);
        stackMin.push(52);
        stackMin.push(23);

        stackMin.getMin();

        stackMin.pop();
        stackMin.getMin();
    }
}
