import java.util.Scanner;
public class lthndowhile {
    public static void main(String[] args)
    { 
        int bil = 1;
        int nombor, jumlah = 0;
        Scanner list = new Scanner(System.in);
        
        do
        {
            System.out.print("Nombor "+bil+ ":");
            bil++;
            nombor = list.nextInt();
            jumlah = jumlah + nombor;   
        }
        while(bil <= 5);
        System.out.println("Jumlah : "+ jumlah);
    }
}
