package day15_multiDimensionalArrays_Arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_ArraydekiTekrarEdenElementleriSilme {
    public static void main(String[] args) {

        // verilen bir in array'de,
        // tekrar eden elementleri silip,
        // array'i her elementin unique olduğu bir hale getirin

        int[] arr = {3,5,6,7,3,6,8,4,2,9,0,1};

        // bir list oluşturalım
        List<Integer> uniqueList = new ArrayList<>();

        // array'in tüm elemanlarını tek tek ele alalım
        //  liste'de olup olmadığına bakalım, listede yoksa ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!uniqueList.contains(arr[i])){

                uniqueList.add(arr[i]);
            }
        }
        System.out.println("Unique list : " + uniqueList);
        // Unique list : [3, 5, 6, 7, 8, 4, 2, 9, 0, 1]

        // yeni bir array oluşturalım
        int[] yeniArr = new int[uniqueList.size()];
        System.out.println(Arrays.toString(yeniArr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        // listede'ki elementleri yeni array'e atıyalım

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = uniqueList.get(i);

        }

        // yeni array'i de eski array'e değer olarak atayalım

        arr = yeniArr;

        Arrays.sort(arr);
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        // Array'in son hali : Array'in son hali : [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
