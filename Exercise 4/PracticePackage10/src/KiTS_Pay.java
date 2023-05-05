import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.InputMismatchException;

import ETS.SalesETS;
import KTM_Komuter.SalesKTM_Komuter;
import Shuttle_Tebrau.SalesShuttle_Tebrau;

public class KiTS_Pay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat DF = new DecimalFormat("#.##");

        // Mengisytiharkan objek untuk memperoleh class dari package yang lain
        SalesETS ets = new SalesETS();
        SalesKTM_Komuter ktm_kom = new SalesKTM_Komuter();
        SalesShuttle_Tebrau st = new SalesShuttle_Tebrau();

        // Mengisytiharkan pemboleh ubah yang diperlukan
        int x = 1;
        int pilih = 0;
        int kuantiti = 0;
        double jarak = 0;

        // Kawalan Perulangan DO-WHILE
        do {

            // Mengaplikasikan Exception Try_Catch
            try {

                // Senarai Kereta Api dalam sistem
                System.out.println("===== KiTS MOBILE SYSTEM =====");
                System.out.println("No.\tKERETA API");
                hop();
                System.out.println("1 \tETS");
                System.out.println("2 \tKTM KOMUTER");
                System.out.println("3 \tSHUTTLE TEBRAU");
                hop();
                System.out.println("0 \tKELUAR SISTEM");
                System.out.println("================================");
                hop();
                System.out.print("Sila Pilih Antara 1, 2, 3 atau 0 : ");
                pilih = input.nextInt();

                // Memasukkan bilangan penumpang dan jarak perjalanan
                if (pilih == 1 || pilih == 2 || pilih == 3) {
                    hop();
                    System.out.print("Masukkan Bilangan Penumpang bagi Tiket yang Hendak Dibeli : ");
                    kuantiti = input.nextInt();
                    hop();
                    System.out.print("Masukkan Jarak Perjalanan Anda : ");
                    jarak = input.nextDouble();
                    hop();
                }

                // Keluar daripada sistem
                else if (pilih == 0) {
                    System.out.println("Keluar Sistem");
                    break;
                }

                // Kawalan pilihan SWITCH-CASE
                switch (pilih) {

                    // Keadah pengiraan & paparan bagi Kereta Api ETS
                    case 1: {
                        line();
                        System.out.println("======== ETS ========");
                        System.out.println("Harga Seunit : RM " + ets.hargatrain);
                        System.out.println("Jumlah Jarak : " + jarak + " km");
                        System.out.println("Potongan Harga Diskaun : RM " + DF.format(ets.diskaun));
                        System.out.println("Jumlah Bayaran Tiket : RM " + ets.kirabayaran(kuantiti, jarak));
                        line();
                        break;
                    }

                    // Keadah pengiraan & paparan bagi Kereta Api KTM KOMUTER
                    case 2: {
                        line();
                        System.out.println("======== KTM KOMUTER ========");
                        System.out.println("Harga Seunit : RM " + ktm_kom.hargatrain);
                        System.out.println("Jumlah Jarak : " + jarak + " km");
                        System.out.println("Potongan Harga Diskaun : RM " + DF.format(ktm_kom.diskaun));
                        System.out.println("Jumlah Bayaran Tiket : RM " + ktm_kom.kirabayaran(kuantiti, jarak));
                        line();
                        break;
                    }

                    // Keadah pengiraan & paparan bagi Kereta Api SHUTTLE TEBRAU
                    case 3: {
                        line();
                        System.out.println("======== SHUTTLE TEBRAU ========");
                        System.out.println("Harga Seunit : RM " + st.hargatrain);
                        System.out.println("Jumlah Jarak : " + jarak + " km");
                        System.out.println("Potongan Harga Diskaun : RM " + DF.format(st.diskaun));
                        System.out.println("Jumlah Bayaran Tiket : RM " + st.kirabayaran(kuantiti, jarak));
                        line();
                        break;
                    }

                    // Jika input yang dimasukkan ialah selain daripada nombor yang ditetapkan 
                    // pada senarai kereta api
                    default: {
                        System.out.println("Sila Pilih Semula Pilihan Anda !!");
                        hop();
                        break;
                    }
                }
            }

            // Jika input yang dimasukkan ialah huruf / simbol
            catch (InputMismatchException e) {
                System.out.println("Ralat ! Sila masukkan nombor");
                input.nextLine();
                hop();
            }

        }

        while (x != 0);
    }

    public static void hop() {
        System.out.println("");
    }

    public static void line() {
        System.out.println("-------------------------------------------------------------");
    }
}
