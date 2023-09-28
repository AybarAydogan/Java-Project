package day13_Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        int[] arr = new int[5];
        /*
            Bir array oluşturulurken 2 şey mutlaka deklare edilmelidir
            1- içine konulucak elementlerin data türü
            2- array'in içine konulacak element sayısı (length)

            eğer array'i yukardaki gibi oluşturursak
            biz hiç bir değer ataması yapmadığımız için
            Java default olarak belirlediği değerleri atayavaktır

            Array oluşturulduktan sonra,
           olmayan index kullanılarak yeni değer atanması/eklenmesi MÜMKÜN DEĞİLDİR

           Yani 4 elemanlı bir array'e 5.elementi ATAYAMAZSINIZ
           Aynı şekilde 4 elemanı olan array'den bir elemanı silip, eleman sayısını 3'e düşüremezsiniz
        */

        int[] arr2 = {4, 1, 7, 5}; // length =

        System.out.println(arr2[1]); // 1
        System.out.println(arr2[3]); // 5
        System.out.println(arr2[arr2.length - 1]); // son elementi yazdırmakistersek

        // il array'de değer ataması yapmadık

        System.out.println(arr[0]); // 0
        System.out.println(arr[arr.length - 1]); // son elementi yazdırın

        // olmayan index'deki bir elemente ulaşmak istersek
        // System.out.println(arr2[5]); // ArrayIndexOutOfBoundsException

        // olmayan bir index'e atama yapabilir miyiz ?

        // arr2[4] = 8; // ArrayIndexOutOfBoundsException

        arr = new int[10];

        arr = new int[20];

    }
}
