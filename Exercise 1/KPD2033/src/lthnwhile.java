import java.util.Scanner;
public class lthnwhile {
    public static void main(String[] args)
    {
        int bil = 1;
        int nombor, jumlah = 0;
        Scanner input = new Scanner(System.in);
        
        while (bil <= 5)
        {
            System.out.print("Nombor "+bil+ ":");
            bil++;
            nombor = input.nextInt();
            jumlah = jumlah + nombor;
        }
        System.out.println("Jumlah : "+ jumlah);
    }
}
