package day10_MethodOluşturma_MethodOverloading;

public class C04_ToplaDondur {

    public static void main(String[] args) {

        // Verilen 3 sayının toplamını donduren bir method oluşturun

        toplaDondur(5,6,7); // bir sonuç döndüren method'lar call edildiğinde
                            // sounu call edilen yere getirir
                            // bundan sonra yapılacak şey kodu yazan kişiye bağlıdır
                            // 1-ya return  edilen sonucu direk yazdırabilir
                            // 2- ya da daha sonra kullanılmak üzere bir variable'a atayabilir

        System.out.println(toplaDondur(2,3,4)); // 9.0

        double toplam = toplaDondur(6,9,1); //  16 döndürücek ve bu değer toplam variable'ına kaydedilecek


    }

    public static double toplaDondur(double sayi1, double sayi2, double sayi3){

        double toplam = sayi1+sayi2+sayi3;
        return toplam;
    }
}
