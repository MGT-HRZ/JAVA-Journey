import java.util.Scanner;
public class pos {
    public static void main (String[] args)
    {
        System.out.println("PILIHAN PERKHIDMATAN");
        System.out.println("1\tPEMBELIAN SETEM");
        System.out.println("2\tPEMBELIAN SAMPUL POS");
        System.out.println("3\tPEMBAYARAN BIL");
        
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Pilihan Perkhidmatan 1 / 2 / 3 : ");
        int select = input.nextInt();
        
        switch (select)
        {
            case 1 : {
               System.out.println("\nPILIHAN PERKHIDMATAN : BELI SETEM");
               System.out.print("MASUKKAN BILANGAN SETEM YANG INGIN DIBELI : ");
               int BIL1 = input.nextInt();
               System.out.println("HARGA SETEM YANG INGIN DIBELI : RM 0.50");
               System.out.println("=================================");
               System.out.println("JUMLAH PERLU DIBAYAR : RM "+(BIL1 * 0.5));
               System.out.println("=================================");
               break; 
            }
            case 2 : {
               System.out.println("\nPILIHAN PERKHIDMATAN : BELI SAMPUL POS");
               System.out.print("MASUKKAN BILANGAN SAMPUL YANG INGIN DIBELI : ");
               double BIL2 = input.nextDouble();
               System.out.print("SAIZ SAMPUL YANG INGIN DIBELI 1 / 2 : ");
               int saiz = input.nextInt();
               
               if(saiz == 1){
                   System.out.println("Harga Sampul adalah RM 5.00");
                   System.out.println("=================================");
                   System.out.println("JUMLAH PERLU DIBAYAR : RM "+(BIL2 * 5));
                   System.out.println("=================================");
               }
               else if(saiz == 2){
                   System.out.println("Harga Sampul adalah RM 2.80");
                   System.out.println("=================================");
                   System.out.println("JUMLAH PERLU DIBAYAR : RM "+(BIL2 * 2.8));
                   System.out.println("=================================");
               }
               else if(saiz > 2){
                   System.out.println("=================================");
                   System.out.println("Tiada Saiz Dalam Data");
                   System.out.println("=================================");
               }
               break; 
            }
            case 3 : {
               System.out.println("\nPILIHAN PERKHIDMATAN : PENBAYARAN BIL");
               System.out.print("MASUKKAN JUMLAH BIL YANG INGIN DIBAYAR : RM  ");
               double bill = input.nextDouble();
               System.out.println("=================================");
               System.out.println("JUMLAH PERLU DIBAYAR : RM "+bill);
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
