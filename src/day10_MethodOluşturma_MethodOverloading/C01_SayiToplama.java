package day10_MethodOluşturma_MethodOverloading;

import java.util.Scanner;

public class C01_SayiToplama {

    public static void main(String[] args) {

        // verilen iki sayıyı toplayıp sonuçu yazdıran bir method oluşturun

        toplaYazdir(5, 6.4); // Verilen iki sayının toplamı : 11.4
        toplaYazdir(7, 6); // Verilen iki sayının toplamı : 13.0

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen toplanmak üzere iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


    } // main öethod sonu


    public static void toplaYazdir(double sayi1, double sayi2) {

        System.out.println("Verilen iki sayının toplamı : " + (sayi1 + sayi2));
    }


}// class sonu
