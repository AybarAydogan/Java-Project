package day20_inmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_Mutable_İnmutableClasses {
    public static void main(String[] args) {


        String str = new String("Java Candır");


        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str); // Java Candır

        str.toLowerCase();

        // String method'larının yaptığı değişiklikler sadece o satır için geçerlidir
        // kalıcı olmasını istersek atama yapmalıyız


        List<String> isimler = new ArrayList<>();

        isimler.add("Aybar");
        isimler.add("Sibel");
        isimler.add("Buket");

        System.out.println(isimler); // [Aybar, Sibel, Buket]

        isimler.set(1,"Elif");

        System.out.println(isimler); // [Aybar, Elif, Buket]

    }
}
