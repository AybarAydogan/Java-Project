package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C02_FaktoryelYazdırma {
    public static void main(String[] args) {

        // Soru 6- Kullanicidan 20’den kucuk bir sayi alip,
        //         bu sayinin faktoryel degerini hesaplayin.
        //         Konsolda faktoryel hesabinin yapilisini da yazdirin.
        //         Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        long faktoryelSonuçu = 1;
        System.out.print(sayi + "!= "); // 6! =

        for (int i = sayi; i >= 1; i--) {

            faktoryelSonuçu *= i;

            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i + " = ");
            }
        }

        System.out.println(faktoryelSonuçu);
    }
}
