package day19_passByValue;

public class C02_PassByValue {

    public static void main(String[] args) {

        int sayi = 20;

        System.out.println("method call öncesi sayi : " + sayi); // 20

        System.out.println("Method return değeri : " + sayiDegistir(sayi)); // 25

        System.out.println("method call sonrası sayi : " + sayi); // 25

        sayi = sayiDegistir(sayi);

        System.out.println("atama call sonrası sayi : " + sayi); // 25
    }


    public static int sayiDegistir(int sayi) {

        sayi += 5;

        System.out.println("method içinde sayi : " + sayi); // 25

        return sayi;
    }
}
