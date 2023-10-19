package day30_İteretor_Collections;

import java.util.*;

public class C03_LinkedList {
    public static void main(String[] args) {

        /*
           LinkedList birden fazla interface'i implement ettiği için
           implement ettiği Interface'ler data türü olarak seçilebilir
           ve hangi Interface'i data türü seçersek
           LinkedList o data türünün sahip olduğu özellikleri taşır

           Eğer data türü ve constructor LinkedList seçilirse
           implement ettiği List, Queue ve Deque interface'lerindeki
           tüm özellikleri taşıyacaktır
         */


        LinkedList<String> ll1 = new LinkedList<>();

        List<Integer> ll2 = new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String> ll4 = new LinkedList<>();

        // Eğer data türü olarak list<> seçilirse
        // bizim şimdiye kadar kullandığımız ArrayList<> ile aynı özelliklere sahip olur
        ll2.add(4);
        ll2.add(5);
        ll2.add(8);

        System.out.println(ll2); // [4, 5, 8]

        ll2.add(1,9);
        System.out.println(ll2); // [4, 9, 5, 8]

        System.out.println(ll2.get(2)); // 5

        ll2.remove(1);

        System.out.println(ll2); // [4, 5, 8]

        Integer silinecekSayi = 8;

        System.out.println(ll2.remove(silinecekSayi)); // true

        silinecekSayi = 12;
        System.out.println(ll2.remove(silinecekSayi)); // false

        System.out.println(ll2); // [4, 5]

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println(list); // [4, 6, 9, 10]

        System.out.println(list.retainAll(ll2)); // true

        System.out.println("ll2 :" + ll2); // ll2 :[4, 5]
        System.out.println("list : " + list); // list : [4]

        /*
           List'den ll2'da olmayan elemanları siler
           eğer herhangi bir elemanı silerse true
           hiç bir elemanı silemezse false döner
         */

        list.add(6);
        list.add(9);
        list.add(10);

        System.out.println(list.removeAll(ll2)); // true

        System.out.println("ll2 :" + ll2); // ll2 :[4, 5]
        System.out.println("list : " + list); // list : [6, 9, 10]

        // retainAll() ortak elemanlar dışındakileri siler
        // removeAll() ise ortak elemanları siler

    }
}
