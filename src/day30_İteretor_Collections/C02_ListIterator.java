package day30_İteretor_Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 2, 9, 7, 4, 8, 1, 3, 4, 2, 5, 6, 7, 2};

        List<Integer> sayilar = new ArrayList<>();
        for (Integer each : arr
        ) {

            sayilar.add(each);
        }

        System.out.println(sayilar); // [3, 5, 6, 2, 9, 7, 4, 8, 1, 3, 4, 2, 5, 6, 7, 2]

        // listedeki elemanları sondan başa doğru yazdırın

        ListIterator listIterator = sayilar.listIterator();
        // biz iterator oluşturduğumuzda, listenin başına konumlanır
        // eğer sondan başa doğru işlem yapmak istiyorsak,
        // once iterator'ı sona yollamalıyız

        while (listIterator.hasNext()) {
            listIterator.next();
        }

        // artık iterator sona gittiği için, boşa doğru istenen işlemi yaparak gelebiliriz

        while (listIterator.hasPrevious()) {

            System.out.print(listIterator.previous() + " ");
        } // 2 7 6 5 2 4 3 1 8 4 7 9 2 6 5 3
        System.out.println("");

        // tüm elementleri 1 artırın
        // iterator ile bir işleme başlamadan önce
        // iterator'ın son olarak nerede olduğunu bilmeliyiz
        // şu an için iterator başta olduğunda
        Integer eleman;

        while (listIterator.hasNext()) {

            eleman = (Integer) listIterator.next();

            listIterator.set(eleman + 1);
        }

        System.out.println(sayilar); // [4, 6, 7, 3, 10, 8, 5, 9, 2, 4, 5, 3, 6, 7, 8, 3]

        // tek sayıları silin
        // iterater şuan sonda

        while (listIterator.hasPrevious()) {

            eleman = (Integer) listIterator.previous();
            if (eleman % 2 == 1){
                listIterator.remove();
            }
        }

        System.out.println(sayilar); // [4, 6, 10, 8, 2, 4, 6, 8]

        // 5'den büyük olanları 1 azaltın, diğer sayıları 1 artırın
        // iterator başta

        while (listIterator.hasNext()){
            eleman = (Integer) listIterator.next();

            if (eleman > 5){
                listIterator.set(eleman - 1);
            }else {
                listIterator.set(eleman + 1);
            }
        }
        System.out.println(sayilar); // [5, 5, 9, 7, 3, 5, 5, 7]

        // tüm sayılar iterator ile silin
        // iterator sonda

        while (listIterator.hasPrevious()){

            listIterator.previous();
            listIterator.remove();
        }

        System.out.println(sayilar); // []



    }
}

