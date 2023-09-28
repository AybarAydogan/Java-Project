package day04_İfStatements;

public class C01_BagımsızIfCumleleri {
    public static void main(String[] args) {

        /* bagımsız if cümleleri kodun geriye kalanı ile ilgilenmez
        sadece kend, sartına odaklanır

        birden fazla bagımsız if cumlesi varsa
        butun if body'lerini calıştıran durumlar olabilecegi gibi

        a=230, b=45

        hiçbir if body'sinin calışmayacagı durumlar da olabilir

        a=23, b=44



         */

        int a = 123;
        int b = 42;

        // a 'b'den büyük mü ?

        if (a > b) {
            System.out.println("a b'den buyuk");
        }
        // a cift sayı mı ?

        if ( a % 2 == 0){
            System.out.println("a cift sayı");

        }
        // b 5 ile tam bolunebiliyor mu ?

        if (b % 5 == 0){
            System.out.println("b 5 ile tam bolunur");
        }

        // a 3 basamaklı bir sayı mı ?
        if (a>=100 && a<=999){
            System.out.println("a sayisi 3 basamaklı");
        }

        // a ile b'nin toplamı 100'den nuyuk mu ?
        boolean şart = a + b > 100;
        System.out.println(şart); //false

        if (şart){
            System.out.println("a ile b'nin toplamı 100'den büyük");
        }

        if (true){
            System.out.println("bu if body'si her zaman çalışır");
        }

        if (false){
            System.out.println("bu if body hiçbir zaman çalışmaz");
        }
















    }
}