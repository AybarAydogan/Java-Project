package day05_NestedİfElse_Ternary_Switch;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {


        // kullanıcıdan bir tamsayi alın
        // sayi pozitifse 100'den büyük veya kuçuk olduğunu yazdırın
        // sayi negatifse tek veya çift oldğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir tam sayi giriniz ");
        int sayi = scanner.nextInt();

        System.out.println(
                sayi > 0
                        ?
                        //sayi 0'dan buyukse yazdirilacak kisim
                        sayi>100 ? "sayi buyuk" : "sayi kucuk"
                        :
                        // sayi negatifse
                        sayi %2 == 0 ? "Sayi cift" : "Sayi tek"
        );
        /*
        System.out.println(
                sayi > 0 ? sayi>100 ? "sayi buyuk" : "sayi kucuk" : sayi %2 == 0 ? "Sayi cift" : "Sayi tek"
        );
         */
    }
}
