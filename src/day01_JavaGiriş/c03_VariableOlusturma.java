package day01_JavaGiriş;

public class c03_VariableOlusturma {
    public static void main(String[] args) {
        int sayi = 20;

        System.out.println(sayi); //20
        System.out.println("sayı"); // sayı

        int sayi2;
        sayi2 = 30;

        /*
        java'da =işareti ATAMA işlemidir
        ='in solunda sadece variable olur

        ='in sagında ise deger olur

        java = işari görünce önce sağ tarafta ki değeri hesaplar
        bulduğu sonuçu değer olarak solda ki variable atar
         */

        int a = 10 ;
        a = a + 20 ;
        a = 2 * a + 1 ;

        float sayiFL = 3.4F ;

        float sayi3 = 20F ;
        float sayi4 = 7f ;
        System.out.println(sayi3/sayi4);
        double sayi5 = 20;
        double sayi6 = 3;
        System.out.println(sayi6 /    sayi5);





    }
}
