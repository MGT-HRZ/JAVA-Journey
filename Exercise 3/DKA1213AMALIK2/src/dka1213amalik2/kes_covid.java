package dka1213amalik2;

import java.util.Scanner;

public class kes_covid {
    public static int back;
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        
        // Menu Output
        System.out.println("== KES COVID-19 BAGI TIGA BUAH DAERAH NEGERI JOHOR ==");
        System.out.println("MENU PILIHAN :");
        
        line1();
        
        System.out.println("KOD\tCOVID-19");
        System.out.println("1\tJOHOR BAHRU");
        System.out.println("2\tBATU PAHAT");
        System.out.println("3\tKOTA TINGGI");
        System.out.println("0\tKeluar Sitem");
        
        // Loop Kes Covid
        for (int i = 0; i < 3; i++){
            line1();
        
            System.out.print("Masukkan Kod Pilihan 1, 2, 3 atau 0 : ");
            int select = input.nextInt();
            
            switch(select)
            {
                case 1: {
                    System.out.print("\nMasukkan Jumlah Kes Pada 8 April 2021 : ");
                    int jum_covid1 = input.nextInt();

                    System.out.print("Masukkan Jumlah Kes Pada 9 April 2021 : ");
                    int jum_covid2 = input.nextInt();

                    System.out.print("Masukkan Jumlah Kes Pada 10 April 2021 : ");
                    int jum_covid3 = input.nextInt();

                    total1 = jum_covid1 + jum_covid2 + jum_covid3;

                    break;
                }

                case 2: {
                    System.out.print("\nMasukkan Jumlah Kes Pada 8 April 2021 : ");
                    int jum_covid1 = input.nextInt();

                    System.out.print("Masukkan Jumlah Kes Pada 9 April 2021 : ");
                    int jum_covid2 = input.nextInt();

                    System.out.print("Masukkan Jumlah Kes Pada 10 April 2021 : ");
                    int jum_covid3 = input.nextInt();

                    total2 = jum_covid1 + jum_covid2 + jum_covid3;

                    break;
                }

                case 3: {
                    System.out.print("\nMasukkan Jumlah Kes Pada 8 April 2021 : ");
                    int jum_covid1 = input.nextInt();

                    System.out.print("Masukkan Jumlah Kes Pada 9 April 2021 : ");
                    int jum_covid2 = input.nextInt();

                    System.out.print("Masukkan Jumlah Kes Pada 10 April 2021 : ");
                    int jum_covid3 = input.nextInt();

                    total3 = jum_covid1 + jum_covid2 + jum_covid3;

                    break;
                }

                case 0: {
                    System.out.println("\n===============================================================");
                    System.out.println("SISTEM TAMAT, TERIMA KASIH");
                    System.out.println("===============================================================");
                    break;
                }

                default : {
                    System.out.println("\n===============================================================");
                    System.out.println("SALAH INPUT");
                    System.out.println("===============================================================");
                }
            }
            
            if (select == 0){
                break;
            }
        }
        
        // Analisis Kes Covid
        line1();
        System.out.println("== KES COVID-19 BAGI TIGA BUAH DAERAH NEGERI JOHOR ==");
        System.out.println("Jumlah Kes Covid Daerah Johor Bahru : " + total1);
        System.out.println("Jumlah Kes Covid Daerah Batu Pahat : " + total2);
        System.out.println("Jumlah Kes Covid Daerah Kota Tinggi : " + total3);
        
        if (total1 > total2 && total1 > total2){
            System.out.println("\nKes paling tinggi covid bagi tiga hari berturut-turut");
            System.out.println("Jumlah kes kumulatif covid-19 adalah daerah Johor Bahru " + total1);
            System.out.println("KAWASAN BERISIKO !!!");
            System.out.println("Terima Kasih Menggunakan Aplikasi Ini");
        }
        
        else if (total2 > total1 && total2 > total3){
            System.out.println("\nKes paling tinggi covid bagi tiga hari berturut-turut");
            System.out.println("Jumlah kes kumulatif covid-19 adalah daerah Batu Pahat " + total2);
            System.out.println("KAWASAN BERISIKO !!!");
            System.out.println("Terima Kasih Menggunakan Aplikasi Ini");
        }
        
        else if (total3 > total1 && total3 > total2){
            System.out.println("\nKes paling tinggi covid bagi tiga hari berturut-turut");
            System.out.println("Jumlah kes kumulatif covid-19 adalah daerah Kota Tinggi " + total3);
            System.out.println("KAWASAN BERISIKO !!!");
            System.out.println("Terima Kasih Menggunakan Aplikasi Ini");
        }
        
    }
    
    static void line1()
    {
        System.out.println("===============================================================");
    }
    
    static void daerah1()
    {
        System.out.print("Johor Bahru");
    }
    
}
