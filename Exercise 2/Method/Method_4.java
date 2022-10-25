package Method;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 28/8/2022
// Tajuk : Latihan Method

import java.util.Scanner;

public class Method_4 {
    public static int back;
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Markah PPO : ");
        int mark1 = input.nextInt();
        
        System.out.print("Masukan Markah Organisasi : ");
        int mark2 = input.nextInt();
        
        int nilai = mark1 + mark2;
        
        line();
        count(nilai);
        line();
        
        
    }
    
    static int count(int nilai)
    {
        if (nilai >= 40){
           System.out.println("Jumlah markah OJT anda ialah : " + nilai); 
           System.out.println("Anda lulus");
        }
        
        else if (nilai < 40){
           System.out.println("Jumlah markah OJT anda ialah : " + nilai); 
           System.out.println("Anda gagal");
        }
        
        return back;
    }
    
    static void line()
    {
        System.out.println("========================================================================");
    }
}
