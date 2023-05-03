package jomlatihan;

public class PenyediaanMakanan {
    double harga = 0;

    public double kiraHargaMakanan(int bilhari, int bilpeserta, int bilmakanan) {
        harga = (bilhari * bilpeserta * bilmakanan * 6.50);

        return harga;
    }
}
