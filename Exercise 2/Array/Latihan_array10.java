package Array;

import java.util.Scanner;

public class Latihan_array10 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int width[] = new int [12]; 
        
        String bulan[] = {"Januari", "Februari", "Mac", "April", "Mei", "Jun", "Julai", "Ogos", "September", "Oktober", "November", "Disember"};
        
        int hari[] = new int [12];
        
        for (int i = 0; i < width.length; i++){
            System.out.print("Bilangan hari bagi " + bulan[i] + " = ");
            hari[i] = input.nextInt();
        }
        
        System.out.println("===========================================================");
        
        for (int i = 0; i < width.length; i++){
            System.out.println(bulan[i] + " mempunyai = "+ hari[i] + " hari");
        }
    }
}
