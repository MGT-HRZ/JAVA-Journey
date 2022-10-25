import java.util.Scanner;
public class latihan1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan nama :");
        String nama = scan.nextLine();
        
        System.out.print("Masukkan kelas :");
        String kelas = scan.nextLine();
        
        System.out.println("\nSelamat Pagi Dunia");
        System.out.println("Nama anda ialah "+nama);
        System.out.println("Kelas anda ialah "+kelas);
        
    }
}
