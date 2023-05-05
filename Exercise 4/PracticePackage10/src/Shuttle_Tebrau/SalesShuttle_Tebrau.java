package Shuttle_Tebrau;

public class SalesShuttle_Tebrau {
    // Harga Seunit
    public double hargatrain = 10.00;

    // Harga Diskaun
    public double diskaun = (hargatrain * 0.5);
    
    // Pulangan harga akhir
    double hargaAkhir = 0;

    // Kiraan harga akhir tiket
    public double kirabayaran(int kuantiti, double jarak) {
        hargaAkhir = ((hargatrain - diskaun) * kuantiti * jarak);

        return hargaAkhir;
    }
}
