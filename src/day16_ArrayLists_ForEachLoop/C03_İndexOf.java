package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_İndexOf {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aybar");
        isimler.add("Uğurcan");
        isimler.add("Sibel");
        isimler.add("Buket");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Aybar");
        System.out.println(isimler); // [Aybar, Uğurcan, Sibel, Buket, Halil, Elif, Aybar]

        System.out.println(isimler.indexOf("Aybar")); // 0
        System.out.println(isimler.lastIndexOf("Aybar")); // 6
        System.out.println(isimler.indexOf("Duru")); // -1
        System.out.println(isimler.indexOf("Mert")); // -1
        System.out.println(isimler.lastIndexOf("Beyza")); // -1










    }
}
