package day15_multiDimensionalArrays_Arraylists;

import java.util.ArrayList;
import java.util.List;

public class C10_set {
    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Aybar");
        isimler.add("Uğurcan");
        isimler.add("Sibel");
        isimler.add("Buket");
        isimler.add("Halil");
        isimler.add("Elif");

        System.out.println(isimler); // [Aybar, Uğurcan, Sibel, Buket, Halil, Elif]

        System.out.println(isimler.get(1)); // Uğurcan
      //  System.out.println(isimler.get(8)); // IndexOutOfBoundsException

        isimler.add(3,"Mert");

        System.out.println(isimler); // [Aybar, Uğurcan, Sibel, Mert, Buket, Halil, Elif]

        // set()'u bir elementi UPDATE (yeni değer atamak) için kullanılır

        isimler.set(3,"Beyza");

        System.out.println(isimler); // [Aybar, Uğurcan, Sibel, Beyza, Buket, Halil, Elif]

        // method'ların yaptığı iş ile bize döndürdüğü sonuç FARKLI OLABİLİR

        System.out.println(isimler.set(1, "Duru"));  // Uğurcan

        System.out.println(isimler); // [Aybar, Duru, Sibel, Beyza, Buket, Halil, Elif]

        isimler.set(1,"Uğurcan");

        System.out.println(isimler); // [Aybar, Uğurcan, Sibel, Beyza, Buket, Halil, Elif]


    }
}
