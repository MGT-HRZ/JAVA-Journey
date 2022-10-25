import java.util.Scanner;
public class sifir {
    public static void main(String[] args)
    {
        int nom;
        int nom1;
        
        Scanner input = new Scanner (System.in);
        System.out.print("Nama Anda ? :");
        String nama = input.nextLine();
        
        System.out.print("Anda Ingin Memaparkan Sifir ? :");
        nom1 = input.nextInt();
        
        System.out.println("====================================================");
        System.out.println("Nama Anda ? :" +nama);
        System.out.println("Anda Ingin Memaparkan Sifir ? :" +nom1);
        
        for(nom = 1; nom <= 10; nom++)
        {
            System.out.println(nom+ (" X " +nom1+ (" = ")) +(nom * nom1));
        }
        System.out.println("====================================================");
    }
}
