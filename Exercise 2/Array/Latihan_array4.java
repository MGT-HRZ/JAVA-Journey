package Array;

import java.util.Scanner;

public class Latihan_array4 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int total = 0;
        
        int num[] = new int [6];
        
        for (int i = 0; i < num.length; i++){
            System.out.print("Sila Masukkan Nombor = ");
            num[i] = input.nextInt();
            
            total = total + num[i];
        }
        
        System.out.println("Total = " + total);
    }
}