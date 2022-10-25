package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 9/8/2022
// Tajuk : Latihan Do While

import java.util.Scanner;

public class Latihan_11 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int select;
        
        do {
            System.out.println("\nPilihan Menu Anda :");
            System.out.println("\t1. Kentang Goreng (RM 3.50)");
            System.out.println("\t2. Burger Ayam (RM 3.00)");
            System.out.println("\t3. Ayam Goreng (RM 5.00)");

            System.out.print("Masukkan Pilihan anda (1 / 2 / 3 / (4 = TAMAT)) : ");
            select = input.nextInt();

            switch (select)
            {
                case 1 : {
                   System.out.println("\nMenu Pilihan : Kentang Goreng");
                   System.out.print("Masukkan Bilangan : ");
                   int case1 = input.nextInt();
                   System.out.println("=================================");
                   System.out.println("JUMLAH PERLU DIBAYAR : RM " + (case1 * 3.5));
                   System.out.println("=================================");
                   break; 
                }
                case 2 : {
                   System.out.println("\nMenu Pilihan : Burger Ayam");
                   System.out.print("Masukkan Bilangan : ");
                   int case2 = input.nextInt();
                   System.out.println("=================================");
                   System.out.println("JUMLAH PERLU DIBAYAR : RM " + (case2 * 3.0));
                   System.out.println("=================================");
                   break; 
                }
                case 3 : {
                   System.out.println("\nMenu Pilihan : Ayam Goreng");
                   System.out.print("Masukkan Bilangan : ");
                   int case3 = input.nextInt();
                   System.out.println("=================================");
                   System.out.println("JUMLAH PERLU DIBAYAR : RM " + (case3 * 5.0));
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
