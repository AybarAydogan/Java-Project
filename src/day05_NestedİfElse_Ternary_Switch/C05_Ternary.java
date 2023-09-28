package day05_NestedİfElse_Ternary_Switch;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        // kullanıcadan bir pozitif tam sayı alın
        // sayının çift veya tek olduğunu yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tamsayı girin");
        int sayi = scanner.nextInt();

        // sorunun if else ile çözümü

        if (sayi % 2 == 0) {
            System.out.println("sayi çift");
        } else {
            System.out.println("sayi tek");
        }

        // ternary ile çözümü

        System.out.println(sayi % 2 == 0 ? "sayi çift " : "sayi tek");


        // sayi 100'den büyükse sayiyi 2 katına çıkarın,
        // 100'den büyük değilse değerini 10 artırın

        sayi = sayi > 100 ? 2 * sayi : sayi + 10;

        System.out.println("Ternary'den sonra sayi gelir:" + sayi);

        // sayinin yeni hali 10'den büyükse "sayi zaten büyük" yazdırın
        // yeni hali 100'den büyük değilse sayiyi 2 katına çıkarın

        System.out.println(sayi > 100 ? "sayi zaten büyük" : 2 * sayi);

        // sadece yazdırma veya sadece atama olan sorularda ternary kullanılabilir
        // ama ikisi farklı işlemler olduğunda kullanışlı olmaz
        // bu soruda 2 katını yazdırdı ama soruda atama istiyordu, yapmadı

    }
}
