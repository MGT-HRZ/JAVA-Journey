package Array;

import java.util.Scanner;

public class Latihan_array12 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double cgpa[][] = new double[3][2];
        
        for (int r = 0; r < 2; r++){
            for (int c = 0; c < 2; c++){
                System.out.print("Enter CGPA Marks : ");
                cgpa[r][c] = input.nextDouble();
            }
        }
        
        for (int r = 0; r < 2; r++){
            for (int c = 0; c < 2; c++){
                System.out.print(cgpa[r][c] + ", ");
            } 
        }
        
        
    }
}
