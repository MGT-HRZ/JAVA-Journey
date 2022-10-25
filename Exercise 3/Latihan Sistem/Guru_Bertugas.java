package dka1213amalik2;

// Tajuk : Projek Sistem Paparan Guru Bertugas

import java.util.Scanner; // Panggil fungsi memasukkan input
public class Guru_Bertugas {
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        int nombor; // pengisytiharan pemboleh ubah
        // fungsi arrays 1 dimensi
        String nama[] ={"nur wawa aina binti mustaqim", "mohd akmal bin mahmud", "wan zack haikal bin wan noor", "nurul farah izzurin binti azhar"};
        String tarikh[] ={"29/6/2022 SEHINGGA 2/7/2022", "3/7//2022 SEHINGGA 7/7/2022", "12/7/2022 SEHINGGA 16/7/2022", "19/7/2022 SEHINGGA 23/7/2022"};
        String phone[] ={"        017-8981256", "       011-28691256", "     019-32239087", "      014-42289762"};
        String tempat[] ={"SIBEZ 2", "SIBEZ 4", "BILIK PENSYARAH", "BILIK MULTIMEDIA"};
        
        // struktur kawalan ulangan
        do{
            System.out.println("\n====--JADUAL PENSYARAH BERTUGAS 2022--====\n");
            System.out.println("1.\tMINGGU PERTAMA");
            System.out.println("2.\tMINGGU KEDUA");
            System.out.println("3.\tMINGGU KETIGA");
            System.out.println("4.\tMINGGU KEEMPAT");
            System.out.println("0.\tKELUAR SISTEM");
        
            System.out.print("\nPilih (1, 2, 3, 4 ATAU 0) : ");
            nombor = input.nextInt();
        
        // struktur kawalan pilihan
        switch(nombor)
        {
            case 1 :  {
                    line ();
                    System.out.println("PENSYARAH BERTUGAS MINGGU PERTAMA = " +nama[0].toUpperCase()); // menggunakan string manipulation (uppercase)
                    line ();
                    System.out.println();
                    bunga();
                    System.out.println("TARIKH PENSYARAH BERTUGAS = " +tarikh[0].toLowerCase()); // menggunakan string manipulation (lowercase)
                    bunga();
                    System.out.println();
                    tel();
                    System.out.println("NOMBOR TELEFON UNTUK DIHUBUNGI = " +phone[0].trim()); // // menggunakan string manipulation (trim)
                    tel();
                    System.out.println();
                    loc();
                    System.out.println("LOKASI YANG BOLEH PELAJAR CARI = " +tempat[0].replace('Z', 'R')); // menggunakan string manipulation (replace)
                    loc();
                    System.out.println();
                    corak();
                    tugas();
                    corak();
                    break;
                    }
            case 2 :  {
                    line ();
                    System.out.println("PENSYARAH BERTUGAS MINGGU KEDUA = " +nama[1].toUpperCase());
                    line ();
                    System.out.println();
                    bunga();
                    System.out.println("TARIKH PENSYARAH BERTUGAS = " +tarikh[1].toLowerCase());
                    bunga();
                    System.out.println();
                    tel();
                    System.out.println("NOMBOR TELEFON UNTUK DIHUBUNGI = " +phone[1].trim());
                    tel();
                    System.out.println();
                    loc();
                    System.out.println("LOKASI YANG BOLEH PELAJAR CARI = " +tempat[1].replace('Z', 'R'));
                    loc();
                    System.out.println();
                    corak();
                    tugas();
                    corak();
                    break;
                    }
            case 3 :  {
                    line ();
                    System.out.println("PENSYARAH BERTUGAS MINGGU KETIGA = " +nama[2].toUpperCase());
                    line ();
                    System.out.println();
                    bunga();
                    System.out.println("TARIKH PENSYARAH BERTUGAS = " +tarikh[2].toLowerCase());
                    bunga();
                    System.out.println();
                    tel();
                    System.out.println("NOMBOR TELEFON UNTUK DIHUBUNGI = " +phone[2].trim());
                    tel();
                    System.out.println();
                    loc();
                    System.out.println("LOKASI YANG BOLEH PELAJAR CARI = " +tempat[2].replace('Z', 'R'));
                    loc();
                    System.out.println();
                    corak();
                    tugas();
                    corak();
                    break;
                    }
            case 4 :  {
                    line ();
                    System.out.println("PENSYARAH BERTUGAS MINGGU KEEMPAT = " +nama[3].toUpperCase());
                    line ();
                    System.out.println();
                    bunga();
                    System.out.println("TARIKH PENSYARAH BERTUGAS = " +tarikh[3].toLowerCase());
                    bunga();
                    System.out.println();
                    tel();
                    System.out.println("NOMBOR TELEFON UNTUK DIHUBUNGI = " +phone[3].trim());
                    tel();
                    System.out.println();
                    loc();
                    System.out.println("LOKASI YANG BOLEH PELAJAR CARI = " +tempat[3].replace('Z', 'R'));
                    loc();
                    System.out.println();
                    corak();
                    tugas();
                    corak();
                    break;
                    }
            default : {
                System.out.println("\n=====================================");
                System.out.println("Terima Kasih menggunakan sistem ini");
                System.out.println("=====================================");
                }
            }
        }
        while(nombor!=0);
        
        
    }//psvm
    //pengisytiharan method
     static void line (){
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
     }
     
     static void bunga (){
         System.out.println("❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁❁");
     }
     
     static void tel (){
         System.out.println("✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆✆");
     }
     
     static void loc (){
         System.out.println("♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡♡");
     }
     
     static void corak(){
         System.out.println("😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊😊");
     }
     
     static void tugas (){
         System.out.println("TUGAS PENSYARAH BERTUGAS:\n"+"1. Menguruskan rawatan pelajar yang sakit. \n" +
                            "\n" +  "2. Menhawasi disiplin pelajar diluar masa pembelajaran.\n" + "\n" +
                            "3. Mengawasi kebersihan kawasan sekeliling kolej.\n" + " \n" +
                            "4. Mencatat aktiviti penting yang melibatkan pelajar kolej. \n" + "\n" +
                            "5. Mengawasi pergerakan pergi dan balik pelajar. ");
     }
}
