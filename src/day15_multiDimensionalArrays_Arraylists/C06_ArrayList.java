package day15_multiDimensionalArrays_Arraylists;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList {
    public static void main(String[] args) {

        List<Integer>sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 8, 3]

        sayilar.add(6);
        sayilar.add(9);

        System.out.println(sayilar); // [5, 8, 3, 6, 9]

        sayilar.add(2,11);
        // var olan elementleri değiştirmez
        // istenen elementi, istenen index'e yerleştirir
        // ve kalan elementleri geriye öteler

        System.out.println(sayilar); // [5, 8, 11, 3, 6, 9]

        List<Integer>rakamlar = new ArrayList<>();

        rakamlar.add(1);
        rakamlar.add(2);

        System.out.println(rakamlar); // [1, 2]

        rakamlar.addAll(sayilar);

        System.out.println(rakamlar); // [1, 2, 5, 8, 11, 3, 6, 9]


        rakamlar.addAll(1,sayilar);

        System.out.println(rakamlar); // [1, 5, 8, 11, 3, 6, 9, 2, 5, 8, 11, 3, 6, 9]





    }
}
