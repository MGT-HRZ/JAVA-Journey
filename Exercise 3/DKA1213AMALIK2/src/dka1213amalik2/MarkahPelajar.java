package dka1213amalik2;

import java.util.Scanner;

import java.text.DecimalFormat;

public class MarkahPelajar {
    public static double back;
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("0.00");
        
        int i = 0;
        
        int pilihan;
        
        int total;
        
        // Input Bilangan Pelajar
            System.out.print("\nMasukkan Bilangan Pelajar : ");
            total = input.nextInt();
            System.out.println();
        
        // Array Nama Pelajar
            String nama[] = new String [total];
        
        // Array markah bagi Ujian 1, Pertengahan Tahun & Akhir Tahun
            double ujian1[] = new double [total];
            double ujian2[] = new double [total];
            double ujian3[] = new double [total];
        
    // Stuktur ulangan DO-WHILE
        do {
            // Paparan Menu Pilihan
                menu();
            
            System.out.print("\nPilihan Anda : ");
            pilihan = input.nextInt();
            
            switch(pilihan)
            {
            // Case 1 : Masukkan nama & markah
                case 1 : {
                    insert(total, nama, ujian1, ujian2, ujian3);
                    
                    System.out.println("\nTerima Kasih !\n");
                    break;
                } 
                
            // Case 2 : Mengira jumlah markah
                case 2 : {
                    calculate(total, ujian1, ujian2, ujian3);
                    
                    break;
                }
            
            // Case 3 : Memaparkan semua data pelajar
                case 3 : {
                    print(total, nama, ujian1, ujian2, ujian3);
                    
                    System.out.print("\n");
                    break;
                }
                
            // Case 4 : Paparan Keluar Program
                case 4 : {
                    System.out.println("===================================");
                    System.out.println("Keluar Program");
                    System.out.println("===================================");
                    
                    break;
                }
            
            // Default : Kesalahan kemasukkan input
                default : {
                    System.out.println("===================================");
                    System.out.println("Maaf Salah Pilihan");
                    System.out.println("===================================");
                    System.out.print("\n");
                }
            
            }
            
            if (pilihan == 4){
                break;
            }
            
            i++;
        }
        
        while (i < 5);
        
    }
    
    // Method MENU
    static void menu() {  
        System.out.println("1. Masukkan Nama Pelajar dan Markah");
        System.out.println("2. Kira Jumlah Markah dan Purata Markah");
        System.out.println("3. Paparan Markah Mengikut Pentaksiran");
        System.out.println("4. Keluar Program");
    }
    
    // Method masukkan data input
    static void insert(int total, String nama[], double ujian1[], double ujian2[], double ujian3[]) 
    {
        Scanner input = new Scanner(System.in);
        
        int r = 0;
        
        do { 
            System.out.print("\nNama Pelajar : ");
            nama[r] = input.nextLine();
                            
            System.out.print("Markah Ujian 1 : ");
            ujian1[r] = input.nextDouble();
                            
            System.out.print("Markah Pertengahan Tahun : ");
            ujian2[r] = input.nextDouble();
                            
            System.out.print("Markah Akhir Tahun : ");
            ujian3[r] = input.nextDouble();
            
            input.nextLine();
            
            r++;
        }  
        
        while (r < total);
    }
    
    // Method kira jumlah markah
    // Method paparan semua jumlah markah
    static double calculate(int total, double ujian1[], double ujian2[], double ujian3[]) 
    { 
        DecimalFormat DF;
        DF = new DecimalFormat("0.00");
        
        double sum_ujian1 = 0;
        double sum_ujian2 = 0;
        double sum_ujian3 = 0;
        
        int r = 0;
        
        do {
            sum_ujian1 = sum_ujian1 +  ujian1[r];
            sum_ujian2 = sum_ujian2 +  ujian2[r];
            sum_ujian3 = sum_ujian3 +  ujian3[r];

            r++;
        }  
        
        while (r < total);
        
        System.out.println("\nJumlah Markah Ujian 1 : " + sum_ujian1);
                            
        System.out.println("Jumlah Markah Pertengahan Tahun : " + sum_ujian2);
                            
        System.out.println("Jumlah Markah Akhir Tahun : " + sum_ujian3);
        
        System.out.println("\nBilangan Markah : " + total);
        
        System.out.println("Purata Markah Ujian 1 : " + DF.format(sum_ujian1 / total));
                            
        System.out.println("Purata Markah Pertengahan Tahun : " + DF.format(sum_ujian2 / total));
                            
        System.out.println("Purata Markah Akhir Tahun : " + DF.format(sum_ujian3 / total) + "\n");
        
        return back;
    }
    
    // Method paparan semua data pelajar
    static void print(int total, String nama[], double ujian1[], double ujian2[], double ujian3[]) 
    {
        System.out.println("\nNama\tUjian 1\t\tPertengahan Tahun\tAkhir Tahun");
        
        int r = 0;
                    
        do {
            System.out.println(nama[r] + "\t" + ujian1[r] + "\t\t" + ujian2[r] + "\t\t\t" + ujian3[r]); 
            
            r++;
        }  
        
        while (r < total);
    }
}
