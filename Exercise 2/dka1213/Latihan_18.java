package dka1213;

// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_18 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        
        int select;
        
        double price1 = 2.5;
        
        double price2 = 3.0;
        
        double price3 = 3.5;
           
        double total = 0;
        
            System.out.println("Welcome to TechBit Cyber Cafe :");
            System.out.println("Please make your selection :");
            System.out.println("1. Beverage RM2.50");
            System.out.println("2. Popcorn RM3.00");
            System.out.println("3. Hot Dog RM3.50");
            System.out.println("4. Exit");
        
        do {

            System.out.print("Please enter your choice : ");
            select = input.nextInt();

            switch (select)
            {
                case 1 : {
                   System.out.println("Beverage RM2.50");
                   total = total + price1;
                   break; 
                }
                case 2 : {
                   System.out.println("Popcorn RM3.00");
                   total = total + price2;
                   break; 
                }
                case 3 : {
                   System.out.println("Hot Dog RM3.50");
                   total = total + price3;
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
                    System.out.println("Not in the list. Try again!");
                    System.out.println("=================================");
                }

            }
            
            if (select == 4){
                break;
            }
            
        }
        
        while (select != 4);
        
        System.out.println("Total : RM " + total);
        
    }
}
