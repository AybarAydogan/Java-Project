package day06_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {

        String str = "Java Candır";

        System.out.println(str.toUpperCase()); // JAVA CANDIR
        // String methof'ları ile yapılan değişiklikler değişmez
        // String'i kalıcı olarak değiştirmez.

        System.out.println(str); // Java Candır

        // değişikliğin kalıcı olmasını isterseniz
        // String'de atama yapmalısınız

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candır

        // I yerine küçük harf seçtiğimiz de i geliyor
        // I yerine Türkçe karakter olarak ı gelmesini isterseniz

        System.out.println(str.toLowerCase(Locale.forLanguageTag("TR"))); // java candır
    }
}
