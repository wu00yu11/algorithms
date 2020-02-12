package com.learn.algorithms.stack;

import java.util.Stack;

/**
 * 两个栈实现队列
 *
 * @author wu00y
 */
public class StackToQueues {

    private Stack<Integer> pushStack;
    private Stack<Integer> popStack;

    public StackToQueues() {
        this.pushStack = new Stack<Integer>();
        this.popStack = new Stack<Integer>();
    }

    public boolean push(int a){
        pushStack.push(a);
        return true;
    }

    public int pop(){
        if (popStack.isEmpty())
        {
            while(!pushStack.isEmpty())
            {
                // 在出队时，先将pushStack中元素依次弹出并插入到popStack中
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    private static class Main{
        public static void main(String[] args) {
            StackToQueues stack = new StackToQueues();
            stack.push(1);
            stack.push(2);
            System.out.println( stack.pop() );
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            stack.push(7);
            stack.push(8);
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
            System.out.println( stack.pop() );
        }
    }
}
