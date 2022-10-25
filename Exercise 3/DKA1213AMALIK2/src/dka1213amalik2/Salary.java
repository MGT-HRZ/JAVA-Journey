package dka1213amalik2;

import java.util.Scanner;

public class Salary {
    public static double back;
    public static void main (String args[])
    {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
                
        int pilihan;
        
        // Array Nama Pekerja
            String nama[] = new String [3];
        
        // Array gaji bagi bulan JANUARI, FEBRUARI & MAC
            double JAN[] = new double [3];
            double FEB[] = new double [3];
            double MAC[] = new double [3];
        
        // Array mengumpul ke semua nilai gaji
            double sum_jan, sum_feb, sum_mac;
    
    // Stuktur ulangan DO-WHILE
        do {
            // Paparan Menu Pilihan
                menu();
            
            System.out.print("\nPilihan Anda : ");
            pilihan = input.nextInt();
            
            switch (pilihan)
            {
            // Case 1 : Masukkan Nama dan gaji pekerja
                case 1 : {
                    insert(nama, JAN, FEB, MAC);
                    
                    System.out.println("\nTerima Kasih !\n");
                    break;
                }
                
            // Case 2 : Mengira jumlah gaji bulanan
                case 2 : {          
                    calculate(JAN, FEB, MAC);
                    
                    break;
                }
            
            // Case 3 : Memaparkan semua data pekerja
                case 3 : {
                    print(nama, JAN, FEB, MAC);
                    
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
            
        // Keluar Program
            if (pilihan == 4){
                break;
            }
            
            i++;
        }
        
        while (i < 5);
    }
    
    // Method MENU
    static void menu() {  
        System.out.println("1. Masukkan Nama Pekerja dan Gaji");
        System.out.println("2. Kira Jumlah Gaji");
        System.out.println("3. Paparan Gaji Mengikut Pekerja");
        System.out.println("4. Keluar Program");
    }
    
    // Method masukkan data input
    static void insert(String nama[], double JAN[], double FEB[], double MAC[]) 
    {
        Scanner input = new Scanner(System.in);
        
        int r = 0;
        
        do {                      
            System.out.print("\nMasukkan Nama Pekerja : ");
            nama[r] = input.nextLine();
                            
            System.out.print("Gaji Bulan Januari RM : ");
            JAN[r] = input.nextDouble();
                            
            System.out.print("Gaji Bulan Februari RM : ");
            FEB[r] = input.nextDouble();
                            
            System.out.print("Gaji Bulan Mac RM : ");
            MAC[r] = input.nextDouble();
                    
            input.nextLine();
            
            r++;
        }  
        
        while (r < 3);
    }
    
    // Method kira jumlah gaji bulanan
    static double getsum(double JAN[], double FEB[], double MAC[]) 
    { 
        double sum_jan, sum_feb, sum_mac;
        
        sum_jan = JAN[0] + JAN[1] + JAN[2];
        sum_feb = FEB[0] + FEB[1] + FEB[2];
        sum_mac = MAC[0] + MAC[1] + MAC[2];
        
        System.out.println("\nGaji Bulan Januari RM : " + sum_jan);
                            
        System.out.println("Gaji Bulan Februari RM : " + sum_feb);
                            
        System.out.println("Gaji Bulan Mac RM : " + sum_mac + "\n");
        
        return back;
    }
    
    // Method paparan semua jumlah gaji bulanan
    static void calculate(double JAN[], double FEB[], double MAC[]) 
    {      
        getsum(JAN, FEB, MAC);
    }
    
    // Method paparan semua data pekerja
    static void print(String nama[], double JAN[], double FEB[], double MAC[]) 
    {
        System.out.println("\nNama\tJanuari (RM)\tFebruari (RM)\tMac (RM)");
        
        int r = 0;
                    
        do {
            System.out.println(nama[r] + "\t" + JAN[r] + "\t\t" + FEB[r] + "\t\t" + MAC[r]); 
            
            r++;
        }  
        
        while (r < 3);
    }
}
    
