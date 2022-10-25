package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Latihan Amali 1

import java.util.Scanner;
import java.text.DecimalFormat;

public class Latihan_10 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        System.out.print("Lebar segi empat tepat = ");
        int lebar = input.nextInt();
        
        System.out.print("Panjang segi empat tepat = ");
        int panjang = input.nextInt();
        
        System.out.println("\nLebar segi empat tepat = " + lebar + "cm");
        
        System.out.println("Panjang segi empat tepat = " + panjang + "cm");
        
        System.out.println("Luas segi empat tepat = " + (lebar * panjang) + "cm");
        
        System.out.print("\nSila masukkan jejari = ");
        double j = input.nextDouble();
        
        System.out.print("Sila masukkan tinggi = ");
        double t = input.nextDouble();
        
        System.out.println("Isipadu silinder = " + DF.format((3.142 * j * j)* t));
    }
}
