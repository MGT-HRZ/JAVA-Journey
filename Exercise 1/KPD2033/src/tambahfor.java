public class tambahfor {
    public static void main(String[] args)
    {
        int bil;
        double jumlah = 1000;
        
        for(bil = 1; bil <= 12; bil++)
        {
            jumlah = jumlah + 150;
        }
        
        System.out.println("Jumlah Baki selepas 12 bulan ialah : " + jumlah);
    }
}
