package LinkedList;

import java.util.Scanner;

public class linkedlist_10 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        linkedlist_10 items = new linkedlist_10(); // Creating an instance of the linkedlist_10 class
        //Scanner input = new Scanner (System.in);

        int option;

        do {
            MainMenu(); // Displaying the main menu

            System.out.println("========================================");
            System.out.print("Insert Option : "); option = input.nextInt(); // Getting user's option choice
            System.out.println("========================================");

            switch (option) {
                case 1:
                    int totalItems;

                    System.out.println("\n========================================");
                    System.out.print("Total Items : ");
                    totalItems = input.nextInt();  // Getting the total number of items to insert
                    System.out.println("========================================");

                    input.nextLine();

                    for (int count = 0; count < totalItems; count++) {
                        System.out.println("========================================");
                        System.out.print("Item Name : "); String itemName = input.nextLine();
                        System.out.print("Quantity : "); int itemQty = input.nextInt();
                        System.out.print("Price : "); double itemPrice = input.nextDouble();
                        System.out.println("========================================");

                        // Add insert method from linkedlist class
                        items.itemINSERT(itemName, itemQty, itemPrice); // Inserting item into the linked list

                        input.nextLine();
                        System.out.println("");
                    }

                    System.out.println("========================================");
                    System.out.println("ITEMS REGISTERED");
                    System.out.println("========================================");

                    System.out.println("");
                    
                    break;

                case 2:
                    items.itemDISPLAY(); // Displaying all items in the troli

                    break;

                case 3:
                    items.priceMAX(); // Displaying the item with maximum price

                    break;

                case 4:
                    items.priceMIN(); // Displaying the item with minimum price

                    break;

                case 5:
                    items.qtySORT_ASC(); // Sorting items in ascending order of quantity

                    break;

                case 6:
                    items.qtySORT_DESC(); // Sorting items in descending order of quantity

                    break;

                case 7:
                    System.out.println("\n========================================");
                    input.nextLine();
                    System.out.print("Search Items : ");
                    String itemSearch = input.nextLine(); // Getting the item name to search for
                    System.out.println("========================================");

                    System.out.println("\n========================================");

                        if (items.itemSEARCH(itemSearch)) { // Searching for the item in the troli
                            System.out.println(itemSearch + " Found!");
                        }

                        else {
                            System.out.println(itemSearch + " is Not Found!");
                        }

                    System.out.println("========================================");

                    System.out.println("");

                    break;

                case 8:
                    exitApp(); // Exiting the application

                    break;

                default:
                    break;
            }
        }

        while (option != 0);
    }

    // Displaying the main menu
    private static void MainMenu() {
        System.out.println("========================================");
        System.out.println("\tTROLI SYSTEM IN A GROCER");
        System.out.println("========================================");
        System.out.println("1. Insert Items Into Troli");
        System.out.println("2. Display Troli Items");
        System.out.println("3. Current Max Items");
        System.out.println("4. Current Min Items");
        System.out.println("5. Sort Ascending Order");
        System.out.println("6. Sort Descending Order");
        System.out.println("7. Search For Items In Troli");
        System.out.println("8. Exit System");
    }

    // Exiting the system
    private static void exitApp() {
        String exit;

        System.out.print("\nExiting? (Y/N): ");
        exit = input.next();

        if (exit.equalsIgnoreCase("Y")) {
            System.out.println("\n========================================");
            System.out.println("Exiting System. See You Again!");
            System.out.println("========================================");
            System.exit(0);
        } else {
            System.out.println("\nBack to Main Menu...");
            System.out.println("");
        }
    }

    // Node class for the linked list
    static Node head = null;
    static Node tail = null;

    public static class Node {
        String item_name;
        int item_qty;
        double item_price;
        Node next;

        // Constructor for the Node class
        public Node(String itemName, int itemQty, double itemPrice) {
            this.item_name = itemName;
            this.item_qty = itemQty;
            this.item_price = itemPrice;
            this.next = null;
        }
    }

    // Inserting an item into the linked list
    public void itemINSERT(String itemName, int itemQty, double itemPrice) {
        Node newNode = new Node(itemName, itemQty, itemPrice);

        if (head == null) {
            head = newNode;
            tail = newNode;
        }

        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Displaying all items in the troli
    public void itemDISPLAY() {
        Node current = head;
        double total = 0;

        if (head == null) {
            System.out.println("\nTROLI EMPTY\n");
            return;
        }

        System.out.println("");

        System.out.println("Item\tQty\tPrice");

        while (current != null) {
            System.out.println(current.item_name + "\t" + current.item_qty + "\t" + current.item_price);

            total = total + current.item_price;
            current = current.next;

        }

        System.out.println("========================================");
        System.out.println("Total Price : RM " + total);
        System.out.println("========================================");

        System.out.println("");
    }

    // Displaying the item with maximum price
    public void priceMAX() {
        Node current = head;
        String max_item;
        double max_price;


        if (head == null) {
            System.out.println("\nTROLI EMPTY\n");
            return;
        }

        else {
            max_price = head.item_price;
            max_item = current.item_name;

            while (current != null) {
                if (max_price < current.item_price) {
                    max_price = current.item_price;
                    max_item = current.item_name;
                }

                current = current.next;
            }

            System.out.println("\n========================================");
            System.out.println("MAX PRICE");
            System.out.println("========================================");
            System.out.println("Item :" + max_item);
                System.out.println("Price :" + max_price);
            System.out.println("========================================");

            System.out.println("");
        }
    }

    // Displaying the item with minimum price
    public void priceMIN() {
        Node current = head;
        String min_item;
        double min_price;


        if (head == null) {
            System.out.println("\nTROLI EMPTY\n");
            return;
        }

        else {
            min_price = head.item_price;
            min_item = current.item_name;

            while (current != null) {
                if (min_price > current.item_price) {
                    min_price = current.item_price;
                    min_item = current.item_name;
                }

                current = current.next;
            }
            
            System.out.println("\n========================================");
            System.out.println("MIN PRICE");
            System.out.println("========================================");
            System.out.println("Item :" + min_item);
            System.out.println("Price :" + min_price);
            System.out.println("========================================");

            System.out.println("");
        }
    }

    // Sorting items in ascending order of quantity
    public void qtySORT_ASC() {
        Node current = head, index = null;
        String sort_item;
        int sort_qty;

        if (head == null) {
            System.out.println("\nTROLI EMPTY\n");
            return;
        }

        else {
            System.out.println("\n========================================");
            System.out.println("Item\tQty");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.item_qty > index.item_qty) {
                        sort_item = current.item_name;
                        sort_qty = current.item_qty;

                        current.item_name = index.item_name;
                        current.item_qty = index.item_qty;

                        index.item_name = sort_item;
                        index.item_qty = sort_qty;
                    }

                    index = index.next;
                }

                System.out.println(current.item_name + "\t" + current.item_qty);

                current = current.next;
            }

            System.out.println("========================================");
            System.out.println("Sorting in ascending order is a GO!");
            System.out.println("========================================");

            System.out.println("");
        }
    }

    // Sorting items in descending order of quantity
    public void qtySORT_DESC() {
        Node current = head, index = null;
        String sort_item;
        int sort_qty;

        if (head == null) {
            System.out.println("\nTROLI EMPTY\n");
            return;
        }

        else {
            System.out.println("\n========================================");
            System.out.println("Item\tQty");

            while (current != null) {
                index = current.next;

                while (index != null) {
                    if (current.item_qty < index.item_qty) {
                        sort_item = current.item_name;
                        sort_qty = current.item_qty;

                        current.item_name = index.item_name;
                        current.item_qty = index.item_qty;

                        index.item_name = sort_item;
                        index.item_qty = sort_qty;
                    }

                    index = index.next;
                }

                System.out.println(current.item_name + "\t" + current.item_qty);

                current = current.next;
            }

            System.out.println("========================================");
            System.out.println("Sorting in descending order is a GO!");
            System.out.println("========================================");

            System.out.println("");
        }
    }

    // Searching for an item in the troli
    public boolean itemSEARCH(String itemName) {
        Node current = head;
        int place = 0;

        while (current != null) {
            if (current.item_name.equals(itemName)) {
                System.out.println("The item index : " + place);

                return true;
            }

            current = current.next;
            place++;
        }

        System.out.println("");

        return false;
    }
}
