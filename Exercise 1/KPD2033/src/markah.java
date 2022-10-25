import java.util.Scanner;
public class markah {
    public static void main(String[] args)
    {
        /*JUMLAH*/
        Scanner scan = new Scanner(System.in);
        System.out.print("<Sila masukkan markah anda> \n");
        
        System.out.print("Bahasa Melayu :");
        int markah1 = scan.nextInt();
        
        System.out.print("Bahasa Inggeris :");
        int markah2 = scan.nextInt();
        
        System.out.print("Matematik :");
        int markah3 = scan.nextInt();
        
        System.out.print("Sejarah :");
        int markah4 = scan.nextInt();
        
        System.out.println("----------------------------");
        System.out.println("Jumlah markah =\t" + (markah1 + markah2 + markah3 + markah4));
        System.out.println("----------------------------\n");
        /*JUMLAH*/
        
        /*PURATA*/
        Scanner input = new Scanner(System.in);
        System.out.print("<Mengira purata markah anda> \n");
        
        System.out.print("Jumlah markah :");
        int markah5 = input.nextInt();
     
        System.out.println("----------------------------");
        System.out.println("Purata markah =\t" +(markah5)/4);
        System.out.println("----------------------------\n");
        /*PURATA*/
        
        /*PERATUS*/
        Scanner input2 = new Scanner(System.in);
        System.out.print("<Mengira peratus markah anda> \n");
        
        System.out.print("Jumlah markah :");
        int markah6 = input2.nextInt();
     
        System.out.println("-----------------------------");
        System.out.println("Peratus markah =\t" +(markah6 * 100)/400);
        System.out.println("----------------------------- \n");
        /*PERATUS*/
    }
}
