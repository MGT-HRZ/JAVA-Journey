package Control_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Control Statement

import java.util.Scanner;

public class Latihan_2d {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama orang 1 : ");
        String nama1 = input.nextLine();
        
        System.out.print("Masukkan tinggi orang 1 : ");
        int org1 = input.nextInt();
        
        input.nextLine();
        System.out.print("Masukkan nama orang 2 : ");
        String nama2 = input.nextLine();
                
        System.out.print("Masukkan tinggi orang 2 : ");
        int org2 = input.nextInt();
        
        if (org1 > org2){
            System.out.println("\n" + nama1 + " ialah " + org1 + " lebih tinggi daripada " + nama2);
        }
        
        else if (org2 > org1) {
            System.out.println("\n" + nama2 + " ialah " + org2 + " lebih tinggi daripada " + nama1);
        }
    }
}
