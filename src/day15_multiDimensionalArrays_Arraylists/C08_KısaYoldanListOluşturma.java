package day15_multiDimensionalArrays_Arraylists;

import java.util.ArrayList;
import java.util.List;

public class C08_KısaYoldanListOluşturma {
    public static void main(String[] args) {

        int[] arr = {3,5,6,7,3,6,8,4,2,9,0,1};

        // yukaridaki elementlerin olduğu bir arraylist oluşturun

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println(sayilar); // [3, 5, 6, 7, 3, 6, 8, 4, 2, 9, 0, 1]








    }
}
