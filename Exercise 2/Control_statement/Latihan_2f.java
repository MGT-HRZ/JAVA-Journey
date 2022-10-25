package Control_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Control Statement

import java.util.Scanner;

public class Latihan_2f {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama orang 1 : ");
        String nama1 = input.nextLine();
        
        System.out.print("Masukkan berat orang 1 : ");
        double org1 = input.nextDouble();
        
        input.nextLine();
        System.out.print("Masukkan nama orang 2 : ");
        String nama2 = input.nextLine();
                
        System.out.print("Masukkan berat orang 2 : ");
        double org2 = input.nextDouble();
        
        if (org1 < org2){
            System.out.println("\n" + nama1 + " ialah " + org1 + " lebih ringan daripada " + nama2);
        }
        
        else if (org2 < org1) {
            System.out.println("\n" + nama2 + " ialah " + org2 + " lebih ringan daripada " + nama1);
        }
    }
}
