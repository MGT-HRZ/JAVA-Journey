import java.util.Scanner;
public class tabung {
    public static void main (String[] args)
    {
        int i;
        double ke24;
        double bilke24 = 0;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan Jumlah Tabung Simpanan pada Bulan Pertama : RM ");
        double pertama = scan.nextDouble();
        
        System.out.print("Masukkan Jumlah Tabung Simpanan setiap Bulan sehingga Bulan ke - 24 : RM ");
        ke24 = scan.nextDouble();
        
        System.out.print("Masukkan Pengeluaran pada bulan ke - 25 : RM ");
        double ke25 = scan.nextDouble();
        
        for(i = 1; i <= 24; i++)
        {
            bilke24 = bilke24 + ke24;
            
            
        }
        
        System.out.println("\nJumlah Tabung Simpanan pada Bulan Pertama : RM "+pertama);
        
        System.out.println("Jumlah Tabung Simpanan pada Bulan ke - 24 : RM "+(bilke24 + pertama));
        
        System.out.println("Pengeluaran pada bulan ke - 25 : RM "+ke25);
        
        System.out.println("Jumlah akhir tabung simpanan : RM "+(bilke24 + pertama - ke25));

    }
}
