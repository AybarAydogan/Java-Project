package day05_NestedİfElse_Ternary_Switch;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class C01_İfElseStatemenets {
    public static void main(String[] args) {

        //  Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //  Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //  Cinsiyet ve yasini dikkate alarak
        //  “Emekli olabilirsin” veya “Emekli olmak icin ..Yil daha calisman gerekir” yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ciniyetinizi giriniz E: Erkek K:Kadın");
        char cinsiyet = scanner.next().toUpperCase().charAt(0); // Kllanıcı nasıl girerse girsin büyük harfe çeviricek

        System.out.println("lütfen yaşınızı giriniz");
        double yaş = scanner.nextDouble();
        if (yaş < 18 || yaş > 80 || !(cinsiyet == 'E' || cinsiyet == 'K')) {
            System.out.println("Girilen bilgilerde hata var");
        } else if (cinsiyet == 'E' && yaş >= 65) {
            System.out.println("Erkek emekli olabilir");
        } else if (cinsiyet == 'E' && yaş < 65) {
            System.out.println("Erkek emekli olmak için daha " + (65 - yaş) + "yıl çalışmalıdır.");
        } else if (cinsiyet == 'K' && yaş >= 60) {
            System.out.println("Kadın emekli olabilir");
        } else {
            System.out.println("Kadın emekli olmak için daha " + (60 - yaş) + "yıl çalışmalıdır.");

        }


    }
}
