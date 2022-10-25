package Array;

import java.util.Scanner;

public class Latihan_array8 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        double simpan[] = new double [4];
        
        for (int i = 0; i < simpan.length; i++){
            System.out.print("Family " + (i + 1) + " = ");
            simpan[i] = input.nextDouble();
        }
        
        System.out.println("===========================================================");
        
        for (int i = 0; i < simpan.length; i++){
            System.out.println("Family " + (i + 1) + " = " + simpan[i]);
        }
    }
}
