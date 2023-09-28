package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C11_ArrayListeCevirme {
    public static void main(String[] args) {

        Integer[] arr = {3,5,6,7,3,6,8,4,2,9,0,1};
        List<Integer> sayilar = new ArrayList<>();

        for (Integer each:arr
             ) {
            sayilar.add(each);
        }

        System.out.println("Liste : " + sayilar); // Liste : [3, 5, 6, 7, 3, 6, 8, 4, 2, 9, 0, 1]

    }
}
