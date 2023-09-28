package day14_Arrays;

import day13_Arrays.C06_Arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3,6,1,8,2,9,12,-1,4,3};

        // arr'de 5'in olup olmadığını ve varsa kaç tane olduğunu yazdırın
        C06_Arrays.elemanSayisiYazdır(arr,5);// Aranan eleman array'de yok

        // arr'de 3'in olup olmadığını ve varsa kaç tane olduğunu yazdırın
        C06_Arrays.elemanSayisiYazdır(arr,3);// Aranan eleman array'de 2 kere kullanılmış

        System.out.println("=============");
        System.out.println(Arrays.binarySearch(arr, 8)); // -11
        System.out.println(Arrays.binarySearch(arr, 9)); // -11
        System.out.println(Arrays.binarySearch(arr, 2)); // 4
        System.out.println(Arrays.binarySearch(arr, 1)); // -1
        // binaraysearc() kullanmadan önce sort () kullanmazsanız
        // sonucu ne olacağını BİLEMEYİZ
        // doğru da olabilir, yanlış da olabilir


        String[] isimler = {"Esra","Ibrahim","Hüseyin","Ömer","Azim","Azim"};

        // isimler'de Esra'nın olup olmadığını döndüren bir method oluşturun

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Azim, Azim , Esra, Hüseyin, Ibrahim, Ömer]

        // Array'de arama yapmadan önce sort YAPILMALIDIR
        //Aradığımız element varsa, ilk kullanımın index'ini döndürür

        System.out.println(Arrays.binarySearch(isimler, "Esra")); // 2
        System.out.println(Arrays.binarySearch(isimler, "Azim")); // 0
        System.out.println(Arrays.binarySearch(isimler, "Ömer")); // 5

        // eleman yoksa olsaydı hangi sırada olacağını - işareti ile birlikte döndürür

        System.out.println(Arrays.binarySearch(isimler,"Aybar")); // -1
        System.out.println(Arrays.binarySearch(isimler,"Sibel")); // -6
    }
}
