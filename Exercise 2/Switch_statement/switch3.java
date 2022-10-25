package Switch_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 3/8/2022
// Tajuk : Switch case (Char)

import java.util.Scanner;

public class switch3 {
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Pilih huruf antara A - C : ");
        char word = scan.next() .charAt(0);
        
        switch(word)
        {
            case 'A', 'a' : {
               System.out.println("Ini huruf A");
               break;
            }
            
            case 'B', 'b' : {
               System.out.println("Ini huruf B");
               break;
            }
            
            case 'C', 'c' : {
               System.out.println("Ini huruf C");

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
