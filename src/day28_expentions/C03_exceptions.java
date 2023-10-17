package day28_expentions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_exceptions {
    public static void main(String[] args) {

        // kullanıcıdan iki tamsayı alın
        // ilk sayıyı ikinicye bölüp yazdırın

        /*
            Bir kod yazarken
            olası risk durumlarını analiz etmek
            ve bu riskler gerçekleşirse ne yapacağını Java'ya söylemek
            iyi bir kod yazarının görevidir.

            Java'da öngörülen bir hatayı
            exception oluşmadan çözmek için ( handle etmek)
            try-catch / finallt bloklar kullanılır

            1- hatanın oluşabileceği satırları bir try blog'unun içine alın
            2- olası exception'ı catch (olasıExceptionAdı exceptionıKaydedeceğimizObje)
               şeklinde yazar
            3- exception oluşması durumda çalışmasını istediğimiz kodu
               catch() { catch bloğu} na yazar

             Eğer birden fazla olası exception varsa
             1- iç içe try-catch blokları  oluşturabiliriz
             2- bir try birden fazla catch yazılabilir
             3- eğer tüm olası exception'ları kapsayan bir exception varsa
                tek catch ile geniş kapsamlı exception yazılabilir
                bu durumda hatayı spesifik olarak bilemeyeceğimiz için
                hata mesajını da genel vermeliyiz
         */

        Scanner scanner = new Scanner(System.in);
        /* iç içe try-catch
        try {

            try {
                System.out.println("Lütfen iki tamsayı giriniz");

                int sayi1 = scanner.nextInt();
                int sayi2 = scanner.nextInt();
                System.out.println("Sayıların bölümü : " + sayi1 / sayi2);

            } catch (ArithmeticException e) {
                System.out.println("İkinci sayı 0 olamaz");

            }

        } catch (InputMismatchException f) {
            System.out.println("Tamsayı girmelisiniz");
        }

         */

        /*
        try {
            System.out.println("Lütfen iki tamsayı giriniz");

            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü : " + sayi1 / sayi2);
        }catch (ArithmeticException e){
            System.out.println("İkinci sayı 0 olamaz");
        }catch (InputMismatchException f){
            System.out.println("Tamsayı girmelisiniz");
        }

         */

        System.out.println("Lütfen iki tamsayı giriniz");

        try {
            int sayi1 = scanner.nextInt();
            int sayi2 = scanner.nextInt();
            System.out.println("Sayıların bölümü : " + sayi1 / sayi2);
        } catch (Exception e) {
            System.out.println("Yanlış giriş yaptınız");

        }


        /*
            catch() içinde yazdığımız e
            yakalanan exception'ın kaydedildiği obje olacaktır

            eğer exception ile ilgili daha detaylı bilgi almak istersek
            e objesi kullanılarak
            hatanın detayı yazdırılabilir

            orneğin = e.printStackTrace(); aşağıdaki raporu yazdırır
            java.util.InputMismatchException
	        at java.base/java.util.Scanner.throwFor(Scanner.java:947)
	        at java.base/java.util.Scanner.next(Scanner.java:1602)
	        at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
	        at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
	        at day28_expentions.C03_exceptions.main(C03_exceptions.java:77)

	        e.getMessage() ; bize null veya /by zero yazdırdı
	         e.toString() ;  bize java.util.InputMismatchException


         */
    }
}
