import java.util.Scanner;
public class tinggi {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Ketinggian Anda :");
        double tinggi = scan.nextDouble();
        
        System.out.println("----------------------------------------");
        if(tinggi <= 50.00)
        {
            System.out.println("Anda terlalu pendek");
        }
        else
        {
            System.out.println("Ketinggian normal");
        }
        System.out.println("----------------------------------------");
    
    }
}
