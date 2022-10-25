import java.util.Scanner;
public class Membaca {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Siapakah nama anda ? :");
        String nama = scan.nextLine();
        
        System.out.print("Berapakah umur anda ? :");
        int umur = scan.nextInt();
        
        System.out.print("Apakah nombor kegemaran anda ? :");
        int nomborkegemaran = scan.nextInt();
        
        System.out.println("-----------------------------------------");
        System.out.println("Siapakah nama anda ? :" +nama);
        System.out.println("Berapakah umur anda ? :" +umur);
        System.out.println("Apakah nombor kegemaran anda ? :" +nomborkegemaran);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Adakah anda suka membaca atau tidak ? :");
        String x = input.nextLine();
        if (x.equalsIgnoreCase("ya")){System.out.println("<Anda suka membaca>");}
        else if (x.equalsIgnoreCase("tidak")){System.out.println("<Anda tidak suka membaca>");}
    }
}
