import java.util.Scanner;
public class switchcase {
    public static void main(String[] args)
    {
        System.out.print("Menu \t");
        System.out.print("Makanan \t");
        System.out.print("\t Harga \n");
        System.out.print("1 \t");
        System.out.print("Nasi Lemak \t");
        System.out.print("RM3.00 \n");
        System.out.print("2 \t");
        System.out.print("Nasi Briyani \t");
        System.out.print("RM8.00 \n");
        System.out.print("3 \t");
        System.out.print("Nasi Minyak \t");
        System.out.print("RM5.00 \n");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Pilihan Menu 1 / 2 / 3 :");
        int select = input.nextInt();
        
        switch (select)
        {
            case 1 : {
               System.out.println("Menu Pilihan : Nasi Lemak");
               System.out.print("Masukkan Bilangan :");
               double case1 = input.nextDouble();
               System.out.println("=================================");
               System.out.println("JUMLAH PERLU DIBAYAR : RM"+(case1 * 3.0));
               System.out.println("=================================");
               break; 
            }
            case 2 : {
               System.out.println("Menu Pilihan : Nasi Briyani");
               System.out.print("Masukkan Bilangan :");
               double case2 = input.nextDouble();
               System.out.println("=================================");
               System.out.println("JUMLAH PERLU DIBAYAR : RM"+(case2 * 8.0));
               System.out.println("=================================");
               break; 
            }
            case 3 : {
               System.out.println("Menu Pilihan : Nasi Minyak");
               System.out.print("Masukkan Bilangan :");
               double case3 = input.nextDouble();
               System.out.println("=================================");
               System.out.println("JUMLAH PERLU DIBAYAR : RM"+(case3 * 5.0));
               System.out.println("=================================");
               break;
            }
            default :
            {
                System.out.println("=================================");
                System.out.println("Anda Memasukkan Input yang salah");
                System.out.println("=================================");
            }
            
        }
    }
    
}
