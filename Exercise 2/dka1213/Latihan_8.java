package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_8 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tapak = ");
        double t1 = input.nextDouble();
        
        System.out.print("Tinggi = ");
        double t2 = input.nextDouble();
        
        System.out.println("\nTapak = " + t1 + "cm");
        
        System.out.println("Tinggi = " + t2 + "cm");
        
        System.out.println("Luas segi tiga = " + (0.5 * (t1 * t2)) + "cm");
    }
}
