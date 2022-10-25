package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Latihan Amali 1

import java.util.Scanner;
import java.text.DecimalFormat;

public class Latihan_9 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        System.out.print("Panjang jejari : ");
        double j = scan.nextDouble();
        
        System.out.println("Luas bulatan dengan nilai jejari = " + j + "cm ialah = " + DF.format(3.142 * j * j));
        
    }
}


