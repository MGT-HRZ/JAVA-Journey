package biztrainning;

public class PenyediaanMakanan {
    double harga = 0;

    public double kiraHargaMakanan(int bilhari, int bilpeserta, int bilmakanan) {
        harga = (bilhari * bilpeserta * bilmakanan * 5.00);

        return harga;
    }
}
