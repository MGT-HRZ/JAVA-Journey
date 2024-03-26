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
public class linkedlist_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linkedlist_8 data = new linkedlist_8();

        int i = 0;

        do {
            System.out.println(" ");

            System.out.println("------------------");
            System.out.println("JUALAN KENDERAAN");
            System.out.println("------------------");

            System.out.println("\n1. Insert car price");
            System.out.println("2. Show car table");
            System.out.println("3. Sort ascending");
            System.out.println("4. Sort descending");
            System.out.println("5. Exit System");

            System.out.println("\nEnter your choice:");
            i = input.nextInt();
            input.nextLine();

            if (i == 1) {
                System.out.print("\nInsert car name : ");
                String carname = input.nextLine();

                System.out.print("Add car unit : ");
                int unit = input.nextInt();

                data.insert(carname, unit);

                input.nextLine();
            }

            else if (i == 2) {
                data.display();
            }

            else if (i == 3) {
                data.sortasc();
            }

            else if (i == 4) {
                data.sortdesc();
            }

            else if (i == 5) {
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
        String carname;
        Node next;

        public Node(String cn, int d) {
            this.carname = cn;
            this.data = d;
            this.next = null;
        }
    }

    public void insert(String cn, int data) {
        Node newNode = new Node(cn, data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void sortasc() {
        Node current = head, index = null;
        int tempData;
        String tempCarname;

        if (head == null) {
            System.out.println("\nList is empty\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Car Name : Units");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        tempData = current.data;
                        tempCarname = current.carname;

                        current.data = index.data;
                        current.carname = index.carname;

                        index.data = tempData;
                        index.carname = tempCarname;
                    }

                    index = index.next;
                }

                System.out.println(current.carname + " : " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting car unit in ascending order success!");
            
        }
    }

    public void sortdesc() {
        Node current = head, index = null;
        int tempData;
        String tempCarname;

        if (head == null) {
            System.out.println("\nList is empty\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Car Name : Units");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data < index.data) {
                        tempData = current.data;
                        tempCarname = current.carname;

                        current.data = index.data;
                        current.carname = index.carname;

                        index.data = tempData;
                        index.carname = tempCarname;
                    }

                    index = index.next;
                }

                System.out.println(current.carname + " : " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting car unit in descending order success!");
            
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
            System.out.println(current.carname + " : " + current.data + " units");

            current = current.next;
        }

        System.out.println(" ");
    }
}
