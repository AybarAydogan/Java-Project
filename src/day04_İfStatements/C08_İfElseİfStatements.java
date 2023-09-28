package day04_İfStatements;

import java.util.Scanner;

public class C08_İfElseİfStatements {
    public static void main(String[] args) {


        // öğrenciden notu alıp geçtin veya kaldın yazdıralım
        // öğrenci 0'dan küçük veya 100'den büyük bir not girerse
        // "geçersiz not" yazdıralım

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not > 100 || not <0 ) {
            System.out.println("geçersiz not");
        } else if (not>=50) {
            System.out.println("sınıfı geçtin");
        }else {
            System.out.println("maalesef kaldın");
        }


    }
}
