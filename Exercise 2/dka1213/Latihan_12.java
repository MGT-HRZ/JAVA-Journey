package dka1213;

// Tajuk : Latihan Do While

import java.util.Scanner;

public class Latihan_12 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int select;
        
        do {
            System.out.println("\nMenu :");
            System.out.println("1. Luas Bulatan");
            System.out.println("2. Luas Segi Tiga");
            System.out.println("3. Luas Segi Empat");
            System.out.println("4. Keluar");

            System.out.print("Masukkan Pilihan anda (1 / 2 / 3 / 4) : ");
            select = input.nextInt();

            switch (select)
            {
                case 1 : {
                   System.out.println("\nLuas Bulatan");
                   System.out.print("Masukkan jejari : ");
                   double j = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Luas Bulatan ialah : " + (3.142 * j * j));
                   System.out.println("=================================");
                   break; 
                }
                case 2 : {
                   System.out.println("\nLuas Segi Tiga");
                   System.out.print("Masukkan tapak : ");
                   double t1 = input.nextDouble();
                   System.out.print("Masukkan tinggi : ");
                   double t2 = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Luas Segi Tiga ialah : " + (0.5 * t1 * t2));
                   System.out.println("=================================");
                   break; 
                }
                case 3 : {
                   System.out.println("\nLuas Segi Empat");
                   System.out.print("Masukkan panjang : ");
                   double p = input.nextDouble();
                   System.out.print("Masukkan lebar : ");
                   double l = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Luas Segi Empat ialah : " + (p * l));
                   System.out.println("=================================");
                   break;
                }
                case 4 : {
                   System.out.println("=================================");
                   System.out.println("Sistem Tamat, Terima Kasih !");
                   System.out.println("=================================");
                   break;
                }
                default :
                {
                    System.out.println("=================================");
                    System.out.println("Anda Memasukkan Input yang salah");
                    System.out.println("=================================");
                }

            }
            
            if (select >= 4){
                break;
            }
            
        }
        
        while (select != 4);
        
    }
}
