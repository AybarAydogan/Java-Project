package day10_MethodOluşturma_MethodOverloading;

public class C08_methodOverLoading {
    public static void main(String[] args) {

        /*
        Bir method Call yapıldığında
        Java hangi mehod'un çalışıcağına karar vermek için
        aşağıdakilerin kontrollerini yapar

        1- isim
        2-argument sayisi ile parametre sayisi
        3- argument olarak yazılan DEĞERler ile PARAMETRE'lerin data türünün uyunmlu olması

        devamı C10 da
         */

        toplama(5,7); // İki int sayının toplamı : 12

        toplama('a','b'); // İki int sayının toplamı : 195

       //  toplama(4,5.6,5);
       //  toplama(4,6.7);


    }

    // verilen iki integer sayiyi toplayıp yazdıran bir method oluşturun

    public static void toplama(int sayi1, int sayi2) {
        System.out.println("İki int sayının toplamı : " + (sayi1 + sayi2));
    }
}
