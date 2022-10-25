import java.util.Scanner;
public class BMI {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("<Sila Masukkan Maklumat untuk BMI anda>\n\n");
        
        System.out.print("Masukkan Nama Anda : ");
        String nama = scan.nextLine();
        
        System.out.print("Masukkan Berat Badan Anda dalam KG : ");
        double berat = scan.nextDouble();
        
        System.out.print("Masukkan Ketinggian Anda dalam Meter : ");
        double tinggi = scan.nextDouble();
        
        System.out.println("-------------------------------------------------");
        System.out.println("Nama anda :"+nama);
        System.out.println("Berat anda :"+berat+ " kg");
        System.out.println("Tinggi anda :"+tinggi+ " meter");
        System.out.println("Jumlah BMI anda :"+(berat/(tinggi * tinggi)));
        System.out.println("-------------------------------------------------");
        
        double Jumlah_bmi = berat/(tinggi * tinggi);
        
        if(Jumlah_bmi < 18.4)
        {
            System.out.println("Berat anda adalah kurang normal");
        }
        else if(Jumlah_bmi >= 18.4 && Jumlah_bmi <= 24.9)
        {
            System.out.println("Berat anda adalah normal");
        }
        else if(Jumlah_bmi >= 25.0 && Jumlah_bmi <= 29.9)
        {
            System.out.println("Berat anda adalah tidak normal");
        }
        else if(Jumlah_bmi > 30.0)
        {
            System.out.println("Anda telah mencapai tahap obesiti");
        }
        
        System.out.println("-------------------------------------------------");
    }
}
