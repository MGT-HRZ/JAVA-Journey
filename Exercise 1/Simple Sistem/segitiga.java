import java.util.Scanner;
public class segitiga {
    public static void main(String[] args)
    {
        System.out.println("Sistem Pengiraan Luas dan Perimeter");
        System.out.println("1. Luas");
        System.out.println("2. Perimeter\n");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Pilihan Anda : ");
        int select = input.nextInt();
        
        switch (select)
        {
            case 1 : {
               System.out.print("Sila Masukkan Tapak : ");
               double tapak = input.nextDouble();
               System.out.print("Sila Masukkan Tinggi : ");
               double tinggi = input.nextDouble();
               System.out.println("Luas : "+(0.5 * tapak * tinggi));
               break; 
            }
            case 2 : {
               System.out.print("Sila masukkan panjang segiempat sama : ");
               double panjang = input.nextDouble();
               System.out.println("Perimeter segiempat : "+(panjang * 4));
               break;
            }
            default :
            {
                System.out.println("Salah Input");
                System.out.println("Terima Kasih");
            }
        }
    }
}
