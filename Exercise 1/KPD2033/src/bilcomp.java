import java.util.Scanner;
public class bilcomp {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Berapakah kuantiti komputer anda :");
        int comp = input.nextInt();
        
        System.out.println("-------------------------------------------");
        if (comp > 5)
        {
            System.out.println("Banget banget komputer");
        }
        else 
        {
            System.out.println("Ok la tu");
        }
        System.out.println("-------------------------------------------");
    }
}
