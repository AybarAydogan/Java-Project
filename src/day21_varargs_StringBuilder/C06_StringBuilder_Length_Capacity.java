package day21_varargs_StringBuilder;

public class C06_StringBuilder_Length_Capacity {
    public static void main(String[] args) {
         StringBuilder sb1 = new StringBuilder();
         // içinde hiç bir yazı yok, length ==> 0,
        System.out.println(sb1.length()); // 0
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2 = new StringBuilder("Aybar Can");
        // içinde Aybar Can var , lenght ==> 9
        System.out.println(sb2.length()); // 9
        System.out.println(sb2.capacity()); // 16+7 = 25

        StringBuilder sb3 = new StringBuilder(11);
        // içinde hiç bir yazı yok, length ==> 0,
        System.out.println(sb3.length()); // 0
        System.out.println(sb3.capacity()); // 11


        // eğer stringBuilder'a ekleme yaoarsanız
        // java eklenecek metni de alabilmesi için
        // sb'in kapasitesini 2 * eski kapasite + 2 şeklinde artırır
        sb2.append("  okula gitmek istiyor.");
        System.out.println("sb2 : " + sb2);
        System.out.println(sb2.length()); // 32
        System.out.println(sb2.capacity()); // 52

        // Eğer kapasite ve lenght'i eşitlemek isterseniz

        sb2.trimToSize();
        System.out.println(sb2.length()); // 32
        System.out.println(sb2.capacity()); // 32


    }
}
