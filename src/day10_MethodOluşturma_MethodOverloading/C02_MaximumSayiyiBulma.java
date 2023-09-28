package day10_MethodOluşturma_MethodOverloading;

import java.util.Scanner;

public class C02_MaximumSayiyiBulma {

    public static void main(String[] args) {

        // kullanıcıdan method içerisinde 3 sayı alıp
        // bu 3 sayıdan en büyük olanı yazdıran bir method oluşturun

    }

    public static void enBuyukSayiyiYazdir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("En büyük sayıyı bulmak için , 3 adet sayı giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();
        double sayi3 = scanner.nextDouble();

        if (sayi1 > sayi2 && sayi1 > sayi3) System.out.println("En büyük sayı : " + sayi1);
        else if (sayi2 > sayi1 && sayi2 > sayi3) System.out.println("En büyük sayı : " + sayi2);
        else if (sayi3 > sayi1 && sayi3 > sayi2) System.out.println("En buyuk sayi : " + sayi3);
        else System.out.println("En buyuk sayiyi bulamadim");


    }


}
