package Method;

public class Method_1 {
    public static void main(String args[])
    {
        int nom1 = 5;
        
        int nom2 = 5;
        
        int hasil1, hasil2, hasil3, hasil4;
        
        hasil1 = tambah(nom1, nom2);
        
        hasil2 = tolak(nom1, nom2);
        
        hasil3 = darab(nom1, nom2);
        
        hasil4 = bahagi(nom1, nom2);
        
        System.out.println("Hasil Tambah : " + hasil1);
        
        System.out.println("Hasil Tolak : " + hasil2);
        
        System.out.println("Hasil Darab : " + hasil3);
        
        System.out.println("Hasil Bahagi : " + hasil4);
    }
    
    static int tambah(int nom1, int nom2)
    {
        int ops = nom1 + nom2;
        return ops;
    }
    
    static int tolak(int nom1, int nom2)
    {
        int ops = nom1 - nom2;
        return ops;
    }
    
   static int darab(int nom1, int nom2)
    {
        int ops = nom1 * nom2;
        return ops;
    }
    
    static int bahagi(int nom1, int nom2)
    {
        int ops = nom1 / nom2;
        return ops;
    }
}
