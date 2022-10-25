import java.util.Scanner;
public class genapganjil {
   public static void main(String[] args)
   {
       Scanner num = new Scanner (System.in);
       System.out.print("Masukkan nombor :");
       int num1 = num.nextInt();
       
       if (num1 % 2==0)
       {
           System.out.println("================================");
           System.out.println("Nombor " +num1+ " adalah nombor genap");
           System.out.println("================================");
       }
       else 
       {
           System.out.println("================================");
           System.out.println("Nombor " +num1+ " adalah nombor ganjil");
           System.out.println("================================");
       }
   }
}
