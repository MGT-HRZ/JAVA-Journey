package Control_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 27/7/2022
// Tajuk : Control Statement

import java.util.Scanner;

public class Latihan_2a {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nombor anda : ");
        int nom = input.nextInt();
        
        if (nom == 2222){
            System.out.println("2222 - nombor cantik");
        }
        
        else {
            System.out.println("Bersyukurlah");
        }
    }
}
