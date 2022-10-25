package Switch_statement;

// Tajuk : Latihan Switch case 4


import java.util.Scanner;
public class LatihanSwitch4 {
    public static void main(String[] args)
    {
        System.out.println("Pilihan Menu Anda :");
        System.out.println("\t1. Kentang Goreng (RM 3.50)");
        System.out.println("\t2. Burger Ayam (RM 2.50)");
        System.out.println("\t3. Ayam Goreng (RM 5.50)");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Pilihan anda (1 / 2 / 3) : ");
        int select = input.nextInt();
        
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
               System.out.println("JUMLAH PERLU DIBAYAR : RM " + (case2 * 2.5));
               System.out.println("=================================");
               break; 
            }
            case 3 : {
               System.out.println("\nMenu Pilihan : Ayam Goreng");
               System.out.print("Masukkan Bilangan : ");
               int case3 = input.nextInt();
               System.out.println("=================================");
               System.out.println("JUMLAH PERLU DIBAYAR : RM " + (case3 * 5.5));
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
    }
    
}

