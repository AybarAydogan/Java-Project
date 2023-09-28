package day04_İfStatements;

import java.util.Scanner;

public class C10_ElseVeSusluparantezlerinGorevi {
    public static void main(String[] args) {


        // müşteriden satın aldığı ürün adedini isteyin
        //  adet 100'den fazla ise "% 20 indirim kazandınız"
        // adet 50'den fazla ise " % 10 indrim kazandınız " yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen satın aldığınız ürün adedini giriniz");
        int adet = scanner.nextInt();

        if (adet>100) {
            System.out.println("%20 indirim kazandınız");
            System.out.println("Bizi tercih ettiniz için teşekkür ederiz ");
            System.out.println("kampanyalarımız hakkında detay için web sitemize bakınız");
        }else if (adet > 50) {
            System.out.println(" %10 indirim kazandınız");
            System.out.println("Bizi tercih ettiniz için teşekkür ederiz ");
            System.out.println("kampanyalarımız hakkında detay için web sitemize bakınız");
        }

        /*
        if else-if ... cumleleri else ile bitmek zorunda değildir
        AMMA eger else ile bitmezse bazi degerlerin kapsam dışında kalacağını bilmemiz gerekir

        EGER if veya else if'lerden sonra {} kullanılmazsa
        Java ilk ;
       ' e kadar olan kısmı body olarak kabul eder

       geriye kalan kodları if else if statement ile ilgisiz kabul eder

       NOT: eger if veya else body'niz sadece 1 satır ise
       {} kullanmadan kod yazabilirsiniz
       ancak body'e yazmanız gereken satır sayısı 1'den fazla ise
       mutlaka {} kullanmalısınız

         */


    }
}
