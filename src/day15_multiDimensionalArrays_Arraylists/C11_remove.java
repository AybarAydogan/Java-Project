package day15_multiDimensionalArrays_Arraylists;

import java.util.ArrayList;
import java.util.List;

public class C11_remove {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aybar");
        isimler.add("Uğurcan");
        isimler.add("Sibel");
        isimler.add("Buket");
        isimler.add("Halil");
        isimler.add("Elif");

        // remove(silinecekObject) çalıştırınca,
        // silinicekObje varsa siler ve bize true döndürür
        // silinecekObje yoksa silemez ve bize false döndürür

        System.out.println(isimler); // [Aybar, Uğurcan, Sibel, Buket, Halil, Elif]

        System.out.println(isimler.remove("Uğurcan"));

        System.out.println(isimler); // [Aybar, Sibel, Buket, Halil, Elif]

        System.out.println(isimler.remove("Ercan")); // false

        System.out.println(isimler); // [Aybar, Sibel, Buket, Halil, Elif]

        isimler.remove("Aybar");

        System.out.println(isimler); // [Sibel, Buket, Halil, Elif]

        // remove(silinecekİndex) çalıştırınca,
        // silinicekİndex varsa siler ve bize true döndürür
        // silinecekİndex yoksa silemez ve bize false döndürür

        System.out.println(isimler.remove(1)); // Buket

        System.out.println(isimler); // [Sibel, Halil, Elif]

       // isimler.remove(5); // IndexOutOfBoundsException

        isimler.add("Aybar");
        isimler.add("Uğurcan");
        isimler.add("Buket");

        System.out.println(isimler); // [Sibel, Halil, Elif, Aybar, Uğurcan, Buket]

        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Sibel");
        silinecekler.add("Halil");
        silinecekler.add("Elif");

        System.out.println(silinecekler); // [Sibel, Halil, Elif]

        System.out.println(isimler.removeAll(silinecekler)); // true

        System.out.println(isimler); // [Aybar, Uğurcan, Buket]

        List<String> silinecekler2 = new ArrayList<>();

        silinecekler2.add("Uğurcan");
        silinecekler2.add("Buket");

        System.out.println(isimler.removeAll(silinecekler2)); // true

        System.out.println(isimler); // [Aybar]

        System.out.println(isimler.removeAll(silinecekler2)); // false

        System.out.println(isimler); // [Aybar]
    }
}
