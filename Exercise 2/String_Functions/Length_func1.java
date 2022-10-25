package String_Functions;

import java.util.Scanner;

public class Length_func1 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your text : ");
        String text = input.nextLine();
        
        int text_num = text.length();
        
        System.out.println(text_num);
    }
}
