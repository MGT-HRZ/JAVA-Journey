package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 15/8/2022
// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_15 {
    public static void main(String agrs[])
    {
        Scanner input = new Scanner(System.in);
        
        double GPK, merit;
        
        int emas = 0;
        
        int perak = 0;
        
        int zero = 0;
        
        int x;
        
        System.out.print("Enter number of students : ");
        int num = input.nextInt();
        
        for (x = 0; x < num; x++){
            System.out.print("\nEnter GPK : ");
            GPK = input.nextDouble();
            
            System.out.print("Enter merit : ");
            merit = input.nextInt();  
            
            if (GPK <= 2.5 && merit >= 100){
                emas++;
            }

            else if (GPK <= 3.5 && merit >= 90){
                perak++;
            }

            else if (GPK <= 0 && merit <= 0){
                zero++;
            }
        }
         
        System.out.println("\nBintang emas : " + emas);
        
        System.out.println("Bintang perak : " + perak);
        
        System.out.println("Tiada bintang : " + zero);
        
    }

}
