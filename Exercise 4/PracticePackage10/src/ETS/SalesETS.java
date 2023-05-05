package ETS;

public class SalesETS {
    // Harga Seunit
    public double hargatrain = 37.40;

    // Harga Diskaun
    public double diskaun = (hargatrain * 0.15);
    
    // Pulangan harga akhir
    double hargaAkhir = 0;

    // Kiraan harga akhir tiket
    public double kirabayaran(int kuantiti, double jarak) {
        hargaAkhir = ((hargatrain - diskaun) * kuantiti * jarak);

        return hargaAkhir;
    }
}
