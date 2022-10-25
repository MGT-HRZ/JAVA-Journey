package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_6 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lebar segi empat tepat = ");
        int lebar = input.nextInt();
        
        System.out.print("Panjang segi empat tepat = ");
        int panjang = input.nextInt();
        
        System.out.println("\nLebar segi empat tepat = " + lebar + "cm");
        
        System.out.println("Panjang segi empat tepat = " + panjang + "cm");
        
        System.out.println("Luas segi empat tepat = " + (lebar * panjang) + "cm");
    }
}
