package KTM_Komuter;

public class SalesKTM_Komuter {
    // Harga Seunit
    public double hargatrain = 23.20;

    // Harga Diskaun
    public double diskaun = (hargatrain * 0.1);
    
    // Pulangan harga akhir
    double hargaAkhir = 0;

    // Kiraan harga akhir tiket
    public double kirabayaran(int kuantiti, double jarak) {
        hargaAkhir = ((hargatrain - diskaun) * kuantiti * jarak);

        return hargaAkhir;
    }
}
