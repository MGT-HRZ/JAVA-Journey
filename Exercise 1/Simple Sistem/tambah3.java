import java.util.Scanner;
public class tambah3 {
   public static void main(String[] args)
   {
       Scanner num = new Scanner (System.in);
       System.out.print("Masukkan Nombor Pertama :");
       double num1 = num.nextDouble();
       System.out.print("Masukkan Nombor Kedua :");
       double num2 = num.nextDouble();
       System.out.print("Masukkan Nombor Ketiga :");
       double num3 = num.nextDouble();
       
       System.out.println("===========================");
       System.out.println("Nombor Pertama ialah :"+num1);
       System.out.println("Nombor Kedua ialah :"+num2);
       System.out.println("Nombor Ketiga ialah :"+num3);
       System.out.println("===========================");
       System.out.println("Jumlah Nombor ialah :"+(num1 + num2 + num3));
       System.out.println("===========================");
   }
}
