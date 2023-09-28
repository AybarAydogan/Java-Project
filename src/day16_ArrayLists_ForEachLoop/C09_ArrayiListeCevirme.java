package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArrayiListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {3,5,6,7,3,6,8,4,2,9,0,1};
        /*
            Uzun bir array'i liste çevirmenin
            en kullanışlı yolu
            bir for-loop ile elementleri taşımaktır

            Arrays class'ında asList() method'u da array'i list'e çevirir
            ANCAK 2 büyük problemi vardır

            1- array'den çevirdiğimiz list'e ekleme çıkarma gibi
            size'ı değiştiren işlem yapamazsınız

           2- bu method array ve çevirdiği list'i eşleştirir
           array'de yağtığınız değişiklik list'e
           list'te yaptığınız değişiklik array'e işlenir
         */

        List<Integer> sayilar =Arrays.asList(arr);

        System.out.println("Sayılar listesi : " + sayilar);
        //Sayılar listesi : [3, 5, 6, 7, 3, 6, 8, 4, 2, 9, 0, 1]

      //  sayilar.add(10); // UnsupportedOperationException
       //  sayilar.remove(3); // UnsupportedOperationException

        System.out.println("Array : " + Arrays.asList(arr));
        //Array : [3, 5, 6, 7, 3, 6, 8, 4, 2, 9, 0, 1]

        // Array'in 0.index'indeki sayıyı 33 yapın
        arr[0] = 33;
        System.out.println("Array : " + Arrays.asList(arr));
        // Array : [33, 5, 6, 7, 3, 6, 8, 4, 2, 9, 0, 1]

        System.out.println("Array'i degistirdikten sonra Sayilar Listesi : " + sayilar );
        // Array'i degistirdikten sonra Sayilar Listesi : [33, 5, 6, 7, 3, 6, 8, 4, 2, 9, 0, 1]
    }
}
