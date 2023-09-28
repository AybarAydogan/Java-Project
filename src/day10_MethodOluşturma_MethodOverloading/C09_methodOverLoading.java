package day10_MethodOluşturma_MethodOverloading;

public class C09_methodOverLoading {

    public static void main(String[] args) {
        /*
        Bir class'da aynı isim ve eşit sayıda parametre ile
        birden fazla method oluşturulabilir mi ?

        parametrelerin data türleri aynı olmazsa
        birden fazla aynı isimde method oluşturulabilir

        Java'da method ismi ve parametrelerin data türleri birlikte kullanılarak
        method signature oluşur

        method signature'i farklı olmak üzere
        bir class'da istediğiniz kadar
        aynı isimde method oluşturabilirsiniz

         */

        toplama(4,5); // İki int sayının toplamı : 9
        toplama(5,6.3); // İnt ve double 2  sayının toplamı : 11.3
        toplama(5.3,5); // Double ve  int 2  sayının toplamı : 10.3
    }

    // verilen iki integer sayiyi toplayıp yazdıran bir method oluşturun

    public static void toplama(int sayi1, int sayi2) { // toplama int int
        System.out.println("İki int sayının toplamı : " + (sayi1 + sayi2));

    }

    // verilen iki integer sayiyi toplayıp yazdıran bir method oluşturun

    public static void toplama(int a, double b) { // toplama int double
        System.out.println("İnt ve double 2  sayının toplamı : " + (a + b));
    }

    public static void toplama(double a, int b) { // toplama int double
        System.out.println("Double ve  int 2  sayının toplamı : " + (a + b));
    }


}
