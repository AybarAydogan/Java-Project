package day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C06_ComputeMethodlari {
    public static void main(String[] args) {

        Map<String, Integer> harfler = new HashMap<>();

        harfler.put("A", 24);
        harfler.put("K", 15);
        harfler.put("Y", 28);
        harfler.put("C", 12);

        System.out.println(harfler); // {A=24, C=12, Y=28, K=15}

        // A'nın değerini 5 artırın
        int eskiKullanimMiktari = harfler.get("A");
        harfler.put("A", eskiKullanimMiktari + 5);

        System.out.println(harfler); // {A=29, C=12, Y=28, K=15}

        // Eğer C yoksa değeri 40 olarak ekleyin

        if (harfler.containsKey("C")) {
            harfler.put("C", 40);
        }

        System.out.println(harfler); // {A=29, C=40, Y=28, K=15}

        // Eğer Y varsa değerini 2 katına çıkarın

        if (harfler.containsKey("Y")) {
            eskiKullanimMiktari = harfler.get("Y");
            harfler.put("Y", eskiKullanimMiktari * 2);

        }
        System.out.println(harfler); // {A=29, C=12, Y=56, K=15}

        // A'nın değerini 10 artırın

        harfler.compute("A", (k, v) -> v + 10);

        System.out.println(harfler); // {A=39, C=12, Y=28, K=15}


        // x'in değerini 10 artırın


        // harfler.compute("X", (k, v) -> v + 10); // NullPointerException
        // girilen key'in var olduğundan emin değilseniz
        // bu mrthod'u kulanmayın


        // X varsa değerini 10 artırın

        harfler.computeIfPresent("X", (a, b) -> b + 10);

        System.out.println(harfler); // {A=39, C=40, Y=56, K=15}

        // K varsa değerini 10 artırın

        harfler.computeIfPresent("K", (a, b) -> b + 10);

        System.out.println(harfler); // {A=39, C=40, Y=56, K=25}


        // X yoksa değeri 10 olarak ekleyin

        // 1i yöntem
        // harfler.putIfAbsent("X",10);

        // 2.yöntem
        harfler.computeIfAbsent("X", k -> 10);

        System.out.println(harfler); // {A=39, C=40, X=10, Y=56, K=25}


    }
}
