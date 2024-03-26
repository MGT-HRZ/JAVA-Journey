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
public class linkedlist_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linkedlist_7 data = new linkedlist_7();

        int i = 0;

        do {
            System.out.println(" ");

            System.out.println("-----------------------");
            System.out.println("APLIKASI JUMLAH PELAJAR");
            System.out.println("-----------------------");

            System.out.println("Insert class name");
            String nameclass = input.nextLine();

            System.out.println("\n1. Insert data");
            System.out.println("2. Show data");
            System.out.println("3. Max class");
            System.out.println("4. Min class");
            System.out.println("5. Sort ascending");
            System.out.println("6. Sort descending");
            System.out.println("7. Exit System");

            System.out.println("\nEnter your choice:");
            i = input.nextInt();

            if (i == 1) {
                System.out.print("\nTotal of Students : ");
                int total = input.nextInt();

                data.insert(nameclass, total);
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
                data.sortasc();
            }

            else if (i == 6) {
                data.sortdesc();
            }

            else if (i == 7) {
                System.out.println("\nExit System...");
            }

            else {
                System.out.println("\nThis is not an option!");
            }
            
        } 
        
        while (i != 7);
    }

    static Node head = null;
    static Node tail = null;

    public static class Node {
        int data;
        String classname;
        Node next;

        public Node(String cn, int d) {
            this.classname = cn;
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

    public void max() {
        Node current = head;
        int max;
        String cn;

        if (head == null) {
            System.out.println("\nList is empty\n");
        }

        else {
            max = head.data;
            cn = current.classname;

            while (current != null) {
                if (max < current.data) {
                    max = current.data;
                    cn = current.classname;
                }

                current = current.next;
            }

            System.out.println("\nClass :" + cn);
            System.out.println("Students :" + max);
        }
    }

    public void min() {
        Node current = head;
        int min;
        String cn;

        if (head == null) {
            System.out.println("\nList is empty\n");
        }

        else {
            min = head.data;
            cn = current.classname;

            while (current != null) {
                if (min > current.data) {
                    min = current.data;
                    cn = current.classname;
                }

                current = current.next;
            }

            System.out.println("\nClass :" + cn);
            System.out.println("Students :" + min);
        }
    }

    public void sortasc() {
        Node current = head, index = null;
        int tempData;
        String tempClassname;

        if (head == null) {
            System.out.println("\nList is empty\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Class Name : Students");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        tempData = current.data;
                        tempClassname = current.classname;

                        current.data = index.data;
                        current.classname = index.classname;

                        index.data = tempData;
                        index.classname = tempClassname;
                    }

                    index = index.next;
                }

                System.out.println(current.classname + " : " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting student in ascending order success!");
            
        }
    }

    public void sortdesc() {
        Node current = head, index = null;
        int tempData;
        String tempClassname;

        if (head == null) {
            System.out.println("\nList is empty\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Class Name : Students");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data < index.data) {
                        tempData = current.data;
                        tempClassname = current.classname;

                        current.data = index.data;
                        current.classname = index.classname;

                        index.data = tempData;
                        index.classname = tempClassname;
                    }

                    index = index.next;
                }

                System.out.println(current.classname + " : " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting student in descending order success!");
            
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
            System.out.println("Class " + current.classname + " : " + current.data);

            current = current.next;
        }

        System.out.println(" ");
    }
}
