package day11_whileLoop_dowhileLoop;

import java.util.Scanner;

public class C07_WhileLoop {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        //         While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran
        //         bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen üs hesaplamak istediğiniz pozitif tam sayıyı giriniz ");
        int sayi = scanner.nextInt();

        System.out.println("Lütfen hesaplanacak üs değerini pozitif tamsayı olarak giriniz");
        int us = scanner.nextInt();

        usHesapla(sayi, us);
    }


    public static void usHesapla(int sayi, int us) {

        // sayi 3 üs 5 olsa 3 * 3 * 3 * 3 * 3
        int sonuc = 1;
        int geciciUs = us;
        while (us > 0) {
            sonuc *= sayi;
            us--;
            geciciUs--;


        }

        System.out.println(sayi + " üzeri " + us +" : " + sonuc );
    }
}
