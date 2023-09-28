package day11_whileLoop_dowhileLoop;

import java.util.Scanner;

public class C09_DoWhilleLoop {

    public static void main(String[] args) {

        // kullanıcıdan toplanmak üzere sayılar isteyin
        // kullanıcı 0'a basıncaya kadar işlemi tekrar ettirin
        // kullannıcı 0'a bastıgında girilen sayıların toplamını yazdırın

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi = 0;

        do {
            System.out.println("Lütfen toplanmak üzere bir sayi giriniz\nİşlemi bitirmek için 0'a basın");
            sayi = scanner.nextInt();

            toplam += sayi;
        } while (sayi != 0);

        System.out.println("Girilen sayıların toplamı : " + toplam);

    }
}
