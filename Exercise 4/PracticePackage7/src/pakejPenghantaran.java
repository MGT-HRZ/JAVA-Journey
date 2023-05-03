import java.util.InputMismatchException;
import java.util.Scanner;

import FoodBear.JumlahFood;
import KerangMove.JumlahKerang;
import TangkapFood.JumlahTangkap;

public class pakejPenghantaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        JumlahFood bearfood = new JumlahFood();
        JumlahKerang kerangmove = new JumlahKerang();
        JumlahTangkap tangkapfood = new JumlahTangkap();

        int x = 0;

        do {
            System.out.println("== RESTORAN NUR KASIH ==");

            brake();

            try {
                System.out.print("Masukkan Bilangan Tempahan : ");
                int bil = input.nextInt();

                System.out.print("1. Bilangan Nasi Ayam: ");
                int ayam = input.nextInt();

                System.out.print("2. Bilangan Nasi Tomato: ");
                int tomato = input.nextInt();

                System.out.print("3. Bilangan Nasi Penyet: ");
                int penyet = input.nextInt();

                brake();

                System.out.println("== JUMLAH PESANAN MAKANAN BERSERTA CAJ PENGHANTARAN ==");

                brake();

                bearfood.JumlahFood(bil, ayam, tomato, penyet);

                brake();

                kerangmove.JumlahKerang(bil, ayam, tomato, penyet);

                brake();

                tangkapfood.JumlahTangkap(bil, ayam, tomato, penyet);

                x++;
            }

            catch (InputMismatchException e) {
                System.out.println("\nRalat input. Sila masukkan bilangan yang betul.");
                input.nextLine();
                brake();

            }
        }

        while (x == 0);

    }

    public static void brake() {
        System.out.println("");
    }
    
}