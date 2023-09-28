package day07_StringManipulations;

import java.util.Scanner;

public class C01_EndWith {

    public static void main(String[] args) {

        // kullanıcıdan bir mail alın 
        //  -mail @ içermiyorsa "geçersiz mail"
        //  -mail @gmail.com içermiyorsa, "mail gmail olmali"
        //  -mail @gmail.com ile bitmiyorsa, "mailde yazım hatası var" yazdırın,

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen mail adresinizi giriniz");
        String mail = scanner.nextLine();
        
        if (!mail.contains("@")){
            System.out.println("geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");
        }

    }
}
