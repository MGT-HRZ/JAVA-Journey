package LinkedList;

import java.util.LinkedList;

public class linkedlist_2 {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<Integer>();

        linky.add(6);
        linky.add(23);
        linky.add(1);

        System.out.println(linky);

        System.out.println(linky.getFirst());

        System.out.println(linky.get(1));
    }
}
