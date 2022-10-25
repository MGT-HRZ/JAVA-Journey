import java.util.Scanner;
public class Gred {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char BI;
        char gred1 = 'A';
        char gred2 = 'B';
        char gred3 = 'C';
        
        System.out.print("Apakah gred Bahasa Inggeris anda :");
        BI = scan.next() .charAt(0);
        
        if (BI==gred1 || BI==gred2 || BI==gred3)
        {
            System.out.println("------------------");
            System.out.println("Taniah. Anda layak");
            System.out.println("------------------");
        }
        else
        {
            System.out.println("---------------------------------------");
            System.out.println("Anda tidak layak untuk belajar di KVPJB");
            System.out.println("---------------------------------------");
        }
    }
}
