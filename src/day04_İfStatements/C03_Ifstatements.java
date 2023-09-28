package day04_İfStatements;

import java.util.Scanner;

public class C03_Ifstatements {
    public static void main(String[] args) {

        // soru 5- kullanıcıdan notunu alın 50 veya daha butukse "sınıfı geçtin"
        //         50'den kucukse "maalesef kaldın" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen notunuzu giriniz");

        double not = scanner.nextDouble();

        if (not >= 50) {
            System.out.println("sınıfı geçtin");
        }

        if (not < 50) {
            System.out.println("maalesef kaldın");
        }

        if (not >= 50) {
            System.out.println("sınıfı geçtin");
        } else {
            System.out.println("maalesef kaldın");
        }

    }

}



