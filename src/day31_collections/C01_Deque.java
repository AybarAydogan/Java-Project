package day31_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C01_Deque {
    public static void main(String[] args) {

        Deque<String> harfler = new LinkedList<>();
        harfler.add("g");
        harfler.add("K");
        harfler.add("A");
        System.out.println(harfler); // [g, K, A]

        System.out.println(harfler.add("e")); // true
        harfler.addLast("K");
        harfler.addFirst("A");

        System.out.println(harfler); // [A, g, K, A, e, K]

        System.out.println(harfler.removeLastOccurrence("A")); // true
        System.out.println(harfler); // [A, g, K, e, K]

        System.out.println(harfler.removeLastOccurrence("X")); // false

        // harfler.remove(); ilk elementi siler
        // harfler.remove("A"); A'nın ilk kullanımını siler
        // harfler.removeFirst(); ilk elementi siler
        // harfler.removeFirstOccurrence("A"); // A'nın ilk kullanımını siler

       // System.out.println(harfler.poll()); // A
        System.out.println(harfler.pollFirst()); // A
        System.out.println(harfler); // [g, K, e, K]

        Deque<String> bosDeque = new LinkedList<>();
        // bosDeque.remove(); // NoSuchElementException
        // bosDeque.removeFirst(); // NoSuchElementException
        System.out.println(bosDeque.poll()); // null
        System.out.println(bosDeque.pollFirst()); // null


        // System.out.println(harfler.removeLast()); // K
        // System.out.println(harfler.removeLastOccurrence("K")); // true
        System.out.println(harfler.pollLast()); // K

        System.out.println(harfler); // [g, K, e]

        System.out.println(harfler.element()); // g
        System.out.println(harfler); // [g, K, e]
        // System.out.println(bosDeque.element()); // NoSuchElementException
        // ilk elemanini silmeden bize getirir.bulamazsa exception firlatir

        System.out.println(harfler.peek()); // g
        System.out.println(bosDeque.peek()); // null

        System.out.println(harfler.pop()); // g
        // removeFirst() ile aynıdır.
        System.out.println(harfler); // [K, e]

        harfler.push("A");
        // başa element ekler
        // addFirst()'den farklı olarak
        // eğer deque için bir eleman sınırlaması varsa
        // ve o sinir aşılıyorsa IllegalStateException verir

        System.out.println(harfler); // [A, K, e]
        System.out.println(harfler.offer("R")); // TRUE
        System.out.println(harfler); // [A, K, e, R]
        // add ile aynı işlemi yapar
        // ama kapasite sınırlaması olan durumlarda
        // kapasite aşılırsa, eklemek yerine exception fırlatır

    }
}
