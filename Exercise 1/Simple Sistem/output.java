import java.util.Scanner;
public class output {
    public static void main (String[] args)
    {
        // Pendaftaran
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Output aturcara :");
        System.out.print("Peserta :");
        String peserta = scan.nextLine();
        
        System.out.print("Tahun :");
        int tahun = scan.nextInt();
        
        Scanner scan2 = new Scanner (System.in);
        System.out.print("Jantina :");
        String jantina = scan2.nextLine();
        
        System.out.println("\nOutput aturcara :");
        System.out.println("Peserta :" +peserta);
        System.out.println("Tahun :" +tahun);
        System.out.println("Jantina :" +jantina);
        
        // Iklim
        
        Scanner scan3 = new Scanner (System.in);
        System.out.println("\nOutput aturcara :");
        System.out.println("Laporan Cuaca pada Hari Ini ialah");
        System.out.print("Lokasi :");
        String lokasi = scan3.nextLine();
        
        System.out.print("Suhu :");
        int suhu = scan3.nextInt();
        
        Scanner scan4 = new Scanner (System.in);
        System.out.print("Cuaca :");
        String cuaca = scan4.nextLine();
        
        System.out.println("\nOutput aturcara :");
        System.out.println("Laporan Cuaca pada Hari Ini ialah");
        System.out.println("Lokasi :" +lokasi);
        System.out.println("Suhu :" +suhu+ " c");
        System.out.println("Cuaca :" +cuaca);
    }
    
}
