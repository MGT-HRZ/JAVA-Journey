package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 19/7/2022
// Tajuk : Operasi dalam JAVA (Tambah, Tolak, Darab, Bahagi & Modulus)

import java.util.Scanner;

public class Latihan_1 {
    public static void main(String args[])
    {
        // int nom1 = 78;
        // int nom2 = 10;
        
        // double bahagi = nom1 / nom2;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nombor 1 : ");
        int nom1 = scan.nextInt();
        
        System.out.print("Masukkan Nombor 2 : ");
        int nom2 = scan.nextInt();
        
        System.out.println("\nHasil Tambah : " + (nom1 + nom2));
        
        System.out.println("Hasil Tolak : " + (nom1 - nom2));
        
        System.out.println("Hasil Darab : " + (nom1 * nom2));
        
        System.out.println("Hasil Bahagi 1 : " + (nom1 / nom2));
        
        // System.out.println("Hasil Bahagi 2 : " + bahagi);
        
        System.out.println("Hasil Modulus : " + (nom1 % nom2));
    }
}
