package dka1213;

// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_17 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int select;
        
        do {
            System.out.println("\nMenu :");
            System.out.println("1. HOUR TO MINUTE");
            System.out.println("2. HOUR TO SECOND");
            System.out.println("3. EXIT PROGRAM");

            System.out.print("Pilih (1 / 2 / 3 / 4) : ");
            select = input.nextInt();

            switch (select)
            {
                case 1 : {
                   System.out.print("\nEnter hour : ");
                   double t1 = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Hour to minute : " + (t1 * 60.0) + " minit");
                   System.out.println("=================================");
                   break; 
                }
                case 2 : {
                   System.out.print("\nEnter hour : ");
                   double t2 = input.nextDouble();
                   System.out.println("=================================");
                   System.out.println("Hour to second : " + (t2 * 3600.0) + " saat");
                   System.out.println("=================================");
                   break; 
                }
                case 3 : {
                   System.out.println("=================================");
                   System.out.println("End program, Thank you !");
                   System.out.println("=================================");
                   break;
                }
                default :
                {
                    System.out.println("=================================");
                    System.out.println("You enter the wrong input");
                    System.out.println("=================================");
                }

            }
            
            if (select >= 3){
                break;
            }
            
        }
        
        while (select != 3);
        
    }
}
