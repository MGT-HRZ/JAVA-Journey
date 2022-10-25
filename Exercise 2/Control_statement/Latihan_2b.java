package Control_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Control Statement

import java.util.Scanner;

public class Latihan_2b {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda : ");
        int umur = input.nextInt();
        
        if (umur >= 58){
            System.out.println("Anda boleh pencen sekarang");
        }
        
        else {
            System.out.println("Anda boleh terus bekerja");
        }
    }
}
