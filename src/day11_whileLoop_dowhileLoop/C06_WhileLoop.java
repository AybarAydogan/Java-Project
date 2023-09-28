package day11_whileLoop_dowhileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        // Soru 2- While loop kullanarak
        //       kullanicidan alinan sayinin rakamlar toplamini bulun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen rakamlar toplamını bulmak için bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int rakam = 0;
        int rakamlarToplami = 0;
        int geciciSayi = girilenSayi;

        while (geciciSayi > 0) {

            rakam = geciciSayi % 10;
            rakamlarToplami += rakam;
            geciciSayi /= 10;
        }

        System.out.println(girilenSayi + " sayısının rakamlar toplamı : " + rakamlarToplami);
    }
}
