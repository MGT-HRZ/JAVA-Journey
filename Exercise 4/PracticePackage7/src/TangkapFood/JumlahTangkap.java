package TangkapFood;

public class JumlahTangkap {
    NasiAyamTangkap NA = new NasiAyamTangkap();
    NasiTomatoTangkap NT = new NasiTomatoTangkap();
    NasiAyamPenyetTangkap NAP = new NasiAyamPenyetTangkap();

    double nasiAyam = 0;
    double nasiTomato = 0;
    double nasiAyamPenyet = 0;
    double caj = 9.00;
    double jumlah = 0;

    public void JumlahTangkap(int kuantiti, int nasi1, int nasi2, int nasi3) {

        nasiAyam = NA.kira(nasi1);
        nasiTomato = NT.kira(nasi2);
        nasiAyamPenyet = NAP.kira(nasi3);
        jumlah = (nasiAyam + nasiTomato + nasiAyamPenyet + caj);

        System.out.println("<<< Tangkap Food >>>");
        System.out.println("Nasi Ayam RM 6.00 x " + nasi1 + " : RM " + nasiAyam);
        System.out.println("Nasi Tomato RM 6.50 x " + nasi2 + " : RM " + nasiTomato);
        System.out.println("Nasi Ayam Penyet RM 7.00 x " + nasi3 + " : RM " + nasiAyamPenyet);
        System.out.println("Caj Penghantaran : RM " + caj);
        System.out.println("JUMLAH : RM " + jumlah);

    }
}
