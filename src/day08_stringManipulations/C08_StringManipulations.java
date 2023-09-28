package day08_stringManipulations;

import java.util.Scanner;

public class C08_StringManipulations {
    public static void main(String[] args) {

       // Soru 6 : Kullanicidan alin bir String alin,
        // String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        // String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :( yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String girilenMetin = scanner.nextLine();


        int uzunluk = girilenMetin.length();
        String yeniHal = "";

        if (uzunluk % 2 == 0){ // uzunluk çift ise

            yeniHal = girilenMetin.substring(0,uzunluk /2) +
                    ":)"+
                    girilenMetin.substring(uzunluk/2);

        }else { // uzunluk tek ise
            yeniHal = girilenMetin.substring(0,uzunluk/2)+
                    ":(" +
                    girilenMetin.substring(uzunluk+1/2);

        }
        System.out.println(girilenMetin+ " yazdınız ve ben onu değiştirdim : " +yeniHal);

    }
}
