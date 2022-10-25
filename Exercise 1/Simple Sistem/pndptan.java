import java.util.Scanner;
public class pndptan {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Pendapatan Anda :");
        double pndptan = scan.nextDouble();
        
        System.out.println("----------------------------------------");
        if(pndptan < 1000.00)
        {
            System.out.println("Anda layak untuk biasiswa");
        }
        else
        {
            System.out.println("Anda tidak perlu biasiswa");
        }
        System.out.println("----------------------------------------");
    
    }
}
