import java.util.Scanner;

import biztrainning.JumlahBiztrainning;
import elatihan.JumlahElatihan;
import jomlatihan.JumlahJomtrainning;

public class SemakHargaLatihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        JumlahBiztrainning biz = new JumlahBiztrainning();
        JumlahJomtrainning jom = new JumlahJomtrainning();
        JumlahElatihan elth = new JumlahElatihan();

        System.out.println("=== SISTEM SEMAKAN PERKHIDMATAN HARGA LATIHAN / KURSUS / SEMINAR ===");

        System.out.print("Masukkan bilangan peserta kursus :");
        int peserta = input.nextInt();

        System.out.print("Masukkan bilangan hari kursus :");
        int hari = input.nextInt();

        System.out.print("Masukkan bilangan makan sehari :");
        int bilmakan = input.nextInt();

        System.out.print("Masukkan bilangan bilik yang ingin ditempah :");
        int tempah = input.nextInt();

        brake();

        biz.jumlahbiztrainning(hari, peserta, bilmakan, tempah);

        brake();

        jom.jumlahjomtrainning(hari, peserta, bilmakan, tempah);

        brake();

        elth.jumlahelatihan(hari, peserta, bilmakan, tempah);


    }

    public static void brake() {
        System.out.println("");
    }
}
