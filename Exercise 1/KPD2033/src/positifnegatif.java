import java.util.Scanner;
public class positifnegatif {
    public static void main(String[] args)
    {
       Scanner num = new Scanner (System.in);
       System.out.print("Masukkan nombor :");
       int num1 = num.nextInt();
       
       if (num1 > 0)
       {
           System.out.println("================================");
           System.out.println("Nombor " +num1+ " adalah nombor positf");
           System.out.println("================================");
       }
       else 
       {
           System.out.println("================================");
           System.out.println("Nombor " +num1+ " adalah nombor negatif");
           System.out.println("================================");
       }
    }
}
