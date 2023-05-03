package jomlatihan;

public class Penginapan {
    double harga = 0;

    public double kiraHargaMenginap(int bilhari, int bilbilik) {
        harga = (bilhari * bilbilik * 110.00);

        return harga;
    }
}
