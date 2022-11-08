package com.datastructurestackandqueue;

import java.util.Stack;

public class PeakAndPop {
    private class Node {

        int data;
        Node link;
    }

    Node top;

    PeakAndPop() {
        this.top = null;
    }

    @SuppressWarnings("unused")
    public void push(int x) {
        Node temp = new Node();
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }
        temp.data = x;

        temp.link = top;
        top = temp;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack Underflow");

        } else {
            Node temp = top;
            while (temp != null) {
                System.out.printf("-> %d  ", temp.data);
                temp = temp.link;
            }
        }
    }

    public void pop() {
        if (top == null) {
            System.out.print("\nStack Underflow");
            return;
        }
        top = (top).link;
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Stack<Integer> STACK = new Stack<Integer>();
        STACK.push(70);
        STACK.push(30);
        STACK.push(56);
        System.out.println("Initial Stack: " + STACK);
        System.out.println("The element at the top of the"+ " stack is: " + STACK.peek());
        STACK.pop();
        System.out.println("Final Stack: " + STACK);
        System.out.println("The element at the top of the" + " stack is: " + STACK.peek());

    }
}
