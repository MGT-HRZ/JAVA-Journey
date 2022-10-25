package dka1213amalik2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PNGK_calculator_GUI {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        String nama[] = new String [4];
        String nama_GUI[] = new String [4];
        
        String kursus[] = new String [4];
        String kursus_GUI[] = new String [4];
        
        String no_ic[] = new String [4];
        String no_ic_GUI[] = new String [4];
        
        String no_ag[] = new String [4];
        String no_ag_GUI[] = new String [4];
        
        double sem1[][] = new double [1][4];
        double sem1_GUI[][] = new double[1][4];
        
        double sem2[][] = new double [1][4];
        double sem2_GUI[][] = new double[1][4];
        
        double sem3[][] = new double [1][4];
        double sem3_GUI[][] = new double[1][4];
        
        double sem4[][] = new double [1][4];
        double sem4_GUI[][] = new double[1][4];
        
        double pngk[][] = new double [1][4];
        
        for(int r = 0; r < 1; r++){
            for(int c = 0; c < 4; c++){
                nama_GUI[r] = JOptionPane.showInputDialog("PELAJAR " + (c + 1) +  "\nMASUKAN NAMA PELAJAR : ");
                nama[r] = nama_GUI[r];

                kursus_GUI[r] = JOptionPane.showInputDialog("MASUKAN NO. KAD PENGENALAN :");
                kursus[r] = kursus_GUI[r];
                
                no_ic_GUI[r] = JOptionPane.showInputDialog("MASUKAN KURSUS :");
                no_ic[r] = no_ic_GUI[r];
                
                no_ag_GUI[r] = JOptionPane.showInputDialog("MASUKAN ANGKA GILIRAN :");
                no_ag[r] = no_ag_GUI[r];
                
                sem1_GUI[r][c] = Double.parseDouble(JOptionPane.showInputDialog("MASUKAN GPA Semester 1 : "));
                sem1[r][c] = sem1_GUI[r][c];
                
                sem2_GUI[r][c] = Double.parseDouble(JOptionPane.showInputDialog("MASUKAN GPA Semester 2 : "));
                sem2[r][c] = sem2_GUI[r][c];
                
                sem3_GUI[r][c] = Double.parseDouble(JOptionPane.showInputDialog("MASUKAN GPA Semester 3 : "));
                sem3[r][c] = sem3_GUI[r][c];
                
                sem4_GUI[r][c] = Double.parseDouble(JOptionPane.showInputDialog("MASUKAN GPA Semester 4 : "));
                sem4[r][c] = sem4_GUI[r][c];
            }           
        }
        
        for(int r = 0; r < 1; r++){
            for(int c = 0; c < 4; c++){
                divider2();
                System.out.println("PELAJAR " + (c + 1));
                divider2();
                
                System.out.println("NAMA PELAJAR : " + nama[r].toUpperCase());
                System.out.println("No. IC : " + no_ic[r]);
                System.out.println("KURSUS : " + kursus[r].toUpperCase());
                System.out.println("ANGKA GILIRAN : " + no_ag[r].toUpperCase());
                
                System.out.println();
                
                System.out.println("GPA Semester 1 : " + sem1[r][c]);
                System.out.println("GPA Semester 2 : " + sem2[r][c]);
                System.out.println("GPA Semester 3 : " + sem3[r][c]);
                System.out.println("GPA Semester 4 : " + sem4[r][c]);
                
                pngk[r][c] = (sem1[r][c] + sem2[r][c] + sem3[r][c] + sem4[r][c]) / 4;
                
                divider2();
                System.out.println("PURATA NILAI GRED KESELURUHAN - PNGK Pelajar : " + pngk[r][c]);
                divider2();
                
                System.out.println();
            }        
        }
    }
    
    static void divider1()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    static void divider2()
    {
        System.out.println("----------------------------------------------------------");
    }
    
    static void divider3()
    {
        System.out.println("===================================================");
    }
}
