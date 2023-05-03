package pakejPenstriman;

import java.util.Scanner;

public class Neplix {
    Scanner input = new Scanner(System.in);

    //  Pemboleh ubah yang diperlukan
    double harga = 0;
    int pilih = 0;

    public void menu() {
        //  Menu pilihan
        System.out.println("Pilih pelan Neplix anda :");
        System.out.println("1. 1 User = RM8.00");
        System.out.println("2. 2 User = RM20.00");
        System.out.println("3. 3 User = RM35.00");

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
                harga = 20.00;   //  Harga Pelan
                break; 
            }

            case 3 : {
                harga = 35.00;   //  Harga Pelan
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
