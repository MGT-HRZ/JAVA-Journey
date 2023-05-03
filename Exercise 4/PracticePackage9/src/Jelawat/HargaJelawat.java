package Jelawat;

public class HargaJelawat {
    public double hargaikan = 300;
    public double diskaun = (hargaikan * 0.2);
    double hargabayaran = 0;
    
    public double kirabayaran(int kuantiti) {
        hargabayaran = ((hargaikan - diskaun) * kuantiti);

        return hargabayaran;
    }
}
