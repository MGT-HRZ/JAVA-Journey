package Method;

// Nama : Megat Harez Iskandar Bin Megat Muhammed Firuz
// Tarikh : 16/8/2022
// Tajuk : Latihan Method

public class Method_3 {
    public static void main (String args[])
    {
        method1(); 
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
    }
    
    static void method1()
    {
        System.out.println("\n**********************************************************");
        System.out.println("Kebahagian yang sejati tidak pernah kelihatan oleh mata,");
        System.out.println("Kerana kebahagian sejati itu terletak pada jiwa");
        System.out.println("**********************************************************");
    }
    
    static void method2()
    {
        System.out.println("\n##########################################################");
        System.out.println("Jauhilah sifat hasad,");
        System.out.println("kerana sifat hasad itu memakan kebaikan");
        System.out.println("seperti kayu kering dimakan api");
        System.out.println("##########################################################");
    }
    
    static void method3()
    {
        double t1 = 6.5;
        
        double t2 = 5.5;
        
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Tapak = " + t1);
        System.out.println("Tinggi = " + t2);
        System.out.println("Luas segitiga = " + (0.5 * t1 * t2));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    
    static void method4()
    {
        double t = 98.0;
        double c = (5.0 / 9.0) * (t - 32);
        System.out.println("\nSuhu (F) = " + t);
        System.out.println("Suhu (C) = " + c);
    }
    
    static void method5()
    {
        int p = 12;
        
        int l = 5;
        
        System.out.println("\n**********************************************************");
        System.out.println("Tapak = " + p);
        System.out.println("Tinggi = " + l);
        System.out.println("\nHasil perimeter bagi segiempat sama ialah = " + ((p + p) + (l + l)));
        System.out.println("**********************************************************");
    }
    
    static void method6()
    {
        double j = 7.4;
        
        System.out.println("\n**********************************************************");
        System.out.println("Jejari = " + j);
        System.out.println("\nLuas Bulatan = " + (3.142 * j * j));
        System.out.println("**********************************************************");
    }
    
    static void method7()
    {
        int nom1 = 10;
        
        int nom2 = 17;
        
        if(nom1 > nom2){
            System.out.println("\n" + nom1 + " lebih besar daripada " + nom2);
        }
        
        else {
            System.out.println("\n" + nom1 + " lebih kecil daripada " + nom2);
        }
    }
}
