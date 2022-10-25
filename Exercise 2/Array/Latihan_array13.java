package Array;

public class Latihan_array13 {
    public static void main(String args[])
    {  
        double pngk[][] = {{3.1, 3.4}, 
                           {3.4, 2.7}, 
                           {4.0, 3.9}};
        
        System.out.print("\t" + " Sem1  Sem2");
        
        System.out.println();
        
        for (int r = 0; r < 3; r++){
            System.out.print("Student" + (r + 1));
            for (int c = 0; c < 2; c++){
                System.out.print(" " + pngk[r][c] + " " + " ");
            }
            System.out.println();
        }
        
        
    }
}
