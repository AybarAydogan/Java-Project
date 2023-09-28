package day02_scanner_DataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
       // soru: kullanıcan üç farklı data türünde değer alınız

        // girilen değerleri açıklamalarıyla yazınız

        // adım 1 - scanner objesi oluşturalım

        // adım2 - kullanıcıya ne istedğinizi soyleyin

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen isminizi giriniz ");

        // adım 3 - girilen bilgiye uygun bir variable oluşturup
        //          data turune uygunnext...() ile bilgiyi alıp kaydedin
        String girilenİsim= scan.nextLine(); // sadece ilk ismi alır


        System.out.println("Girdiginiz isim : "  +  girilenİsim );

        // ikinci olarak bir tamsayı istiyelim  mesela yaşini istiyelim

        System.out.println("Lütfen yaşinizi giriniz");
        int yaş = scan.nextInt();

        System.out.println("Yaşınız : "  + yaş
         );

        // emekli misiniz true / false

        System.out.println("Emekli misiniz ? true veya false olarak giriniz ");
        boolean emekliMİ = scan.hasNextBoolean();

        System.out.println("girdiğiniz isim : "  + girilenİsim);
        System.out.println("yaşınız : "  +  yaş);
        System.out.println("emekli misiniz :"  + emekliMİ);
    }
}
