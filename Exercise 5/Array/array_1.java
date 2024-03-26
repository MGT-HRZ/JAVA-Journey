/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author spide
 */
public class array_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, bil, search, store[];

        System.out.print("Enter array length : ");
        bil = input.nextInt();

        store = new int[bil];

        System.out.println("");

        for (x = 0; x < bil; x++) {
            System.out.print("Enter number : ");
            store[x] = input.nextInt();
        }

        System.out.print("\nSearch number : ");
        search = input.nextInt();

        for (x = 0; x < bil; x++) {
            if (search == store[x]) {
                System.out.println(store[x] + " has been found in index " + x);
                break;
            }
        }

        if (x == bil) {
            System.out.println(search + " has not found");
        }
    }
}
