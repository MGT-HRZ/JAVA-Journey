package Loop_statement;

// Tajuk : Loop Statement

public class Loop_For_While_DoWhile1 {
    public static void main(String args[])
    {
        for (int i = 2; i <= 10; i+=2){
            System.out.print(i + ", ");
        }
        
        System.out.println("\n");
        
        int y = 2;
        
        while (y <= 10){
            System.out.print(y + ", ");
            y+=2;
        }
        
        System.out.println("\n");
        
        int z = 2;
        
        do {
           System.out.print(z + ", ");
           z+=2; 
        }
        
        while (z <= 10);
    }
}
