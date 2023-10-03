package day20_inmutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C04_LocalTime {
    public static void main(String[] args) {

        /*
            localtime objesi canlı bir kronometre değil
            oluşturulduğu anda sistemin saat bilgisini kaydeden bir variable'dir
         */


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 13:04:52.352588300

        LocalTime turkiyeSaati = LocalTime.now( ZoneId.of("Europe/Paris")).plusHours(1);

        System.out.println(turkiyeSaati); // 13:08:04.022033700

        LocalTime japonyaSaati = LocalTime.now(ZoneId.of("Asia/Tokyo"));

        System.out.println(japonyaSaati); // 19:09:24.970597

        System.out.println(localTime.toNanoOfDay()); // 47461855909800


        // yüzbin ile 1 milyon arasındaki sayıların toplamını
        // ve toplama işleminin kaç nanosaniye sürdüğünü yazdırın


        System.out.println("loop başında localtime : " + localTime);
        LocalTime baslangic = LocalTime.now();
        System.out.println("Başlangıç : " + baslangic); // Başlangıç : 13:22:23.952680
        System.out.println("Başlangıçt nano saniye : " + baslangic.toNanoOfDay()); // Başlangıçt nano saniye : 48283871650800


        long toplam = 0;

        for (int i = 100000; i <=1000000 ; i++) {
            toplam +=i;
        }

        System.out.println("toplam : " + toplam); // toplam : 495000550000

        System.out.println(localTime);
        System.out.println("loop sonunda localtime : " + localTime); // loop sonunda localtime : 13:22:23.937058700

        LocalTime bitis = LocalTime.now();
        System.out.println("Bitiş : " + bitis); // Bitiş : 13:22:23.968301700
        System.out.println("Bitişte nano saniye : " + bitis.toNanoOfDay()); // Bitişte nano saniye : 48283887272100

        System.out.println("İşlem süresi " + (bitis.toNanoOfDay() - baslangic.toNanoOfDay())); // İşlem süresi 15621300

    }
}
