package Loop_statement;

// Tajuk : Loop Statement

import java.util.Scanner;

public class Loop_DoWhile2 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        // Soalan 1
        
        int x = 1;
        
        do {
            System.out.println("LET'S KEEP OUR COMPUTER ROOM CLEAN AND TIDY");
            x++;
        }
        
        while (x <= 5);
        
        System.out.print("\n\n");
        
        // Soalan 2
        
        int y = 11;
        
        do {
            if (y % 2 == 1){
                System.out.print(y + "\t");
            }
            y++;
        }
        
        while (y <= 21);
        
        System.out.print("\n\n");
        
        // Soalan 3
        
        int z = 1;
        
        do {
            System.out.print("\nMasukkan jarak kilometer anda : ");
            double nom = input.nextDouble();
            
            System.out.println(nom + "km = " + (nom * 1000) + "m");
            z++;
        }
        
        while (z <= 3);
        
        System.out.print("\n\n");
        
        // Soalan 4
        
        int w = 1;
        
        do {
            System.out.print("\nMasukkan jejari bulatan anda : ");
            double j = input.nextDouble();
            
            System.out.println("Panjang jejari : " + j);
            System.out.println("Luas bulatan : " + (3.142 * j * j));
            w++;
        }
        
        while (w <= 5);
    }
}
