import java.util.Scanner;
public class addfor {
    public static void main(String[] args)
    {
        int e, num, total = 0;
        Scanner add = new Scanner (System.in);
        
        for (e = 1; e <= 5; e++)
        {
            System.out.print("Nombor "+e+ ":");
            num = add.nextInt();
            total = total + num;
        }
        System.out.println("Jumlah : "+ total);
    } 
}
