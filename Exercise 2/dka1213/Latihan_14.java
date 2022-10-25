package dka1213;

// Tajuk : Latihan Do While

import java.util.Scanner;

public class Latihan_14 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int select;
        
        do {
            System.out.println("\nMenu :");
            System.out.println("1. JAM KEPADA MINIT");
            System.out.println("2. MINIT KEPADA SAAT");
            System.out.println("3. SAAT KEPADA MINIT");
            System.out.println("4. KELUAR PROGRAM");

            System.out.print("Pilih (1 / 2 / 3 / 4) : ");
            select = input.nextInt();

            switch (select)
            {
                case 1 : {
                   System.out.print("\nMasukkan bil jam : ");
                   double t1 = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Jam kepada minit : " + (t1 * 60.0) + " minit");
                   System.out.println("=================================");
                   break; 
                }
                case 2 : {
                   System.out.print("\nMasukkan minit : ");
                   double t2 = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Minit kepada saat : " + (t2 * 60.0) + " saat");
                   System.out.println("=================================");
                   break; 
                }
                case 3 : {
                   System.out.print("\nMasukkan saat : ");
                   double t3 = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Saat kepada minit : " + (t3 / 60.0) + " minit");
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
