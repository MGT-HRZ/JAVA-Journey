package dka1213amalik2;

/*
    Tajuk   : PROJEK SISTEM KALKULATOR PENGIRAAN PNGK KURSUS
*/

import java.util.Scanner;

import java.text.DecimalFormat;

public class PNGK_calculator {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        DecimalFormat DF;
        DF = new DecimalFormat("#.##");
        
        int pilih, mula;
        
        /* 1D Array bagi mengumpul data seperti :
         * Nama
         * Kursus
         * No. IC
         * No. Angka Giliran
         */
        String nama[] = new String [4];
        String kursus[] = new String [4];
        String no_ic[] = new String [4];
        String no_ag[] = new String [4];
        
        // 2D Array bagi pengumpulan data bagi setiap semester
        double sem1[][] = new double [1][4];
        double sem2[][] = new double [1][4];
        double sem3[][] = new double [1][4];
        double sem4[][] = new double [1][4];
        
        // 2D Array bagi hasil pengiraan pngk
        double pngk[][] = new double [1][4];
        
        // Menu utama prngiraan pngk mengikut kursus
        for (int l = 0; l < 10; l++){
            System.out.println("\n====-- SELAMAT DATANG KE SISTEM KALKULATOR PENGIRAAN PNGK KURSUS --====\n");
            System.out.println("1. APLIKASI WEB");
            System.out.println("2. AUTOMOTIF");
            System.out.println("3. ELEKTRONIK");
            System.out.println("4. ROBOTIK");
            System.out.println("0. KELUAR SISTEM");
            
            // Berdasarkan menu pilihan diatas
            System.out.print("\nPilih (1, 2, 3, 4 atau 0) : ");
            pilih = input.nextInt();
            divider2();
            
            input.nextLine();
            
            // Kursus APLIKASI WEB
            if (pilih == 1){
                System.out.println("PILIHAN KURSUS : APLIKASI WEB");
                System.out.print("\nTekan Nombor(1) untuk mulakan proses : ");
                mula = input.nextInt();
                
                input.nextLine();
                
                // Input / Maklummat yang diperlukan untuk pengiraan pngk
                if (mula == 1){
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider1();
                            System.out.println("PELAJAR " + (c + 1));
                            divider1();

                            System.out.print("MASUKAN NAMA PELAJAR : ");
                            nama[c] = input.nextLine();

                            System.out.print("MASUKAN NO. KAD PENGENALAN : ");
                            no_ic[c] = input.nextLine();

                            System.out.print("MASUKAN KURSUS : ");
                            kursus[c] = input.nextLine();

                            System.out.print("MASUKAN ANGKA GILIRAN : ");
                            no_ag[c] = input.nextLine();

                            System.out.println();

                            System.out.print("MASUKAN GPA Semester 1 : ");
                            sem1[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 2 : ");
                            sem2[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 3 : ");
                            sem3[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 4 : ");
                            sem4[r][c] = input.nextDouble();

                            divider1();
                            System.out.println();
                            input.nextLine();
                        }           
                    }

                    divider3();

                    // Output hasil pengiraan pngk 4 orang pelajar
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider2();
                            System.out.println("PELAJAR " + (c + 1));
                            divider2();

                            System.out.println("NAMA PELAJAR : " + nama[c].toUpperCase());
                            System.out.println("No. IC : " + no_ic[c]);
                            System.out.println("KURSUS : " + kursus[c].toUpperCase());
                            System.out.println("ANGKA GILIRAN : " + no_ag[c].toUpperCase());

                            System.out.println();

                            System.out.println("GPA Semester 1 : " + sem1[r][c]);
                            System.out.println("GPA Semester 2 : " + sem2[r][c]);
                            System.out.println("GPA Semester 3 : " + sem3[r][c]);
                            System.out.println("GPA Semester 4 : " + sem4[r][c]);

                            pngk[r][c] = (sem1[r][c] + sem2[r][c] + sem3[r][c] + sem4[r][c]) / 4;

                            divider2();
                            System.out.println("PURATA NILAI GRED KESELURUHAN - PNGK Pelajar : " + DF.format(pngk[r][c]));
                            divider2();

                            System.out.println();
                        }        
                    }
                }
            }
            
            // Kursus AUTOMOTIF
            else if (pilih == 2){
                System.out.println("PILIHAN KURSUS : AUTOMOTIF");
                System.out.print("\nTekan Nombor(1) untuk mulakan proses : ");
                mula = input.nextInt();
                
                input.nextLine();
                
                // Input / Maklummat yang diperlukan untuk pengiraan pngk
                if (mula == 1){
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider1();
                            System.out.println("PELAJAR " + (c + 1));
                            divider1();

                            System.out.print("MASUKAN NAMA PELAJAR : ");
                            nama[c] = input.nextLine();

                            System.out.print("MASUKAN NO. KAD PENGENALAN : ");
                            no_ic[c] = input.nextLine();

                            System.out.print("MASUKAN KURSUS : ");
                            kursus[c] = input.nextLine();

                            System.out.print("MASUKAN ANGKA GILIRAN : ");
                            no_ag[c] = input.nextLine();

                            System.out.println();

                            System.out.print("MASUKAN GPA Semester 1 : ");
                            sem1[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 2 : ");
                            sem2[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 3 : ");
                            sem3[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 4 : ");
                            sem4[r][c] = input.nextDouble();

                            divider1();
                            System.out.println();
                            input.nextLine();
                        }           
                    }

                    divider3();

                    // Output hasil pengiraan pngk 4 orang pelajar
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider2();
                            System.out.println("PELAJAR " + (c + 1));
                            divider2();

                            System.out.println("NAMA PELAJAR : " + nama[c].toUpperCase());
                            System.out.println("No. IC : " + no_ic[c]);
                            System.out.println("KURSUS : " + kursus[c].toUpperCase());
                            System.out.println("ANGKA GILIRAN : " + no_ag[c].toUpperCase());

                            System.out.println();

                            System.out.println("GPA Semester 1 : " + sem1[r][c]);
                            System.out.println("GPA Semester 2 : " + sem2[r][c]);
                            System.out.println("GPA Semester 3 : " + sem3[r][c]);
                            System.out.println("GPA Semester 4 : " + sem4[r][c]);

                            pngk[r][c] = (sem1[r][c] + sem2[r][c] + sem3[r][c] + sem4[r][c]) / 4;

                            divider2();
                            System.out.println("PURATA NILAI GRED KESELURUHAN - PNGK Pelajar : " + DF.format(pngk[r][c]));
                            divider2();

                            System.out.println();
                        }        
                    }
                }
            }
            
            // Kursus ELEKTRONIK
            else if (pilih == 3){
                System.out.println("PILIHAN KURSUS : ELEKTRONIK");
                System.out.print("\nTekan Nombor(1) untuk mulakan proses : ");
                mula = input.nextInt();
                
                input.nextLine();
                
                // Input / Maklummat yang diperlukan untuk pengiraan pngk
                if (mula == 1){
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider1();
                            System.out.println("PELAJAR " + (c + 1));
                            divider1();

                            System.out.print("MASUKAN NAMA PELAJAR : ");
                            nama[c] = input.nextLine();

                            System.out.print("MASUKAN NO. KAD PENGENALAN : ");
                            no_ic[c] = input.nextLine();

                            System.out.print("MASUKAN KURSUS : ");
                            kursus[c] = input.nextLine();

                            System.out.print("MASUKAN ANGKA GILIRAN : ");
                            no_ag[c] = input.nextLine();

                            System.out.println();

                            System.out.print("MASUKAN GPA Semester 1 : ");
                            sem1[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 2 : ");
                            sem2[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 3 : ");
                            sem3[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 4 : ");
                            sem4[r][c] = input.nextDouble();

                            divider1();
                            System.out.println();
                            input.nextLine();
                        }           
                    }

                    divider3();

                    // Output hasil pengiraan pngk 4 orang pelajar
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider2();
                            System.out.println("PELAJAR " + (c + 1));
                            divider2();

                            System.out.println("NAMA PELAJAR : " + nama[c].toUpperCase());
                            System.out.println("No. IC : " + no_ic[c]);
                            System.out.println("KURSUS : " + kursus[c].toUpperCase());
                            System.out.println("ANGKA GILIRAN : " + no_ag[c].toUpperCase());

                            System.out.println();

                            System.out.println("GPA Semester 1 : " + sem1[r][c]);
                            System.out.println("GPA Semester 2 : " + sem2[r][c]);
                            System.out.println("GPA Semester 3 : " + sem3[r][c]);
                            System.out.println("GPA Semester 4 : " + sem4[r][c]);

                            pngk[r][c] = (sem1[r][c] + sem2[r][c] + sem3[r][c] + sem4[r][c]) / 4;

                            divider2();
                            System.out.println("PURATA NILAI GRED KESELURUHAN - PNGK Pelajar : " + DF.format(pngk[r][c]));
                            divider2();

                            System.out.println();
                        }        
                    }
                }
            }
            
            // Kursus ROBOTIK
            else if (pilih == 4){
                System.out.println("PILIHAN KURSUS : ROBOTIK");
                System.out.print("\nTekan Nombor(1) untuk mulakan proses : ");
                mula = input.nextInt();
                
                input.nextLine();
                
                // Input / Maklummat yang diperlukan untuk pengiraan pngk
                if (mula == 1){
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider1();
                            System.out.println("PELAJAR " + (c + 1));
                            divider1();

                            System.out.print("MASUKAN NAMA PELAJAR : ");
                            nama[c] = input.nextLine();

                            System.out.print("MASUKAN NO. KAD PENGENALAN : ");
                            no_ic[c] = input.nextLine();

                            System.out.print("MASUKAN KURSUS : ");
                            kursus[c] = input.nextLine();

                            System.out.print("MASUKAN ANGKA GILIRAN : ");
                            no_ag[c] = input.nextLine();

                            System.out.println();

                            System.out.print("MASUKAN GPA Semester 1 : ");
                            sem1[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 2 : ");
                            sem2[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 3 : ");
                            sem3[r][c] = input.nextDouble();

                            System.out.print("MASUKAN GPA Semester 4 : ");
                            sem4[r][c] = input.nextDouble();

                            divider1();
                            System.out.println();
                            input.nextLine();
                        }           
                    }

                    divider3();

                    // Output hasil pengiraan pngk 4 orang pelajar
                    for(int r = 0; r < 1; r++){
                        for(int c = 0; c < 4; c++){
                            divider2();
                            System.out.println("PELAJAR " + (c + 1));
                            divider2();

                            System.out.println("NAMA PELAJAR : " + nama[c].toUpperCase());
                            System.out.println("No. IC : " + no_ic[c]);
                            System.out.println("KURSUS : " + kursus[c].toUpperCase());
                            System.out.println("ANGKA GILIRAN : " + no_ag[c].toUpperCase());

                            System.out.println();

                            System.out.println("GPA Semester 1 : " + sem1[r][c]);
                            System.out.println("GPA Semester 2 : " + sem2[r][c]);
                            System.out.println("GPA Semester 3 : " + sem3[r][c]);
                            System.out.println("GPA Semester 4 : " + sem4[r][c]);

                            pngk[r][c] = (sem1[r][c] + sem2[r][c] + sem3[r][c] + sem4[r][c]) / 4;

                            divider2();
                            System.out.println("PURATA NILAI GRED KESELURUHAN - PNGK Pelajar : " + DF.format(pngk[r][c]));
                            divider2();

                            System.out.println();
                        }        
                    }
                }
            }
            
            // Menamatkan sistem jika pengguna masukan input = 0
            else if (pilih == 0){
                tamat();
                break;
            }
        }
        
    }
    
    // Method divider 1
    static void divider1()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    // Method divider 2
    static void divider2()
    {
        System.out.println("----------------------------------------------------------");
    }
    
    // Method divider 3
    static void divider3()
    {
        System.out.println("===================================================================");
        System.out.println("\t\tHASIL PENGIRAAN PNGK PELAJAR");
        System.out.println("===================================================================");
    }
    
    // Method Output setelah sistem TAMAT
    static void tamat()
    {
        System.out.println("==========================================================");
        System.out.println("\t\tSISTEM TAMAT, TERIMA KASIH");
        System.out.println("==========================================================");
    }
}
