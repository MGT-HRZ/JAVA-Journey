package Loop_statement;

// Tajuk : Loop Statement

public class Loop_For_While_DoWhile3 {
    public static void main(String args[])
    {
        for (int i = 1; i <= 40; i++){
            if (i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        
        System.out.println("\n");
        
        int y = 1;
        
        while (y <= 40){
            
            if (y % 5 == 0){
                System.out.print(y + ", ");
            }
            y++;
        }
        
        System.out.println("\n");
        
        int z = 1;
        
        do {
           if (z % 5 == 0){
                System.out.print(z + ", ");
           }
            z++; 
        }
        
        while (z <= 40);
    }
}
