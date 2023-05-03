package Siakap;

public class HargaSiakap {
    public double hargaikan = 32.5;
    public double diskaun = (hargaikan * 0.1);
    double hargabayaran = 0;
    
    public double kirabayaran(int kuantiti) {
        hargabayaran = ((hargaikan - diskaun) * kuantiti);

        return hargabayaran;
    }
}
