package Array;

public class Latihan_array14 {
    public static void main(String agrs[])
    {
        double harga[][] = {{45.90, 50.77, 45.20},
                            {55.40, 34.78, 54.80},
                            {67.80, 67.90, 31.20}};
        
        for(int i = 0; i < 3; i++){
            System.out.print("Harga "+ (i + 1) + "\t");
        }
        
        System.out.println();
        
        for(int r = 0; r < 3; r++){                
            for(int c = 0; c < 3; c++){
                System.out.print(harga[r][c] + "\t");
            }
            System.out.println();
        }
    }
}
