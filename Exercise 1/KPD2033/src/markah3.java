import java.util.Scanner;
public class markah3 {
    public static void main (String[] args)
    {
        /*JUMLAH*/
        Scanner scan = new Scanner(System.in);
        System.out.print("Sila masukkan markah anda :");
        int markah1 = scan.nextInt();
        
        if(markah1 == 100)
        {
            System.out.println("-A");
        }
        else if(markah1 >= 80 && markah1 <= 99)
        {
            System.out.println("A");
        }
        else if(markah1 >= 60 && markah1 <= 79)
        {
            System.out.println("B");
        }
        else if(markah1 >= 50 && markah1 <= 59)
        {
            System.out.println("C");
        }
        else if(markah1 >= 40 && markah1 <= 49)
        {
            System.out.println("D");
        }
        else if(markah1 >= 0 && markah1 <= 39)
        {
            System.out.println("E");
        }
        
        
    }
}
