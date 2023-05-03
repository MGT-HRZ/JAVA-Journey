package elatihan;

public class Penginapan {
    double harga = 0;

    public double kiraHargaMenginap(int bilhari, int bilbilik) {
        harga = (bilhari * bilbilik * 100.00);

        return harga;
    }
}
