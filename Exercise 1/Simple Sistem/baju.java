import java.util.Scanner;
public class baju {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Harga Baju Kadet Polis : RM\t");
        double baju1 = scan.nextDouble();
        
        System.out.print("Masukkan Harga Baju Kadet Bomba : RM\t");
        double baju2 = scan.nextDouble();
        
        System.out.print("Masukkan Harga Baju Kadet Pertahanan Awam : RM\t");
        double baju3 = scan.nextDouble();
        
        System.out.println("-----------------------------------------------------------------");
        System.out.println("HARGA BAJU KADET POLIS : RM\t"+baju1);
        System.out.println("HARGA BAJU KADET BOMBA : RM\t"+baju2);
        System.out.println("HARGA BAJU KADET KADET PERTAHANAN AWAM: RM\t"+baju3);
        System.out.println("JUMLAH HARGA BARANG :\t"+(baju1 + baju2 + baju3));
        System.out.println("-----------------------------------------------------------------");
        
    }
}
