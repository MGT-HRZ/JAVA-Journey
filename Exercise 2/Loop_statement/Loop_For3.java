package Loop_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 7/8/2022
// Tajuk : Loop Statement

import java.util.Scanner;

public class Loop_For3 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        // Soalan 1
        
        for (int i = 1; i <= 8; i++){
            System.out.println("Too Succeed is easier than to fail");
        }
        
        System.out.print("\n\n");
        
        // Soalan 2
        
        for (int x = 40; x <= 50; x+=2){
            System.out.print(x + "\t");
        }
        
        System.out.print("\n\n");
        
        // Soalan 3
        
        for (int a = 1; a <= 12; a++){
            System.out.println(a + " x 2 = " + (a * 2));
        }
        
        System.out.print("\n\n");
        
        // Soalan 4
        
        System.out.print("Masukkan sifir yang dikehendaki : ");
        int nom1 = input.nextInt();
        
        for (int b = 1; b <= 12; b++){
            System.out.println(b + " x " + nom1 + " = " + (b * nom1));
        }
        
        System.out.print("\n\n");
        
        // Soalan 5
        
        for (int c = 1; c <= 3; c++){
            System.out.println("\nMasukkan tapak dan tinggi : ");
            
            System.out.print("Tapak = ");
            double t1 = input.nextDouble();
            
            System.out.print("Tinggi = ");
            double t2 = input.nextDouble();
            
            System.out.println("Luas = " + (0.5 * t1 * t2));
            
        }
    }
}
