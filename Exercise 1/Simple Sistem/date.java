import java.util.Scanner;
public class date {
    public static void main(String[] args)
    {
        Scanner date = new Scanner (System.in);
        System.out.print("Masukkan Hari :");
        int hari = date.nextInt();
        System.out.print("Masukkan Bulan :");
        int bulan = date.nextInt();
        System.out.print("Masukkan Tahun :");
        int tahun = date.nextInt();
        
        switch (bulan)
        {
            case 1 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" JANUARI "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 2 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" FEBRUARI "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 3 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" MAC "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 4 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" APRIL "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 5 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" MEI "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 6 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" JUN "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 7 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" JULAI "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 8 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" OGOS "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 9 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" SEPTEMBER "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 10 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" OKTOBER "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 11 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" NOVEMBER "+tahun);
                        System.out.println("================================");
                        break;
            }
            case 12 : {
                        System.out.println("================================");   
                        System.out.println(+hari+" DISEMBER "+tahun);
                        System.out.println("================================");
                        break;
            }
            default :{
                        System.out.println("==================================");   
                        System.out.println("INPUT YANG DIMASUKKAN ADALAH SALAH");
                        System.out.println("==================================");
            }
        }
    }
}
