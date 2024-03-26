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
public class array_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, bil, store[];

        System.out.print("Enter array length : ");
        bil = input.nextInt();

        store = new int[bil];

        System.out.println("");

        for (x = 0; x < bil; x++) {
            System.out.print("Enter number : ");
            store[x] = input.nextInt();
        }

        int max = store[0];
        int min = store[0];

        for (x = 0; x < bil; x++) {
            if (store[x] > max) {
                max = store[x];
            }

            if (store[x] < min) {
                min = store[x];
            }
        }

        System.err.println("\nThe max number is " + max);

        System.err.println("\nThe min number is " + min);

       
    }
}
