package day11_whileLoop_dowhileLoop;

import java.util.Scanner;

public class C11_DoWihileLoop {
    public static void main(String[] args) {

        //  Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise değeri, tam kare değilse uyarı yazdırın,
        //          Ornek : input : 16, output: 4
        //                  input : 23, outout: tam kare değil

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen tam kare olmasını kontrol etmek için bir tamsayı giriniz");
        int girilenSayi = scanner.nextInt();
        int karekok = 1;

        do {
            if (karekok * karekok == girilenSayi){
                System.out.println("Girilen sayı bir tam kare karekok değeri : " + karekok);
            }
            karekok++;
        } while (karekok * karekok <= girilenSayi);

    }
}
