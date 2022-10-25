package Loop_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 7/8/2022
// Tajuk : Loop Statement

import java.util.Scanner;

public class Loop_While2 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        // Soalan 1
        
        int a = 1;
        
        while (a <= 10){
            System.out.println("PRACTICE MAKES PERFECT");
            a++;
        }
        
        System.out.println("\n\n");
        
        // Soalan 2
        
        int b = 10;
        
        while (b <= 20){
            System.out.print(b + "\t");
            b+=2;
        }
        
        System.out.println("\n\n");
        
        // Soalan 3
        
        int c = 2;
        
        System.out.println("Nombor \t\tGanda Dua \tGanda Tiga");
        
        while (c <= 10){
            System.out.println(c + "\t\t" + (c * c) + "\t\t" + (c * c * c));
            c++;
        }
        
        System.out.println("\n\n");
        
        // Soalan 4
        
        int d = 1;
        
        while (d <= 4){
            System.out.println("\nMasukkan tapak dan tinggi : ");
            
            System.out.print("Tapak = ");
            double t1 = input.nextDouble();
            
            System.out.print("Tinggi = ");
            double t2 = input.nextDouble();
            
            System.out.print("Tinggi = ");
            double p = input.nextDouble();
            
            System.out.println("===============================================");
            System.out.println("Panjang kiub = " + p);
            System.out.println("Isipadu kiub = " + (t1 * t2 * p));
            System.out.println("===============================================");
            d++;
        }
    }
}
