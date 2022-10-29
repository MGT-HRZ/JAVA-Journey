package dka1213amalik2;

import java.util.Scanner;

import java.text.DecimalFormat;

public class MarkahPelajar3 {
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
            String nama[][] = new String [1][total];
        
        // Array markah bagi Ujian 1, Pertengahan Tahun & Akhir Tahun
            double ujian1[][] = new double [1][total];
            double ujian2[][] = new double [1][total];
            double ujian3[][] = new double [1][total];
        
    // Struktur ulangan DO-WHILE
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
                    MaxMin(total, ujian1, ujian2, ujian3);
                    
                    System.out.print("\n");
                    break;
                }
                
            // Case 4 : Paparan Keluar Program
                case 4 : {
                    print(total, nama, ujian1, ujian2, ujian3);
                    
                    System.out.print("\n");
                    break;
                }
                
            // Case 4 : Paparan Keluar Program
                case 5 : {
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
            
            if (pilihan == 5){
                break;
            }
            
            i++;
        }
        
        while (i < 10);
        
    }
    
    // Method MENU
    static void menu() {  
        System.out.println("1. Masukkan Nama Pelajar dan Markah");
        System.out.println("2. Kira Jumlah Markah dan Purata Markah");
        System.out.println("3. Paparan Max Min Markah Pelajar");
        System.out.println("4. Paparan Markah Mengikut Pentaksiran");
        System.out.println("5. Keluar Program");
    }
    
    // Method masukkan data input
    static void insert(int total, String nama[][], double ujian1[][], double ujian2[][], double ujian3[][]) 
    {
        Scanner input = new Scanner(System.in);
        
        int r = 0;
        
        int c = 0;
        
        do {
            do {
                System.out.print("\nNama Pelajar : ");
                nama[r][c] = input.nextLine();

                System.out.print("Markah Ujian 1 : ");
                ujian1[r][c] = input.nextDouble();

                System.out.print("Markah Pertengahan Tahun : ");
                ujian2[r][c] = input.nextDouble();

                System.out.print("Markah Akhir Tahun : ");
                ujian3[r][c] = input.nextDouble();

                input.nextLine();
                
                c++;
            }
            
            while (c < total);

            r++;
        }  
        
        while (r < 1);
    }
    
    // Method kira jumlah markah
    // Method paparan semua jumlah markah
    static double calculate(int total, double ujian1[][], double ujian2[][], double ujian3[][]) 
    { 
        DecimalFormat DF;
        DF = new DecimalFormat("0.00");
        
        double sum_ujian1 = 0;
        double sum_ujian2 = 0;
        double sum_ujian3 = 0;
        
        int r = 0;
        
        int c = 0;
        
        do {
            do {
                sum_ujian1 = sum_ujian1 +  ujian1[r][c];
                sum_ujian2 = sum_ujian2 +  ujian2[r][c];
                sum_ujian3 = sum_ujian3 +  ujian3[r][c];

                c++;
            }  
        
            while (c < total);

            r++;
        }  
        
        while (r < 1);
        
        System.out.println("\nJumlah Markah Ujian 1 : " + sum_ujian1);
                            
        System.out.println("Jumlah Markah Pertengahan Tahun : " + sum_ujian2);
                            
        System.out.println("Jumlah Markah Akhir Tahun : " + sum_ujian3);
        
        System.out.println("\nBilangan Markah : " + total);
        
        System.out.println("Purata Markah Ujian 1 : " + DF.format(sum_ujian1 / total));
                            
        System.out.println("Purata Markah Pertengahan Tahun : " + DF.format(sum_ujian2 / total));
                            
        System.out.println("Purata Markah Akhir Tahun : " + DF.format(sum_ujian3 / total) + "\n");
        
        return back;
    }
    
    // Method Max & Min Markah
    static double MaxMin(int total, double ujian1[][], double ujian2[][], double ujian3[][]) 
    { 
        DecimalFormat DF;
        DF = new DecimalFormat("0.00");
        
        double sum_ujian1 = 0;
        double sum_ujian2 = 0;
        double sum_ujian3 = 0;
        
        int r = 0;
        
        int c = 0;
        
        do {
            do {
                sum_ujian1 = sum_ujian1 +  ujian1[r][c];
                sum_ujian2 = sum_ujian2 +  ujian2[r][c];
                sum_ujian3 = sum_ujian3 +  ujian3[r][c];

                c++;
            }  
        
            while (c < total);

            r++;
        }  
        
        while (r < 1);
        
        
        System.out.println("\nKeputusan Max Markah");
        System.out.println("-------------------------");
        
        if (sum_ujian1 > sum_ujian2 && sum_ujian1 > sum_ujian3){
            System.out.println("Markah Ujian 1 ialah "+ sum_ujian1 +" lebih tinggi daripada markah Pertengahan Tahun dan Markah Akhir Tahun");
        }
        
        else if (sum_ujian2 > sum_ujian1 && sum_ujian2 > sum_ujian3){
            System.out.println("Markah Pertengahan Tahun ialah "+ sum_ujian2 +" lebih tinggi daripada markah Ujian 1 dan Markah Akhir Tahun");
        }
        
        else if (sum_ujian3 > sum_ujian1 && sum_ujian3 > sum_ujian2){
            System.out.println("Markah Akhir Tahun ialah "+ sum_ujian3 +" lebih tinggi daripada markah Ujian 1 dan Markah Pertengahan Tahun");
        }
        
        else {
            System.out.println("Nilai Max markah adalah setara");
        }
        
        
        System.out.println("\nKeputusan Min Markah");
        System.out.println("-------------------------");
         
        if (sum_ujian1 < sum_ujian2 && sum_ujian1 < sum_ujian3){
            System.out.println("Markah Ujian 1 ialah "+ sum_ujian1 +" lebih kurang daripada markah Pertengahan Tahun dan Markah Akhir Tahun");
        }
        
        else if (sum_ujian2 < sum_ujian1 && sum_ujian2 < sum_ujian3){
            System.out.println("Markah Pertengahan Tahun ialah "+ sum_ujian2 +" lebih kurang daripada markah Ujian 1 dan Markah Akhir Tahun");
        }
        
        else if (sum_ujian3 < sum_ujian1 && sum_ujian3 < sum_ujian2){
            System.out.println("Markah Akhir Tahun ialah "+ sum_ujian3 +" lebih kurang daripada markah Ujian 1 dan Markah Pertengahan Tahun");
        }
        
        else {
            System.out.println("Nilai Min markah adalah setara");
        }
        
        return back;
    }
    
    // Method paparan semua data pelajar
    static void print(int total, String nama[][], double ujian1[][], double ujian2[][], double ujian3[][]) 
    {
        System.out.println("\nNama\tUjian 1\t\tPertengahan Tahun\tAkhir Tahun");
        
        int r = 0;
        
        int c = 0;
                    
        do {
            do {
                System.out.println(nama[r][c] + "\t" + ujian1[r][c] + "\t\t" + ujian2[r][c] + "\t\t\t" + ujian3[r][c]); 
            
                c++;
            }  

            while (c < total);
            
            r++;
        }  
        
        while (r < 1);
    }
}
