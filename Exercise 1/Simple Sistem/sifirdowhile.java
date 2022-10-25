import java.util.Scanner;
public class sifirdowhile {
    public static void main(String[] args)
    {
        int nom = 1;
        int nom1;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Nama Anda ? :");
        String nama = scan.nextLine();
        
        System.out.print("Anda Ingin Memaparkan Sifir ? :");
        nom1 = scan.nextInt();
        
        System.out.println("====================================================");
        System.out.println("Nama Anda ? :" +nama);
        System.out.println("Anda Ingin Memaparkan Sifir ? :" +nom1);
        
        do
        {
            System.out.println(nom+ (" X " +nom1+ (" = ")) +(nom*nom1));
            nom++;
        }
        while(nom <= 10);
        System.out.println("====================================================");
    }
}
