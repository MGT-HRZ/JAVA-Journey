package jomlatihan;

public class JumlahJomtrainning {
    DewanSeminar DS = new DewanSeminar();
    PenyediaanMakanan PM = new PenyediaanMakanan();
    Penginapan PI = new Penginapan();

    double hargadewanseminar = 0;
    double hargamakanan = 0;
    double hargabilik = 0;
    double deposit = 0;
    double jumlah = 0;

    public void jumlahjomtrainning(int bilhari, int bilpeserta, int bilmakanan, int bilbilik) {
        hargadewanseminar = DS.kiraHargaDewan(bilhari);
        hargamakanan = PM.kiraHargaMakanan(bilhari, bilpeserta, bilmakanan);
        hargabilik = PI.kiraHargaMenginap(bilhari, bilbilik);

        deposit = ((hargadewanseminar + hargamakanan + hargabilik) * 0.2);

        jumlah = (hargadewanseminar + hargamakanan + hargabilik + deposit);

        System.out.println("=== JOMTRAINNING ===");
        System.out.println("Penggunaan Dewan Seminar :" + bilhari + " hari x RM3700.0= RM" + hargadewanseminar);
        System.out.println("Penyediaan Makanan RM6.50 x " + bilhari + " hari x " + bilpeserta + " peserta x " + bilmakanan + "kali makan perhari= RM" + hargamakanan);
        System.out.println("Penginapan RM110.0 x " + bilhari + " hari x " + bilbilik + " buah bilik = RM" + hargabilik);
        System.out.println("Deposit :RM" + deposit);
        System.out.println("Jumlah Bayaran :RM" + jumlah);
    }
}
