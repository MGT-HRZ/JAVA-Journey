package Empurau;

public class HargaEmpurau {
    public double hargaikan = 550;
    public double diskaun = (hargaikan * 0.3);
    double hargabayaran = 0;
    
    public double kirabayaran(int kuantiti) {
        hargabayaran = ((hargaikan - diskaun) * kuantiti);

        return hargabayaran;
    }
}
