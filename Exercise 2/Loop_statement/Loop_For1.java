package Loop_statement;

// Tajuk : Loop Statement

public class Loop_For1 {
    public static void main(String args[])
    {
        for (int i = 1; i <= 5; i++){
            System.out.print(i + ", ");
        }
        
        System.out.print("\n\n");
        
        for (int e = 10; e > 5; e--){
            System.out.print(e + ", ");
        }
        
        System.out.print("\n\n");
        
        for (int y = 1; y <= 25; y++){

            if(y % 5 == 0){
               System.out.println(y); 
            }
        }
        
    }
}
