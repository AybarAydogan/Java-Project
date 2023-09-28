package day02_scanner_DataCasting;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        // soru 4- kullanıcıdan bir dikdörtgenin 2 kenar uzunluğunu alıp,
        // dikdörtgenin alanını yazdırın

        Scanner scanner = new  Scanner(System.in);
        System.out.println("lütfen dikdiörtgenin kenar uzunluklarını giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("dikdörtgenin alanı : " + kenar1*kenar2);

    }
}
