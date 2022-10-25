package Loop_statement;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 7/8/2022
// Tajuk : Loop Statement

public class Loop_For_While_DoWhile2 {
    public static void main(String args[])
    {
        for (int i = 5; i >= 1; i--){
            System.out.print(i + ", ");
        }
        
        System.out.println("\n");
        
        int y = 5;
        
        while (y >= 1){
            System.out.print(y + ", ");
            y--;
        }
        
        System.out.println("\n");
        
        int z = 5;
        
        do {
           System.out.print(z + ", ");
           z--; 
        }
        
        while (z >= 1);
    }
}
