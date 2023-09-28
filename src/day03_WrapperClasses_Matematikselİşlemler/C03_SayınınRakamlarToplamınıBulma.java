package day03_WrapperClasses_Matematikselİşlemler;

import java.util.Scanner;

public class C03_SayınınRakamlarToplamınıBulma {

    public static void main(String[] args) {

        // kullanıcan 3 basamaklı pozitif bir tamsayi alıp
        // sayının rakamlar toplamını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen 3 basamaklı pozitif bir tamsayı giriniz ");

        int girilenSayi = scanner.nextInt();

        int rakamlarToplamı = 0;
        int rakam = 0;

        // girilen sayı : 25 , rakam : 7 , rakamlar toplamı = 7

        rakam = girilenSayi % 10 ;
        rakamlarToplamı = rakamlarToplamı + rakam ;
        girilenSayi = girilenSayi / 10;

        // girilen sayı : 25 , rakam : 7 , rakamlar toplamı = 7

        rakam = girilenSayi % 10 ;
        rakamlarToplamı = rakamlarToplamı + rakam ;
        girilenSayi = girilenSayi / 10 ;

        // girilen sayı : 25 , rakam : 7 , rakamlar toplamı = 7

        rakam = girilenSayi % 10 ; // 2 % 10 ==> 2
        rakamlarToplamı = rakamlarToplamı + rakam; // 12 + 2 ==> 14
        girilenSayi = girilenSayi / 10 ; // 2 / 10 ==> 0.2 ==> 0


        System.out.println("girilen sayının rakamları toplamı :" + rakamlarToplamı);

    }
}
