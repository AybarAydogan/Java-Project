package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aybar");
        isimler.add("Uğurcan");
        isimler.add("Sibel");
        isimler.add("Buket");
        isimler.add("Halil");
        isimler.add("Elif");

        List<String> silinecekler2 = new ArrayList<>();

        silinecekler2.add("Halil");
        silinecekler2.add("Duru");

        isimler.remove(2); // Sibel
        System.out.println(isimler); // [Aybar, Uğurcan, Buket, Halil, Elif]

        isimler.remove("Uğurcan"); // true
        System.out.println(isimler); // [Aybar, Buket, Halil, Elif]

        System.out.println(isimler.removeAll(silinecekler2)); // isimlerde değişiklik olursa true oluyor
        System.out.println(isimler); // [Aybar, Buket, Elif]

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(8);

        System.out.println(sayilar); // [3, 2, 8]

        // eğer list sayılardan oluşuyorsa
        // remove(2) yazdığımızda 2'nin element mi yoksa index mi olacağını netleştirmek gerekir
        // Java bu durumu netleştirmek için
        // sayılardan oluşan list'lerde yazılan sayıyı İNDEX olarak kabul eder

        System.out.println(sayilar.remove(2)); // 8
        System.out.println(sayilar); // [3, 2]

        // illa da obje olan 2'yi silmek istiyorsak ve index'ini bilmiyorsak
        // Önce silmek istediğimiz elementi bir obje (non-primitve) olarak tanımlamalıyız

        Integer silinecekSayı = 2;
        System.out.println(sayilar.remove(silinecekSayı)); // true
        System.out.println(sayilar); // [3]

        sayilar.clear();
        System.out.println(sayilar); // []

    }
}
