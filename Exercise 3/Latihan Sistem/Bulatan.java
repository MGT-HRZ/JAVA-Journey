package dka1213amalik2;

import java.text.DecimalFormat;

public class Bulatan {
    public static double luas, peri;
    public static void main(String args[])
    {
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        double j = 7.1;
        
        // Papar Output
        simbol1();
        System.out.println("Perimeter bagi bulatan = " + DF.format(kiraperimeter(j)));
        System.out.println("Luas bagi bulatan = " + DF.format(kiraluas(j)));
        simbol2();
    }
    
    // Kira perimeter bulatan
    static double kiraperimeter(double j)
    {
        peri = 2 * 3.142 * j;
        return peri;
    }
    
    // Kira luas bulatan
    static double kiraluas(double j)
    {
        luas = 3.142 * j * j;
        return luas;
    }
    
    // Simbol 1
    static void simbol1()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    // Simbol 2
    static void simbol2()
    {
        System.out.println("---------------------------------------------------------------------------");
    }
}
