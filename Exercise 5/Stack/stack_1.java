/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author spide
 */
public class stack_1 {

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack size after pops: " + stack.size());
        stack.printStack();

        System.out.println(" ");

        System.out.println("Peek element: " + stack.peek());
    }

    public static class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;
    
        public Stack(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1;
        }
    
        public void push(int item) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push element.");
                return;
            }
            stackArray[++top] = item;
        }
    
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop element.");
                return -1; // Or throw an exception
            }
            return stackArray[top--];
        }
    
        public int peek() {
            if (isEmpty()) {
                System.out.println("\nStack is empty. Cannot peek element.");
                return 0; // Or throw an exception
            }
            return stackArray[top];
        }
    
        public boolean isEmpty() {
            return (top == -1);
        }
    
        public boolean isFull() {
            return (top == maxSize - 1);
        }
    
        public int size() {
            return top + 1;
        }

        public void printStack() {
            System.out.println("Stack elements:");
            System.out.print("[");
            for (int i = top; i >= 0; i--) {

                if (size() == 1) {
                    System.out.print(stackArray[i]);
                }

                else {
                    System.out.print(stackArray[i] + ", ");
                }
            }
            System.out.print("]");
        }
    
    }
    
}
