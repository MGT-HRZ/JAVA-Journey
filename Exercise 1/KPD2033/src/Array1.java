public class Array1 {
   public static void main(String[] args) 
   {
        String[] kelas ={"1 KPD","2 KPD","1 DKA 1","1 DKA 2"};
        String[] blok ={"ANGGERIK","CEMPAKA\t","ANGGERIK","BUNGA RAYA"};
        int[] aras = {1,2,1,3};
       
       System.out.println("KELAS\t BLOK \t\tARAS");
       for(int i=0; i<4; i++)
       {
           System.out.print(kelas[i]);
           System.out.print("\t " +blok[i] +"\t");
           System.out.println(aras[i]);
       }
       
   }
}
