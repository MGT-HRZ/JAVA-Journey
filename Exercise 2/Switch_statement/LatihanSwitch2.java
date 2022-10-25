package Switch_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 3/8/2022
// Tajuk : Latihan Switch case 2

import java.util.Scanner;

public class LatihanSwitch2 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Menu pilihan anda :");
        System.out.println("\t1. Nama dan No.K/P");
        System.out.println("\t2. No. Telefon");
        System.out.println("\t3. Alamat");
        
        System.out.print("Sila pilih menu berikut (1,2 atau 3) : ");
        int nom = input.nextInt();
        
        switch(nom)
        {
            case 1 : {
                input.nextLine();
                System.out.print("\nMasukkan Nama : ");
                String nama = input.nextLine();
                
                System.out.print("Masukkan No.K/P : ");
                String kp = input.nextLine();
                
                System.out.println("=================================");
                System.out.println("Nama anda ialah " + nama + " dan No. K/P ialah " + kp);
                System.out.println("=================================");
                break;
            }
            
            case 2 : {
                input.nextLine();
                System.out.print("\nMasukkan No. Telefon : ");
                String tf = input.nextLine();
                
                System.out.println("=================================");
                System.out.println("No. Telefon anda ialah " + tf);
                System.out.println("=================================");
                break;
            }
            
            case 3 : {
                input.nextLine();
                System.out.print("\nMasukkan Alamat : ");
                String alamat = input.nextLine();
                
                System.out.println("=================================");
                System.out.println("Alamat anda ialah " + alamat);
                System.out.println("=================================");
                break;
            }
            
            default : {
                System.out.println("\n=================================");
                System.out.println("Maaf Salah Input");
                System.out.println("=================================");
            }
        }
    }
}
