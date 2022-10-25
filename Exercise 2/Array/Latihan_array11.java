package Array;

public class Latihan_array11 {
    public static void main(String args[])
    {
        String nama[][] = {{"Ami", "Abu"},
                           {"Ali", "Tan"}};
        
        System.out.println(nama[1][1]);
        
        char word[][] = {{'a', 'b', 'c', 'd'},
                         {'e', 'f', 'g', 'h'}};
        
        System.out.println(word[1][1]);
        
        for (int r = 0; r < 2; r++){
            for (int c = 0; c < 4; c++){
                System.out.print(word[r][c] + " ");
            }
            System.out.println();
        }
        
        
    }
}
