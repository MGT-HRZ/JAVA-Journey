package Control_statement;

// Tajuk : Control Statement

import java.util.Scanner;

public class Latihan_2e {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nombor anda : ");
        int num = input.nextInt();
        
        if (num % 4 == 0){
            System.out.println("\n" + num + " boleh dibahagikan dengan 4");
        }
        
        else {
            System.out.println("\n" + num + " tidak boleh dibahagikan dengan 4");
        }
    }
}
