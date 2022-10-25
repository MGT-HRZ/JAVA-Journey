import java.util.Scanner;
public class formula {
    public static void main(String[] args)
    {
        /*ISIPADU SILINDER*/
        Scanner scan = new Scanner (System.in);
        System.out.print("<Masukkan Isipadu Silinder>\n");
        
        System.out.print("Nyatakan jejari silinder :");
        double jejari = scan.nextDouble();
        
        System.out.print("Nyatakan tinggi silinder :");
        double tinggi = scan.nextDouble();
        
        System.out.println("----------------------------------------");
        System.out.println("Jumlah Isipadu Silinder =\t" +(3.142 * jejari * jejari * tinggi));
        System.out.println("----------------------------------------\n");
        /*ISIPADU SILINDER*/
        
        /*LUAS SEGI EMPAT TEPAT*/
        Scanner input = new Scanner (System.in);
        System.out.print("<Masukkan Luas Segi Empat Tepat>\n");
        
        System.out.print("Nyatakan panjang segi empat tepat :");
        double panjang = input.nextDouble();
        
        System.out.print("Nyatakan lebar segi empat tepat :");
        double lebar = input.nextDouble();
        
        System.out.println("----------------------------------------");
        System.out.println("Luas Segi Empat Tepat =\t" +(panjang * lebar));
        System.out.println("----------------------------------------\n");
        /*LUAS SEGI EMPAT TEPAT*/
    }
}
