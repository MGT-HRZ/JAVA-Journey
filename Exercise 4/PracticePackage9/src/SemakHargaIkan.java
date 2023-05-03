import java.util.InputMismatchException;
import java.util.Scanner;

import Empurau.HargaEmpurau;
import Jelawat.HargaJelawat;
import Siakap.HargaSiakap;

public class SemakHargaIkan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HargaEmpurau empurau = new HargaEmpurau();
        HargaJelawat jelawat = new HargaJelawat();
        HargaSiakap siakap = new HargaSiakap();

        int x = 1;
        int pilih = 0;
        int qty = 0;

        do {
            try {
                System.out.println("===== KEDAI IKAN MR EMIRUL =====");
                System.out.println(" MENU\tIKAN-IKAN");
                System.out.println(" 1\tIKAN SIAKAP");
                System.out.println(" 2\tIKAN EMPARAU");
                System.out.println(" 3\tIKAN JELAWAT");
                System.out.println(" 0\tKELUAR SISTEM");
                System.out.println("================================");

                brake();

                System.out.print("Sila Pilih Menu 1, 2, 3 atau 0 : ");
                pilih = input.nextInt();

                if (pilih == 1 || pilih == 2 || pilih == 3) {
                    System.out.print("Masukkan Kuantiti (per kilo) Ikan Yang Hendak Dibeli : ");
                    qty = input.nextInt();
                    brake();
                }
                
                else if (pilih == 0) {
                    System.out.println("Keluar Sistem");
                    break;
                }

                switch (pilih) {
                    case 1 : {
                        lines();
                        System.out.println("======== SIAKAP ========");
                        System.out.println("Harga Asal (per kilo) : RM " + siakap.hargaikan);
                        System.out.println("Potongan Harga 10% : RM " + siakap.diskaun);
                        System.out.println("Jumlah Bayaran " + qty + "kg Ikan Siakap : RM " + siakap.kirabayaran(qty));
                        lines();
                        brake();
                        break;
                    }
                        
                    case 2 : {
                        lines();
                        System.out.println("======== EMPURAU ========");
                        System.out.println("Harga Asal (per kilo) : RM " + empurau.hargaikan);
                        System.out.println("Potongan Harga 30% : RM " + empurau.diskaun);
                        System.out.println("Jumlah Bayaran " + qty + "kg Ikan Empurau : RM " + empurau.kirabayaran(qty));
                        lines();
                        brake();
                        break;
                    }    
                
                    case 3 : {
                        lines();
                        System.out.println("======== JELAWAT ========");
                        System.out.println("Harga Asal (per kilo) : RM " + jelawat.hargaikan);
                        System.out.println("Potongan Harga 20% : RM " + jelawat.diskaun);
                        System.out.println("Jumlah Bayaran " + qty + "kg Ikan Jelawat : RM " + jelawat.kirabayaran(qty));
                        lines();
                        brake();
                        break;
                    }

                    default : {
                        System.out.println("Salah Input ! Cuba Lagi");
                        brake();
                        break;
                    }
                }
            } 
            
            catch (InputMismatchException e) {
                System.out.println("Ralat ! Sila masukkan nombor");
                input.nextLine();
                brake();
            }
        }

        while (x != 0);
    }

    public static void brake() {
        System.out.println("");
    }

    public static void lines() {
        System.out.println("--------------------------------------------------------");
    }
}
