package pakejPenstriman;

import java.util.Scanner;

public class Perkhidmatan {
    public static void main(String[] args) {
        //  Input Masukkan
        Scanner input = new Scanner(System.in);

        //  Pengisytiharan object bagi package lain
        Perkhidmatan khidmat = new Perkhidmatan();
        Neplix neplix = new Neplix();
        iCili icili = new iCili();

        //  Pemboleh ubah yang menamatkan kitaran loop
        char berhenti;

        //  Pemboleh ubah membolehkan proses penambahan harga
        double bil = 0;

        //  loop do-while
        do {
            //  Objek khidmat memanggil paparan menu dari method menu()
            khidmat.menu();

            int pilih = input.nextInt();

            //  Kawalan pilihan switch case
            switch (pilih) {
                case 1 : {
                    //  Objek neplix memanggil paparan menu dari package Neplix
                    neplix.menu();

                    //  Menambah harga pakej perkhidmatan dari package Neplix
                    bil = (bil + neplix.hargapakej());

                    //  Paparan jumlah bayaran
                    System.out.println("Jumlah bayaran yang perlu dibayar RM " + bil);

                    break;
                }
                    
                case 2 : {
                    //  Objek icili memanggil paparan menu dari package iCili
                    icili.menu();

                    //  Menambah harga pakej perkhidmatan dari package iCili
                    bil = (bil + icili.hargapakej());

                    //  Paparan jumlah bayaran
                    System.out.println("Jumlah bayaran yang perlu dibayar RM " + bil);

                    break;
                }
            
                default : {
                    //  Jika input pilihan salah
                    System.out.println("Tiada Pilihan Anda !");
                    break;
                }
            }

            //  Pilihan YES / NO
            System.out.println("Tambah langganan? (y/n)");
            berhenti = input.next().charAt(0);

        }

        while (berhenti != 'n');
        
    }

    //  Method menu pilihan
    public void menu() {
        System.out.println("Selamat Datang ke StreamingSubs");
        System.out.println("Anda boleh melanggan perkhidmatan penstriman video di bawah");
        System.out.println("1. Neplix");
        System.out.println("2. iCili");
    }
}
