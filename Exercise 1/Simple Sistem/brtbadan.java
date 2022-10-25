import java.util.Scanner;
public class brtbadan {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Berat Badan Anda :");
        double berat = scan.nextDouble();
        
        System.out.println("----------------------------------------");
        if(berat > 30.00)
        {
            System.out.println("Anda mempunyai berat badan berlebihan");
        }
        else
        {
            System.out.println("Berat badan normal");
        }
        System.out.println("----------------------------------------");
    
    }
}
