package String_Functions;

import java.util.Scanner;

public class Concat_func2 {
   public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your text : ");
        String text = input.nextLine();
        
        System.out.print("Enter your second text : ");
        String text2 = input.nextLine();
        
        String concat_txt = text.concat(" " + text2);
        
        System.out.println(concat_txt);
    } 
}
