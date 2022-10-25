package Array;

import java.util.Scanner;

public class Latihan_array5 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        String nama_tadika[] = new String [6];
        
        for (int i = 0; i < nama_tadika.length; i++){
            System.out.print("Sila Masukkan Nama Tadika = ");
            nama_tadika[i] = input.nextLine();
        }
        
        System.out.println("====================================================");
        
        for (int i = 0; i < nama_tadika.length; i++){
            System.out.println("Nama Tadika = " + nama_tadika[i]);
        }
    }
}