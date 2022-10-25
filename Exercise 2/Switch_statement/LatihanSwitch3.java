package Switch_statement;

// Tajuk : Latihan Switch case 3

import java.util.Scanner;

public class LatihanSwitch3 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Mengira luas :");
        System.out.println("\t1. Segi Empat");
        System.out.println("\t2. Segi Tiga");
        System.out.println("\t3. Bulatan");
        
        System.out.print("Masukkan pilihan anda (1, 2, 3) : ");
        int nom = input.nextInt();
        
        switch(nom)
        {
            case 1 : {
                input.nextLine();
                System.out.print("\nMasukkan Panjang : ");
                double p = input.nextDouble();
                
                System.out.print("Masukkan Lebar : ");
                double l = input.nextDouble();
                
                System.out.println("=================================");
                System.out.println("Luas segi empat ialah " + (p * l));
                System.out.println("=================================");
                break;
            }
            
            case 2 : {
                input.nextLine();
                System.out.print("\nMasukkan Tapak : ");
                double t1 = input.nextDouble();
                
                System.out.print("Masukkan Tinggi : ");
                double t2 = input.nextDouble();
                
                System.out.println("=================================");
                System.out.println("Luas segi tiga ialah " + (0.5 * t1 * t2));
                System.out.println("=================================");
                break;
            }
            
            case 3 : {
                input.nextLine();
                System.out.print("\nMasukkan Jejari : ");
                double j = input.nextDouble();
                
                System.out.println("=================================");
                System.out.println("Luas segi tiga ialah " + (3.142 * j * j));
                System.out.println("=================================");
                break;
            }
            
            default : {
                System.out.println("\n=================================");
                System.out.println("Maaf Salah Input");
                System.out.println("=================================");
            }
        }
    }
}
