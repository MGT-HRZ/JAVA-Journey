package LinkedList;

import java.util.*;

public class linkedlist_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linkedlist_5 number = new linkedlist_5();

        int num = 1;

        do {

            System.out.print("\nAdd Number : ");
            int addnum = input.nextInt();

            number.add(addnum);

            System.out.println("\n1 = Continue");
            System.out.println("2 = Stop");

            num = input.nextInt();
            input.nextLine();

        } 
        
        while (num != 2);

        number.print();
        

    }

    //  Linkedlist Area
    
    // Node class definition
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } 
        
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void print() {
        Node current = head;
        
        int loop = 0;
        int max = 0;
        int min = 0;
        
        while (current != null) {
            if (loop == 0) {
                min = current.data;
            }

            if (current.data > max) {
                max = current.data;
            }

            if (current.data < min) {
                min = current.data;  
            }
            
            current = current.next;
            loop++;
        }

        System.out.println("\nMax : " + max);
        System.out.println("Min : " + min);
    }
}