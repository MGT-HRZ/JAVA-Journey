package String_Functions;

import java.util.Scanner;

public class Equals_func1 {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your password : ");
        String pass = input.nextLine();
        
        String real_pass = "dagangbestari";
        
        if (pass.equals(real_pass)){
            System.out.println("Kata laluan diterima");    
        }
        
        else {
            System.out.println("Kata laluan salah");
        }
    }
}
