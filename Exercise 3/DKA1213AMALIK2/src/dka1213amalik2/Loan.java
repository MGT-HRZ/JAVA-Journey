package dka1213amalik2;

import java.util.Scanner;

public class Loan {
    public static int back;
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG KE SISTEM PINJAMAN");
        System.out.println("MENU PILIHAN :");
        
        line1();
        
        System.out.println("KOD\tJENIS PINJAMAN\t  KADAR PINJAMAN");
        System.out.println("1\tKERETA\t\t  3%");
        System.out.println("2\tRUMAH\t\t  4%");
        System.out.println("3\tPERIBADI\t\t  3.5%");
        
        line1();
        
        System.out.print("Masukkan Kod Pilihan 1, 2, 3 (JENIS PINJAMAN) atau 4 (TAMAT): ");
        int select = input.nextInt();
        
        line2();
        
        switch1(select);
    }
    
    static int switch1(int select)
    {
        Scanner input = new Scanner(System.in);
        
        switch(select)
        {
            case 1: {
                System.out.println("\nPINJAMAN KERETA");
                System.out.print("Masukkan Jumlah Pinjaman : ");
                double jum_pin = input.nextDouble();
                
                System.out.print("Masukkan tempoh pinjaman dalam tahun : ");
                double temp_pin = input.nextDouble();
                
                System.out.println("\nKadar pinjaman kereta 3%");
                
                double total = jum_pin * temp_pin * 0.03;
                
                System.out.println("Jumlah kadar pinjaman anda ialah : " + total);
                
                System.out.println("Jumlah pinjaman kereta : " + (total +  jum_pin));
                
                break;
            }
            
            case 2: {
                System.out.println("\nPINJAMAN RUMAH");
                System.out.print("Masukkan Jumlah Pinjaman : ");
                double jum_pin = input.nextDouble();
                
                System.out.print("Masukkan tempoh pinjaman dalam tahun : ");
                double temp_pin = input.nextDouble();
                
                System.out.println("\nKadar pinjaman rumah 4%");
                
                double total = jum_pin * temp_pin * 0.04;
                
                System.out.println("Jumlah kadar pinjaman anda ialah : " + total);
                
                System.out.println("Jumlah pinjaman kereta : " + (total +  jum_pin));
                
                break;
            }
            
            case 3: {
                System.out.println("\nPINJAMAN PERIBADI");
                System.out.print("Masukkan Jumlah Pinjaman : ");
                double jum_pin = input.nextDouble();
                
                System.out.print("Masukkan tempoh pinjaman dalam tahun : ");
                double temp_pin = input.nextDouble();
                
                System.out.println("\nKadar pinjaman peribadi 3.5%");
                
                double total = jum_pin * temp_pin * 0.035;
                
                System.out.println("Jumlah kadar pinjaman anda ialah : " + total);
                
                System.out.println("Jumlah pinjaman kereta : " + (total +  jum_pin));
                
                break;
            }
            
            case 4: {
                System.out.println("\n===============================================================");
                System.out.println("SISTEM TAMAT, TERIMA KASIH");
                break;
            }
            
            default : {
                System.out.println("\n===============================================================");
                System.out.println("SALAH INPUT");
            }
        }
        
        System.out.println("===============================================================");
        return back;
    }
    
    static void line1()
    {
        System.out.println("===============================================================");
    }
    
    static void line2()
    {
        System.out.println("---------------------------------------------------------------");
    }
}
