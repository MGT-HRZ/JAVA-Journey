package Array;

public class Latihan_array15 {
    public static void main(String args[])
    {
        double income[][] = {{2678.30, 6789.20},
                             {4578.20, 6789.10},
                             {2000.0, 1222.80}};
        
        System.out.println("Ibu\tBapa");
        
        for(int r = 0; r < 3; r++){              
            for(int c = 0; c < 2; c++){
                System.out.print(income[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
