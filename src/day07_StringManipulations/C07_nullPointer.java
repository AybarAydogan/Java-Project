package day07_StringManipulations;

public class C07_nullPointer {

    public static void main(String[] args) {

        String str;

        // System.out.println(str);
        // Java'da main method içerisinde deger atamadan bir variable oluşturabiliriz
        // ANCAK deger atamadan kullanamayız

        String str2 = "";
        System.out.println(str2); // hiçlik yazdırır
        // str2'yi kullanabilmek için hiçlik değeri atayabiliriz
        // ANCAK hiçlik değeri atanan variable'ları
        // Java değer atanmamış olarak sınıflandırmaz
        // deger atananlar grubuna koyar

        /*
        java değer atanmamış variable'ları işaretlemek için
        özel olarak null keyword'unu oluşturmuştur

        aşagıdaki örnekte
        str4' e hiçlik değeri atanmıştır
        str5'e Tava değeri atanmıştır
        str3 ise null olarak İŞARETLENMİŞTİR

        null bir değer değil İŞARETCİDİR
        str3'un oluşturulduğunu ve bir değer atanana kadar
        bu şekilde kullanılmak istendiğini Java£ya söyler

        bull olarak işaretlenen bir String£i
        yazdırabilirsiniz
        ancak method£larda kullanamazsınız

         */

        // String str3 = true ;
        // String str3 = 45;
        // String str3 = 'f';
        String str3 = null;
        String str4 = "";
        String str5 = "Tava";

        System.out.println(str3); // null

    //  System.out.println(str3.isBlank()); // NullPointerException

    //  System.out.println(str3.substring(0, 1)); // NullPointerException

    // System.out.println(str3.charAt(0)); //NullPointerException

    // System.out.println(str3.isEmpty()); // NullPointerException

        System.out.println(str3 == null); // true
    }

}
