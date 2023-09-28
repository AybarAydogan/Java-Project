package day08_stringManipulations;

import java.util.Scanner;

public class C04_replaceAll {

    public static void main(String[] args) {

        // kullanıcıdan isim soyisim ve kart numarasını alıp
        // aşagıdaki şekilde yazdırın
        // İsim soyisim : A**** A******
        // Kart NO : 1234 **** **** ****

        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim = scanner.next();

        System.out.println("Soyisminizi giriniz");
        String soyisim = scanner.next();

        System.out.println("Kart numaranızı giriniz");
        String KartNo = scanner.next();

        String yildizliIsim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).replaceAll("\\w","*");
        String yildizliSoyisim = soyisim.substring(0,1).toUpperCase();
                soyisim.substring(1).replaceAll("\\w","*");
        String yildizliKartNo = KartNo.substring(0,4)+ " **** **** ****";
        System.out.println("Isim soyisim : " + yildizliIsim + " " + yildizliSoyisim);
        System.out.println("Kart No : " + yildizliKartNo);
    }
}