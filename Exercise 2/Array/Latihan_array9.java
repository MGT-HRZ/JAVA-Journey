package Array;

import java.util.Scanner;

public class Latihan_array9 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int width[] = new int [3]; 
        
        String nama[] = new String [3];
        
        int tinggi[] = new int [3];
        
        for (int i = 0; i < width.length; i++){
            System.out.print("Nama " + (i + 1) + " = ");
            nama[i] = input.nextLine();
            
            System.out.print("Tinggi " + (i + 1) + " = ");
            tinggi[i] = input.nextInt();
            
            System.out.print("\n");
            
            input.nextLine();
        }
        
        System.out.println("===========================================================");
        
        for (int i = 0; i < width.length; i++){
            System.out.println("Nama " + (i + 1) + " = " + nama[i]);
            
            System.out.println("Tinggi " + (i + 1) + " = " + tinggi[i] + "\n");
        }
    }
}
