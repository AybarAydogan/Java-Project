package day21_varargs_StringBuilder;

public class C08_StringBuilder_StringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder ile bazı String method'ları da kullanılabilir
             bize string veya char döndüren method'lar
             kalıcı değişiklik uapmazlar

             Bazı String method'ları ise StringBuilder'da yoktur
             kullanmak istersek
             sb.toString() ile önce String'e çevirir, sonra istenen String method'u kullabılabilir
             böyle yapılan değişiklikler sb'da kalıcı değişiklik YAPMAZ
         */

        StringBuilder sb = new StringBuilder("Java");

        System.out.println(sb.substring(2)); // va

        System.out.println(sb); // Java

        System.out.println(sb.charAt(2)); // v

        System.out.println(sb); // Java

        // void olan setCharAt() kalıcı değişiklik yapar
        sb.setCharAt(0,'H');
        System.out.println(sb); // Hava

        // sb "a" içeriyor mu?

        System.out.println(sb.toString().contains("a")); // true
    }
}
