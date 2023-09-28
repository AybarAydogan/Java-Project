package day08_stringManipulations;

import java.util.Scanner;

public class C11_ForLoop {
    public static void main(String[] args) {

        // Kullanıcıdan pozitif bir tamsayı değeri isteyin
        // o sayıya kadar olan tüm pozitif tamsayıların toplamını yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı giriniz");
        int sayi = scanner.nextInt();

        int toplam = 0 ;

        for (int i = 1; i <=sayi ; i++) {

            toplam += i ;
        }

        System.out.println(sayi + "'ye kadar olan pozitif tamsayıların toplamı : " +toplam);
    }
}
