/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author spide
 */
public class array_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, bil, search, store[], result;

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

        result = Arrays.binarySearch(store, search);

        if (result < 0) {
            System.out.println("Index not found!");
        }

        else {
            System.out.println("Index found at index " + result);
        }
    }
}
