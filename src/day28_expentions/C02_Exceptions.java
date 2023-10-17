package day28_expentions;

import java.util.Scanner;

public class C02_Exceptions {
    public static void main(String[] args) {

        // kullanıcıdan iki tamsayı alın
        // ilk sayıyı ikinicye bölüp yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen iki tamsayı giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        if (sayi2 != 0){
            System.out.println("Sayıların bölümü : " + sayi1 / sayi2);
        }else {
            System.out.println("İkinci sayı 0 olamaz");
        }
    }
}
