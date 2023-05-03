package pakejPenstriman;

import java.util.Scanner;

public class iCili {
    Scanner input = new Scanner(System.in);

    //  Pemboleh ubah yang diperlukan
    double harga = 0;
    int pilih = 0;

    public void menu() {
        //  Menu pilihan
        System.out.println("Pilih pelan iCili anda :");
        System.out.println("1. 1 Bulan = RM8.00");
        System.out.println("2. 3 Bulan = RM22.50");
        System.out.println("3. 1 Tahun = RM87.60");

        pilih = input.nextInt();
    }

    public double hargapakej() {

        //  Kawalan pilihan switch case
        switch (pilih) {
            case 1 : {
                harga = 8.00;   //  Harga Pelan
                break; 
            }

            case 2 : {
                harga = 22.50;   //  Harga Pelan
                break; 
            }

            case 3 : {
                harga = 87.60;   //  Harga Pelan
                break; 
            }
                
            default : {
                //  Jika input pilihan salah
                System.out.println("Tiada Pilihan Anda !");
                break;
            }
        }

        //  Pulangan harga
        return harga;

    }
}
