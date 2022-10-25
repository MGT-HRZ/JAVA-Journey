import java.util.Scanner;
public class lthndowhile2 {
    public static void main (String[] args)
    {
        int i = 1;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Sila Letakkan Nama Anda :");
        String nama = scan.nextLine();
        
        System.out.print("Apakah Nama Kelas Anda :");
        String kelas = scan.nextLine();
        
        System.out.println("-----------------------------------------------------------");
        do
        {
            System.out.println("Selamat Kembali ke Kolej " +nama+ " dari kelas " +kelas);
            i++;
        }
        while(i <= 10);
        System.out.println("-----------------------------------------------------------");
    }
}
