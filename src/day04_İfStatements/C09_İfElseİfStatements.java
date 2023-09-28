package day04_İfStatements;

import java.util.Scanner;

public class C09_İfElseİfStatements {
    public static void main(String[] args) {


        // soru 2- kullanıcının kilo(kg) ve oyunu (cm) isteyip
        //         vucut kile endeksini hesaplayıp (kilo*10000 / (boy*boy))
        //         vucut kitle endeksi
        //           -30'dan buyukse obez,
        //           -25-30 arası ise kilolu,
        //           -20-25 arası ise normal,
        //           -20'den küçükse zayıf yazdırın.


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen kg olarak kilonuzu giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("lütfen cm olarak boyunuzu giriniz");
        double boy = scanner.nextDouble();

        double vke= (kilo*10000 / (boy *boy));

        if (kilo<20 || kilo>200 || boy>200 || vke<10 || vke>50){
            System.out.println("lütfen girilen degerleri kontrol ediniz");
        }else if (vke >30 ){
            System.out.println("vücut kitle endeksi : " + vke+" Obez");
        } else if (vke>25) {
            System.out.println("vücut kitle endeksi : " + vke+" Kilolusunuz");
        }else if (vke>20){
            System.out.println("vücut kitle endeksi : " + vke+" Kilonuz normal sınırlar içersisinde");
        }else {
            System.out.println("vücut kitle endeksi : " + vke+" Zayıfsınız");
        }


    }
}
