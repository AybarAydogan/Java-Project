package day11_whileLoop_dowhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

    public static void main(String[] args) {

        // kullanıcıdan toplanmak üzere sayılar isteyin
        // kullanıcı 0'a basıncaya kadar işlemi tekrar ettirin
        // kullannıcı 0'a bastıgında girilen sayıların toplamını yazdırın

        // domgunun kaç kere çalışacağı belli olmayan işlemlerden while loop tercih edilir

        Scanner scanner = new Scanner(System.in);
        double sayi = 44;
        double toplam = 0;

      /*
      Kullanıcıdan alacağımız sayı 0 olmadığı sürece kod çalışıcak
      loop'dan önce bu sayıyı oluşturmamız gerekir ki
      while() içinde kullanabilelim

      NOT: ilk değer ataması yaparken
           loop'un ilk çalışmasını engellemeyecek bir değer atamaya
           DİKKAT EDİLMELİDİR

       */

        while (sayi != 0) { // kullanıcı 0'a basıncaya kadar

            System.out.println("Toplanmak üzere sayılar giriniz \nBitirmek için 0'a basınız");

            sayi = scanner.nextDouble();

            toplam += sayi;

        }
        System.out.println("Girelen sayıların toplamı : " + toplam);


    }
}
