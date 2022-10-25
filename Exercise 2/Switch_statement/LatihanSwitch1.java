package Switch_statement;

// Tajuk : Latihan Switch case 1

import java.util.Scanner;

public class LatihanSwitch1 {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Masukkan tempat pelarian anda 1 / 2 / 3 : ");
        int nom = scan.nextInt();
        
        switch(nom)
        {
            case 1 : {
               System.out.println("=================================");
               System.out.println("Tempat pertama dalam perlumbaan");
               System.out.println("=================================");
               break;
            }
            
            case 2 : {
               System.out.println("=================================");
               System.out.println("Tempat kedua dalam perlumbaan");
               System.out.println("=================================");
               break;
            }
            
            case 3 : {
               System.out.println("=================================");
               System.out.println("Tempat ketiga dalam perlumbaan");
               System.out.println("=================================");

               break;
            }
            
            default : {
                System.out.println("=================================");
                System.out.println("Maaf salah input");
                System.out.println("=================================");
            }
        }
    }
}
