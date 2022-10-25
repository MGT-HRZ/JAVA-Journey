import java.util.Scanner;
public class lthnfor {
    public static void main (String[] args)
    {
        int i;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Sila Letakkan Nama Anda :");
        String nama = scan.nextLine();
        
        System.out.print("Apakah Nama Kelas Anda :");
        String kelas = scan.nextLine();
        
        System.out.println("-----------------------------------------------------------");
        for(i = 1; i <= 10; i++)
        {
            System.out.println("Selamat Kembali ke Kolej " +nama+ " dari kelas " +kelas);
        }
        System.out.println("-----------------------------------------------------------");
    }
}
