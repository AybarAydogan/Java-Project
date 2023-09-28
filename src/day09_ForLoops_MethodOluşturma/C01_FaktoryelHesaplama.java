package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C01_FaktoryelHesaplama {
    public static void main(String[] args) {

       // Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //        5! = 5*4*3*2*1


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tamsayı giriniz");
        int sayi = scanner.nextInt();

        int faktoryelSonuc = 1;

        for (int i = sayi; i >=1 ; i--) {

            faktoryelSonuc *= i;
        }

        System.out.println("Verilen sayının faktoryel değeri : " + faktoryelSonuc);
    }
}
