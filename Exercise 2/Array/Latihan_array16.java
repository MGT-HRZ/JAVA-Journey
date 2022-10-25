package Array;

import java.util.Scanner;

public class Latihan_array16 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String nama[][] = new String [2][1];
        String kursus[][] = new String [2][1];
        double cpa[][] = new double [2][2];
        
        for(int r = 0; r < 2; r++){
            for(int n = 0; n < 1; n++){
                System.out.print("Masukkan nama pelajar : ");
                nama[r][n] = input.nextLine();

                System.out.print("Masukkan kursus : ");
                kursus[r][n] = input.nextLine();
            }  
                
            for(int c = 0; c < 2; c++){
                System.out.print("Masukkan cpa sem " + (c + 1) +  " : ");
                cpa[r][c] = input.nextDouble();
            }
                System.out.println();
                input.nextLine();
        }
        
        for(int r = 0; r < 2; r++){
            for(int n = 0; n < 1; n++){
                System.out.print("Nama pelajar : " + nama[r][n]);
                System.out.println("\t\tKursus : " + kursus[r][n]);
            }
            
            for(int c = 0; c < 2; c++){
                System.out.println("cpa sem " + (c + 1) + " : " + cpa[r][c]);
            }
                System.out.println();
        }
        

    }
}
