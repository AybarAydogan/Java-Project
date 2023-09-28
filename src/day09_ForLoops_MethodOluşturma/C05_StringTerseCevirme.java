package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C05_StringTerseCevirme {
    public static void main(String[] args) {

        // Soru 10 (interview)- Kullanicidan bir String isteyin
        //                      ve String'i tersine cevirip kaydedin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen terse çevirmek için bir metin yazın");
        String girilenMetin = scanner.nextLine();

        // Ali topu at
        // ta upot ilA

        // tersMetin = "";+t+a+ +u+p....+A

        String tersMetin = "";

        for (int i = girilenMetin.length() - 1; i >= 0; i--) {

            tersMetin += girilenMetin.charAt(i);
        }
        System.out.println("Girilen metnin ters hali: " +tersMetin);


        // tersi ile düzden yazlışı aynı olan metinlere palindrome denir
        //girilen metnin palindrome olup olmadığını yazdıralım

        if (girilenMetin.equalsIgnoreCase(tersMetin)){
            System.out.println("Girilen metin palindrome");
        }else{
            System.out.println("Girilen metin palindrome değil ");
        }

    }

}
