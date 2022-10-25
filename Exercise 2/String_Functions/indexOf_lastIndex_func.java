package String_Functions;

import java.util.Scanner;

public class indexOf_lastIndex_func {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your text : ");
        String text = input.nextLine();
        
        System.out.print("Enter your first word : ");
        String text2 = input.nextLine();
        
        System.out.print("Enter your last word : ");
        String text3 = input.nextLine();
        
        System.out.println("First : " + text.indexOf(text2));
        
        System.out.println("Second : " + text.indexOf(text3));
    }
}
