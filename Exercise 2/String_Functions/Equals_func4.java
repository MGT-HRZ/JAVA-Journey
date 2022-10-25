package String_Functions;

import java.util.Scanner;

public class Equals_func4 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your password : ");
        String text = input.nextLine();
        
        String text2 = "wasd";
        
        if (text.equals(text2)){
            System.out.println("Your IN");
        }
        
        else {
            System.out.println("Sorry, Try Again");
        }
    }
}
