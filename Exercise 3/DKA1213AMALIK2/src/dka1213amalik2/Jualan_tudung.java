package dka1213amalik2;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Jualan_tudung {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        double jumlah = 0;
        
        for(int i = 0; i < 10; i++){
        
            System.out.println("=== MENU TUDUNG ===");
            System.out.println("Menu\tSENARAI SYARIKAT ");
            System.out.println("1\tHIJANAH");
            System.out.println("2\tKHADDEJA");
            System.out.println("0\tKeluar Sistem ");
            System.out.println("=================================");
            System.out.println("HARGA SEVIS CAJ PENGHANTARAN");
            System.out.println("JNT\t RM10.50  ");
            System.out.println("DHL\t RM9.50");
            System.out.println("POS LAJU\t RM8.90");

            System.out.println();
            System.out.print("Sila Pilih menu 1, 2 atau 0 : ");
            int menu = input.nextInt();
            System.out.println();
        
            switch(menu)
            {
                case 1: {
                    System.out.println("Jenis Syarikat : Hijanah");
                    System.out.println("Qaysarah\t\t RM19.00 ");
                    System.out.println("Sarung\t\t RM12.50");
                    System.out.println("Lily\t\t RM15.90");
                    
                    System.out.println();
                    System.out.print("Masukkan jumlah Qaysarah yang ingin dipesan : ");
                    int jum_qaysarah = input.nextInt();
                    double qaysarah = 19.0 * jum_qaysarah;
        
                    System.out.print("Masukkan jumlah sarung yang ingin dipesan : ");
                    int jum_sarung = input.nextInt();
                    double sarung= 12.5 * jum_sarung;

                    System.out.print("Masukkan jumlah Lily yang ingin dipesan : ");
                    int jum_lily = input.nextInt();
                    double lily = 15.9 * jum_lily;
                    
                    System.out.println("JUMLAH TUDUNG YANG DIPESAN : " + (jum_qaysarah + jum_sarung + jum_lily));
                    
                    double total = qaysarah + sarung + lily;
                    
                    jumlah = jumlah + total;
                    
                    System.out.println();
                    break;
                }
                
                case 2: {
                    System.out.println("Jenis Syarikat : Khadeejah");
                    System.out.println("Tunic\t\t RM16.00 ");
                    System.out.println("Lady Bird\t RM12.90");
                    System.out.println("Sarung\t\t RM14.90");
                    
                    System.out.println();
                    System.out.print("Masukkan jumlah tunic yang ingin dipesan : ");
                    int jum_tunic = input.nextInt();
                    double tunic = 16.0 * jum_tunic;
        
                    System.out.print("Masukkan jumlah ladybird yang ingin dipesan : ");
                    int jum_ladybird = input.nextInt();
                    double ladybird = 12.9 * jum_ladybird;

                    System.out.print("Masukkan jumlah sarung yang ingin dipesan : ");
                    int jum_sarung = input.nextInt();
                    double sarung = 14.9 * jum_sarung;
                    
                    System.out.println("JUMLAH TUDUNG YANG DIPESAN : " + (jum_tunic + jum_ladybird + jum_sarung));
                    
                    double total = tunic + ladybird + sarung;
                    
                    jumlah = jumlah + total;
                    
                    System.out.println();
                    break;
                }
                
                case 0: {
                    System.out.println("SISTEM TAMAT");
                    
                    break;
                }
                
                default: {
                    System.out.println("INPUT SALAH");
                }
            }
            
            if (menu == 0){
                break;
            }
        }
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Caj Penghantaran bagi servis JnT : RM " + DF.format(jumlah + 10.5));
        System.out.println("Caj Penghantaran bagi servis DHL : RM " + DF.format(jumlah + 9.5));
        System.out.println("Caj Penghantaran bagi servis Pos Laju : RM " + DF.format(jumlah + 8.9));
    }
}
