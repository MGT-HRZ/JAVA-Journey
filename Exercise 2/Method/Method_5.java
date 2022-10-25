package Method;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 28/8/2022
// Tajuk : Latihan Method BMI

import java.util.Scanner;

import java.text.DecimalFormat;

public class Method_5 {
    public static double back;
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("<Sila Masukkan Maklumat untuk BMI anda>\n\n");
        
        System.out.print("Masukkan Berat Badan Anda dalam KG : ");
        double berat = scan.nextDouble();
        
        System.out.print("Masukkan Ketinggian Anda dalam CM : ");
        double tinggi = scan.nextDouble();
        
        double convert_tinggi = tinggi/100;
        
        double Jumlah_bmi = berat/(convert_tinggi * convert_tinggi);
        
        BMI(Jumlah_bmi);
        
    }
    
    static double BMI(double Jumlah_bmi)
    {
        DecimalFormat DF;
        DF = new DecimalFormat("#.#");
        
        System.out.print("\nJumlah BMI : " + DF.format(Jumlah_bmi));
        
        if(Jumlah_bmi < 18.4)
        {
            System.out.println(" = Berat kurang normal");
        }
        else if(Jumlah_bmi >= 18.4 && Jumlah_bmi <= 24.9)
        {
            System.out.println(" = Berat normal");
        }
        else if(Jumlah_bmi >= 25.0 && Jumlah_bmi <= 29.9)
        {
            System.out.println(" = Berat tidak normal");
        }
        else if(Jumlah_bmi > 30.0)
        {
            System.out.println(" = Obesiti");
        }
        
        return back;
    }
}
