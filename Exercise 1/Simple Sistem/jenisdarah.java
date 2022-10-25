import java.util.Scanner;
public class jenisdarah {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Anda : ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan Umur Anda : ");
        int umur = input.nextInt();
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Apakah Jenis Darah Anda A, B, AB, O : ");
        String darah = scan.nextLine();
        
        switch(darah)
        {
            case "A" : {
               System.out.println("\nNama Anda : "+nama);
               System.out.println("Umur Anda : "+umur);
               System.out.println("Jenis Darah : "+darah);
               System.out.println("=================================================");
               System.out.println("Anda boleh menderma kepada darah A dan AB");
               System.out.println("=================================================");
               break;
            }
            
            case "B" : {
               System.out.println("\nNama Anda : "+nama);
               System.out.println("Umur Anda : "+umur);
               System.out.println("Jenis Darah : "+darah);
               System.out.println("=================================================");
               System.out.println("Anda boleh menderma kepada darah B dan AB");
               System.out.println("=================================================");
               break;
            }
            
            case "AB" : {
               System.out.println("\nNama Anda : "+nama);
               System.out.println("Umur Anda : "+umur);
               System.out.println("Jenis Darah : "+darah);
               System.out.println("==================================================");
               System.out.println("Anda boleh menderma kepada darah AB sahaja");
               System.out.println("==================================================");
               break;
            }
            
            case "O" : {
               System.out.println("\nNama Anda : "+nama);
               System.out.println("Umur Anda : "+umur);
               System.out.println("Jenis Darah : "+darah);
               System.out.println("==================================================");
               System.out.println("Anda boleh menderma kepada darah A, B dan AB");
               System.out.println("==================================================");
               break;
            }
            
            default : {
                System.out.println("=================================");
                System.out.println("Anda Memasukkan Input yang salah");
                System.out.println("=================================");
            }
        }
    }
}
