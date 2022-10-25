package dka1213;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 9/8/2022
// Tajuk : Latihan Do While

import java.util.Scanner;

public class Latihan_13 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int select;
        
        do {
            System.out.println("\nMenu :");
            System.out.println("1. Apple(RM6.50)");
            System.out.println("2. Banana(RM1.60)");
            System.out.println("3. Orange(RM5.00)");
            System.out.println("4. Exit");

            System.out.print("Please enter your choice (1 / 2 / 3 / 4) : ");
            select = input.nextInt();

            switch (select)
            {
                case 1 : {
                   System.out.print("\nPlease enter how many kilo of Apple : ");
                   double a = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Price for Apple : RM" + (a * 6.5));
                   System.out.println("=================================");
                   break; 
                }
                case 2 : {
                   System.out.print("\nPlease enter how many kilo of Banana : ");
                   double b = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Price for Banana : RM" + (b * 1.6));
                   System.out.println("=================================");
                   break; 
                }
                case 3 : {
                   System.out.print("\nPlease enter how many kilo of Orange : ");
                   double o = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Price for Orange : RM" + (o * 5.0));
                   System.out.println("=================================");
                   break; 
                }
                case 4 : {
                   System.out.println("=================================");
                   System.out.println("System End, Thank you !");
                   System.out.println("=================================");
                   break;
                }
                default :
                {
                    System.out.println("=================================");
                    System.out.println("You Entered A Wrong Input");
                    System.out.println("=================================");
                }

            }
            
            if (select >= 4){
                break;
            }
            
        }
        
        while (select != 4);
        
    }
}
