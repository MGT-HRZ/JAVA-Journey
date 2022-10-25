package dka1213;

// Tajuk : Luas bulatan

import java.text.DecimalFormat;

public class Latihan_2 {
    public static void main(String args[])
    {
        double pi = 3.142;
        double j = 7.9;
        
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        System.out.println("Luas bulatan = " + DF.format(pi * j * j));
        
    }
}

