package day02_scanner_DataCasting;

import java.util.Scanner;

public class C04_Swap {
    public static void main(String[] args) {

        // soru 7- (İnterview)- kullanıcıdan iki sayı alıp
        //                      ikisinin değerlerini değiştirim (swap)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen ilk tamsayıyı giriniz");
        int sayı1 = scanner.nextInt();

        System.out.println("Lütfen ikinci tamsayıyı giriniz ");
        int sayı2 = scanner.nextInt();


        System.out.println("Girdiğiniz değerleri : sayı1 = " + sayı1 + ", sayı2 = " + sayı2);

        int bosKova = 0;

        bosKova = sayı2;

        sayı2 = sayı1;

        sayı1 = bosKova;

        System.out.println("Değiştirilen değerleri : sayı1 = " + sayı1 + ", sayı2 = " + sayı2);

    }
}
