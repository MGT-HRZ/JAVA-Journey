package dka1213;

// Tajuk : Luas bulatan (Input data)

import java.util.Scanner;
import java.text.DecimalFormat;

public class Latihan_3 {
    public static void main(String args[])
    {
        double pi = 3.142;
        
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        System.out.print("Panjang jejari : ");
        double j = scan.nextDouble();
        
        System.out.println("Luas bulatan = " + DF.format(pi * j * j));
        
    }
}

