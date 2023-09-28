package day04_İfStatements;

import java.util.Scanner;

public class C05_İfElseStatements {
    public static void main(String[] args) {


        // soru 4- kullanıcadan bir karakter girmesini isteyin ,
        //         girilen karakterin büyük harf olup olmadığını yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char krk = scanner.next().charAt(0);

        if (krk >= 'A' && krk <= 'Z'){
            System.out.println("girilen karakter büyük harf");
        }else{
            System.out.println("girilen karakter büyük harf değil");
        }


















    }
}
