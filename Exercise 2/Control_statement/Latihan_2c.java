package Control_statement;

// Tajuk : Control Statement

import java.util.Scanner;

public class Latihan_2c {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jantina anda : ");
        int j = input.nextInt();
        
        if (j == 1){
            System.out.println("Anda perempuan");
        }
        
        else if (j == 2) {
            System.out.println("Anda lelaki");
        }
    }
}
