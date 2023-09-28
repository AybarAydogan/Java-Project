package day14_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        //         eski array’e yeni degeri atayin.


        int[] arr1 = {4,5,6,7};

        // buarray'e 5.element olarak 8'i atayın

        // arr1[4] = 8; // çalıştırınca hata verir

        int[] yeniArr = {4,5,6,7,8};

        arr1 = yeniArr;

        System.out.println("arr1'in son hali : " + Arrays.toString(arr1)); // arr1'in son hali : [4, 5, 6, 7, 8]

       arr1 = arrayeElemanEkle(arr1,10);

        System.out.println("arr1'in method call'dan sonraki hali : " + Arrays.toString(arr1)); // arr1'in method call'dan sonraki hali : [4, 5, 6, 7, 8, 10]

        arr1 = arrayeElemanEkle(arr1,12);

        System.out.println("arr1'in 2.method call'dan sonraki hali : " + Arrays.toString(arr1)); // arr1'in 2.method call'dan sonraki hali : [4, 5, 6, 7, 8, 10, 12]

    }

    public static int[] arrayeElemanEkle(int[]arr , int eklenecekEleman){

        int[] yeniArr = new int [arr.length+1]; // [0,0,0,...]

        // eski array'Deki tüm elementleri yeni array'e atayalım

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        }

        // yeni array'in son elementi olarak istenen sayıyı atayalım

        yeniArr[yeniArr.length-1] = eklenecekEleman;




     return yeniArr;
    }
}
