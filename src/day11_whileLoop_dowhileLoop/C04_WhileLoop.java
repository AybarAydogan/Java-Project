package day11_whileLoop_dowhileLoop;

import day10_MethodOluşturma_MethodOverloading.C05_AsalSayiMiDondur;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan bir asal sayı girmesini isteyin
        // kullanıcı asal sayı girmezse "BU asal değil, tekrar dene" yazdırın
        // kullanıcı asal sayı girdiğinde, "işlem başarılı olarak tamamlandı" yazdırın

        Scanner scanner = new Scanner(System.in);
        int sayi = 6;


        while (!C05_AsalSayiMiDondur.asalMiDondur(sayi)) { // while loop boolean şart false olduğu sürece çalışır

            scanner = new Scanner(System.in);
            System.out.println("Lütfen asal bir sayı giriniz");
            sayi = scanner.nextInt();

            if (C05_AsalSayiMiDondur.asalMiDondur(sayi)) {
                System.out.println("işlem başarılı olarak tamalandı");
            } else {
                System.out.println("Bu asal değil, tekrar dene");
            }

        }
    }
}
