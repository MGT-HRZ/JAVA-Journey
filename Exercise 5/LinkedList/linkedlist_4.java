package LinkedList;

import java.util.*;

public class linkedlist_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoublyLinkedList carList = new DoublyLinkedList();

        int num = 1;

        do {

            System.out.print("\nAdd Car : ");
            String carName = input.nextLine();

            carList.add(carName);

            System.out.println("\n1 = Continue");
            System.out.println("2 = Stop");

            num = input.nextInt();
            input.nextLine();

        } 
        
        while (num != 2);

        System.out.println("\nCar List :");
        carList.print();

        System.out.println("Peek Car :");
        System.out.println("First Car -> " + carList.peekFirst());
        System.out.println("Last Car -> " + carList.peekLast());

        System.out.println("\nTotal Cars : " + carList.count());

        // Searching for a car
        System.out.print("\nEnter a car to search: ");

        String searchCar = input.nextLine();

        if (carList.search(searchCar)) {
            System.out.println(searchCar + " found in the Car List.");
        } 
        
        else {
            System.out.println(searchCar + " not found in the Car List.");
        }

    }
}

class DoublyLinkedList {

    // Node class definition
    public static class Node {
        String data;
        Node next;
        Node prev;

        public Node(String data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;

    public void add(String data) {
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
        int num = 0;
                
        Node current = head;

        while (current != null) {
            System.out.println(num++ + " - " + current.data);
            current = current.next;
        }

        System.out.println();
    }

    public String peekFirst() {
        if (head != null) {
            return head.data;
        }

        return null;
    }

    public String peekLast() {
        if (tail != null) {
            return tail.data;
        }

        return null;
    }

    public boolean search(String searchData) {
        Node current = head;

        int num = 0;
        
        while (current != null) {
            if (current.data.equals(searchData)) {
                System.out.println("The index placement : " + num);

                return true; // Found
            }
            
            current = current.next;
            num++;
        }

        return false; // Not found
    }

    public int count() {
        int count = 0;

        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }
}