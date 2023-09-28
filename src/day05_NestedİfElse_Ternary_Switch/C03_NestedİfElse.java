package day05_NestedİfElse_Ternary_Switch;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {


        //Soru 2- Kullanicidan aldigi urun adedi ve liste fiyatini alin,
//        kullaniciya musteri karti olup olmadigini sorun.
//        Musteri karti varsa
//              10 urun veya fazla alirsa %20,
//              10 urunden az alirsa %15 indirim yapin,
//        Musteri karti yoksa
//              10 urun veya fazla alirsa %15,
//              10 urunden az %10 indirim yapin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen aldınız ürün adedini giriniz");
        int urunAdedi = scanner.nextInt();

        System.out.println("Lütfen ürün fiyatını giriniz");
        double urunFiyatı = scanner.nextDouble();

        System.out.println("Müşteri kartınız var mı ? \nE:Evet H:Hayır");
        char kartVarmı = scanner.next().toUpperCase().charAt(0);

        // kartın olup olmaması ana değişken olsun

        if (kartVarmı == 'E'){
            if (urunAdedi >= 10){
                System.out.println("%20 indirimli toplam fiyat : " + urunAdedi*urunFiyatı * 80/100);
            }else {
                System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*urunFiyatı * 85/100);
            }

        } else if (kartVarmı == 'H') {
            if (urunAdedi>=10){
                System.out.println("%15 indirimli toplam fiyat : " + urunAdedi*urunFiyatı * 85 /100);
            }else {
                System.out.println("%10 indirimli toplam fiyat : " + urunAdedi*urunFiyatı * 90 /100);
            }
        }else {
            System.out.println("Kart bilgisini dogru giriniz");
        }
    }
}
