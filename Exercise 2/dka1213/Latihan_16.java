package dka1213;

// Tajuk : Latihan Amali 1

import java.util.Scanner;

public class Latihan_16 {
    static public void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int i;
        
        double a, b, c;
        
        for (i = 0; i < 10; i++){
            System.out.print("\nEnter your purchase price : ");
            double price = input.nextDouble();
            
            if (price >= 7000){
               a = (price / 100) * 25;
               b = price - a;
               System.out.println("\nYour purchase price after discount : RM " + b); 
            }
            
            else if (price >= 5500){
               a = (price / 100) * 20;
               b = price - a;
               System.out.println("\nYour purchase price after discount : RM " + b);
            }
            
            else if (price >= 1200){
               a = (price / 100) * 15;
               b = price - a;
               System.out.println("\nYour purchase price after discount : RM " + b);
            }
            
            else if (price == 0){
                break;
            }
            
            else {
               System.out.println("\nPlease enter again !!");
            }
        }
    }
}
