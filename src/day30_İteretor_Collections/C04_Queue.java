package day30_İteretor_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_Queue {
    public static void main(String[] args) {
        Queue<String> harfler = new LinkedList<>();
        harfler.add("y");
        harfler.add("K");
        harfler.add("M");
        harfler.add("s");

        System.out.println(harfler); // [y, K, M, s]

        System.out.println(harfler.remove()); // y

        System.out.println(harfler); // [K, M, s]

        harfler.add("M");
        harfler.add("M");

        System.out.println(harfler); // [K, M, s, M, M]
        System.out.println(harfler.remove("M")); // true

        System.out.println(harfler); // [K, s, M, M]

        System.out.println(harfler.element()); // K
        // queue'nun ilk elemanını silmeden bize getirir
        System.out.println(harfler); // [K, s, M, M]

        System.out.println(harfler.peek()); // K
        // queue'nun ilk elemanını silmeden bize getirir
        System.out.println(harfler); // [K, s, M, M]

        // element ile peek arasındakifark, boş bir queue'da kullanıldığında görülür
        Queue<String> deneme = new LinkedList<>(); // []
       // System.out.println(deneme.element()); // NoSuchElementException
        System.out.println(deneme.peek()); // null

        System.out.println(harfler.poll()); // K
        // Queue'nun ilk elementini siler ve bize döndürür
        System.out.println(harfler); // [s, M, M, Z]






        System.out.println(harfler.offer("Z")); // true
        // eğer kapasite sınırlaması yoksa, verdiğimiz harfi queue'ya ekler
        System.out.println(harfler); // [K, s, M, M, Z]

        // add() ile offer() arasındaki fark
        // add() verilen elementi her halukarda eklerken
        // offer() kapasite uygunsa ekler


    }
}
