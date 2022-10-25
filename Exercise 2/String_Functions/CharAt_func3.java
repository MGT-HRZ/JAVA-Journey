package String_Functions;

import java.util.Scanner;

public class CharAt_func3 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your text : ");
        String text = input.nextLine();
        
        System.out.print("Enter index number from text : ");
        int text2 = input.nextInt();
        
        char concat_txt = text.charAt(text2);
        
        System.out.println(concat_txt);
    }
}
