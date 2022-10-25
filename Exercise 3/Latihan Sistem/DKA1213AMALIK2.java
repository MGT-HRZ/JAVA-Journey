package dka1213amalik2;

public class DKA1213AMALIK2 {
    public static double back;
    public static void main(String[] args)
    {
        line1();
        line2();
        
        double markah1 = 78.0;
        double markah2 = 88.0;
        double markah3 = 56.0;
        
        System.out.println("Markah subjek Programming = " + markah1);
        
        System.out.println("Markah subjek Database = " + markah2);
        
        System.out.println("Markah subjek System Design Interface = " + markah3);
        
        tambah(markah1, markah2, markah3);
        
        purata(markah1, markah2, markah3);
        
        line2();
        line1();
    }
    
    static double tambah(double markah1, double markah2, double markah3)
    {
        System.out.println("Jumlah Markah Keseluruhan Bagi Tiga Subjek = " + (markah1 + markah2 + markah3));
        return back;
    }
    
    static double purata(double markah1, double markah2, double markah3)
    {
        System.out.println("Purata Markah = " + ((markah1 + markah2 + markah3)/3));
        return back;
    }
    
    static void line1()
    {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    static void line2()
    {
        System.out.println("---------------------------------------------------------------------------");
    }
    
}
