package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_7 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bahasa Arab = ");
        double BA = input.nextDouble();
        
        System.out.print("Al-Quran = ");
        double AQ = input.nextDouble();
        
        System.out.print("Aqidah = ");
        double A = input.nextDouble();
        
        System.out.print("Feqah = ");
        double F = input.nextDouble();
        
        System.out.print("Jumlah subjek = ");
        int jum = input.nextInt();
        
        System.out.println("\nBahasa Arab = " + BA);
        
        System.out.println("Al-Quran = " + AQ);
        
        System.out.println("Aqidah = " + A);
        
        System.out.println("Feqah = " + F);
        
        System.out.println("Purata bagi semua subjek agama = " + ((BA + AQ + A + F)/jum));
    }
}
