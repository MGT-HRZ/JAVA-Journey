import java.util.Scanner;
public class Menurun {
    public static void main (String[] args)
    {
        int n;
        
        Scanner input = new Scanner (System.in);
        System.out.print("MASUKKAN NOMBOR :");
        n = input.nextInt();
        
        while (n > 10)
        {
            System.out.println(n);
            n--;
        }
    }
}
