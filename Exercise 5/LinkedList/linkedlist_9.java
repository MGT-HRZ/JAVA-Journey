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
public class linkedlist_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        linkedlist_9 data = new linkedlist_9();

        int i = 0;

        do {
            System.out.println(" ");

            System.out.println("--------------");
            System.out.println("JUALAN AIRKU");
            System.out.println("--------------");

            System.out.println("\n1. Insert air dan harga");
            System.out.println("2. Papar air");
            System.out.println("3. Susunan Menaik");
            System.out.println("4. Susunan Menurun");
            System.out.println("5. Carian air");
            System.out.println("6. Keluar Sistem");

            System.out.print("\nEnter your choice : ");
            i = input.nextInt();
            input.nextLine();

            if (i == 1) {
                System.out.print("\nMasukkan nama air : ");
                String namaair = input.nextLine();

                System.out.print("Add harga air : ");
                double harga = input.nextDouble();

                data.insert(namaair, harga);

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
                System.out.print("\nCari air : ");
                String cariair = input.nextLine();

                if (data.search(cariair)) {
                    System.out.println("\n" + cariair + " ada dalam senarai.");
                } 
                
                else {
                    System.out.println("\n" + cariair + " tidak ada dalam senarai.");
                }
            }

            else if (i == 6) {
                System.out.println("\nKeluar Sistem...");
            }

            else {
                System.out.println("\nThis is not an option!");
            }
            
        } 
        
        while (i != 6);
    }

    static Node head = null;
    static Node tail = null;

    public static class Node {
        double data;
        String namaair;
        Node next;

        public Node(String na, double d) {
            this.namaair = na;
            this.data = d;
            this.next = null;
        }
    }

    public void insert(String na, double data) {
        Node newNode = new Node(na, data);

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
        double tempData;
        String tempNamaair;

        if (head == null) {
            System.out.println("\nSenarai Kosong\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Nama Air : Harga");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        tempData = current.data;
                        tempNamaair = current.namaair;

                        current.data = index.data;
                        current.namaair = index.namaair;

                        index.data = tempData;
                        index.namaair = tempNamaair;
                    }

                    index = index.next;
                }

                System.out.println(current.namaair + " : RM " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting harga air dalam urutan menaik berjaya!");
            
        }
    }

    public void sortdesc() {
        Node current = head, index = null;
        double tempData;
        String tempNamaair;

        if (head == null) {
            System.out.println("\nSenarai Kosong\n");
            return;
        }

        else {
            System.out.println(" ");
            System.out.println("Nama Air : Harga");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.data < index.data) {
                        tempData = current.data;
                        tempNamaair = current.namaair;

                        current.data = index.data;
                        current.namaair = index.namaair;

                        index.data = tempData;
                        index.namaair = tempNamaair;
                    }

                    index = index.next;
                }

                System.out.println(current.namaair + " : RM " + current.data);

                current = current.next;
            }

            System.out.println("\nSorting harga air dalam urutan menurun berjaya!");
            
        }
    }

    public boolean search(String cari_air) {
        Node current = head;

        int num = 0;
        
        while (current != null) {
            if (current.namaair.equals(cari_air)) {
                System.out.println("\nKedudukan pada index : " + num);

                return true; // Found
            }
            
            current = current.next;
            num++;
        }

        System.out.println(" ");

        return false; // Not found
    }

    public void display() {
        Node current = head;

        if (head == null) {
            System.out.println("\nSenarai Kosong\n");
            return;
        }

        System.out.println(" ");

        while (current != null) {
            System.out.println(current.namaair + " : RM " + current.data);

            current = current.next;
        }

        System.out.println(" ");
    }
}
