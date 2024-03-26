/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class linkedlist_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linkedlist_6 data = new linkedlist_6();

        int i = 0;

        do {
            System.out.println(" ");

            System.out.println("-----------------------");
            System.out.println("HOSPITAL SERI PUTRA");
            System.out.println("-----------------------");

            System.out.println("Insert the year");
            int year = input.nextInt();

            System.out.println("\n1. Insert Record");
            System.out.println("2. Show Record");
            System.out.println("3. Searching largest data");
            System.out.println("4. Searching smallest data");
            System.out.println("5. Sort data");
            System.out.println("6. Exit System");

            System.out.println("\nEnter your choice:");
            i = input.nextInt();

            if (i == 1) {
                System.out.print("\nTotal of Patients : ");
                int total = input.nextInt();

                data.insert(year, total);
            }

            else if (i == 2) {
                data.display();
            }

            else if (i == 3) {
                data.max();
            }

            else if (i == 4) {
                data.min();
            }

            else if (i == 5) {
                data.sort();
            }

            else if (i == 6) {
                System.out.println("\nExit System...");
            }

            else {
                System.out.println("\nThis is not an option!");
            }
            
        } 
        
        while (i != 5);
    }

    static Node head = null;
    static Node tail = null;

    public static class Node {
        int data;
        int year;
        Node next;

        public Node(int y, int d) {
            this.year = y;
            this.data = d;
            this.next = null;
        }
    }

    public void insert(int year, int data) {
        Node newNode = new Node(year, data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void max() {
        Node current = head;
        int max, y;

        if (head == null) {
            System.out.println("\nList is empty\n");
        }

        else {
            max = head.data;
            y = current.year;

            while (current != null) {
                if (max < current.data) {
                    max = current.data;
                    y = current.year;
                }

                current = current.next;
            }

            System.out.println("\nYear :" + y);
            System.out.println("Patients :" + max);
        }
    }

    public void min() {
        Node current = head;
        int min, y;

        if (head == null) {
            System.out.println("\nList is empty\n");
        }

        else {
            min = head.data;
            y = current.year;

            while (current != null) {
                if (min > current.data) {
                    min = current.data;
                    y = current.year;
                }

                current = current.next;
            }

            System.out.println("\nYear :" + y);
            System.out.println("Patients :" + min);
        }
    }

    public void sort() {
        Node current = head, index = null;
        int tempData;
        int tempYear;

        if (head == null) {
            System.out.println("\nList is empty\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Year : Patients");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data < index.data || (current.data == index.data && current.year < index.year)) {
                        tempData = current.data;
                        tempYear = current.year;

                        current.data = index.data;
                        current.year = index.year;

                        index.data = tempData;
                        index.year = tempYear;
                    }

                    index = index.next;
                }

                System.out.println(current.year + " : " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting patient in descending order success!");
            
        }
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("\nList is empty\n");
            return;
        }

        System.out.println(" ");

        while (current != null) {
            System.out.println("Year " + current.year + " : " + current.data);

            current = current.next;
        }

        System.out.println(" ");
    }
}
