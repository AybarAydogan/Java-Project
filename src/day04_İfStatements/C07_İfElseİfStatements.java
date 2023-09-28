package day04_İfStatements;

import java.util.Scanner;

public class C07_İfElseİfStatements {
    public static void main(String[] args) {


        // kullanıcıdan pozitif bir tam sayı isteyin
        // sayı 3'e bölünüyorsa
        // sayı 5'e bölünüyorsa 5' bölünüyor
        // hem 3i hem 5'e bölünüyorsa "süper sayı"
        // ne 3 ne 5'e bölünmüyorsa "çöpe at gitsin" yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();


        if (girilenSayi % 3 == 0 && girilenSayi % 5 == 0){
            System.out.println("süper sayi");
        } else if (girilenSayi % 3 ==0) {
            System.out.println("3'e bölünüyor");

        }else if (girilenSayi % 5 == 0 ){
            System.out.println("5'e bölünür");
        }else{
            System.out.println("çöpe at gitsin");
        }





    }
}
