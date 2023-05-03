package FoodBear;

public class JumlahFood {
    NasiAyamFood NA = new NasiAyamFood();
    NasiTomatoFood NT = new NasiTomatoFood();
    NasiAyamPenyetFood NAP = new NasiAyamPenyetFood();

    double nasiAyam = 0;
    double nasiTomato = 0;
    double nasiAyamPenyet = 0;
    double caj = 8.50;
    double jumlah = 0;

    public void JumlahFood(int kuantiti, int nasi1, int nasi2, int nasi3) {

        nasiAyam = NA.kira(nasi1);
        nasiTomato = NT.kira(nasi2);
        nasiAyamPenyet = NAP.kira(nasi3);
        jumlah = (nasiAyam + nasiTomato + nasiAyamPenyet + caj);

        System.out.println("<<< FOOD BEAR >>>");
        System.out.println("Nasi Ayam RM 6.00 x " + nasi1 + " : RM " + nasiAyam);
        System.out.println("Nasi Tomato RM 6.50 x " + nasi2 + " : RM " + nasiTomato);
        System.out.println("Nasi Ayam Penyet RM 7.00 x " + nasi3 + " : RM " + nasiAyamPenyet);
        System.out.println("Caj Penghantaran : RM " + caj);
        System.out.println("JUMLAH : RM " + jumlah);

    }
}






