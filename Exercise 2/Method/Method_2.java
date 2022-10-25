package Method;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 16/8/2022
// Tajuk : Latihan Method

import java.util.Scanner;

public class Method_2 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Tapak : ");
        double t1 = input.nextDouble();
        
        System.out.print("Enter Tinggi : ");
        double t2 = input.nextDouble();
        
        double jum1 = luas_segi_tiga(t1, t2);
        
        System.out.println("Jumlah luas segi tiga : " + jum1);
        
        
        
        System.out.print("\nEnter Panjang : ");
        double p = input.nextDouble();
        
        System.out.print("Enter Lebar : ");
        double l = input.nextDouble();
        
        double jum2 = luas_segi_empat(p, l);
        
        System.out.println("Jumlah luas segi empat : " + jum2);
    }
    
    static double luas_segi_tiga(double t1, double t2)
    {
        double jum;
        
        jum = 0.5 * t1 * t2;
        
        return jum;
    }
    
    static double luas_segi_empat(double p, double l)
    {
        double jum;
        
        jum = p * l;
        
        return jum;
    }
}
