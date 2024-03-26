package LinkedList;

import java.util.*;

public class linkedlist_3 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add("Hello");
        list.add(2);
        list.add("Chocolate");
        list.add("10");

        System.out.println("LinkedList:" + list);

        System.out.println("Size of the List:" + list.size());

        list.addFirst("Van Houten");

        System.out.println("LinkedList:" + list);

        System.out.println("Size of the List:" + list.size());

        list.addLast("Cadbury");

        System.out.println("LinkedList:" + list);

        System.out.println("Size of the List:" + list.size());
    }
}
