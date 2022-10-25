package Switch_statement;

// Tajuk : Switch case (Int)

import java.util.Scanner;

public class switch1 {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Pilih nombor antara 1 - 3 : ");
        int nom = scan.nextInt();
        
        switch(nom)
        {
            case 1 : {
               System.out.println("Nombor 1");
               break;
            }
            
            case 2 : {
               System.out.println("Nombor 2");
               break;
            }
            
            case 3 : {
               System.out.println("Nombor 3");

               break;
            }
            
            default : {
                System.out.println("=================================");
                System.out.println("Anda Memasukkan Input yang salah");
                System.out.println("=================================");
            }
        }
    }
}
