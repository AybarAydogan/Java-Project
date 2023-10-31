package day34_NestedMaps;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class C04_Maps {
    public static void main(String[] args) {

        // Soru : Verilen bir array’de kullanilan sayilari
        //        ve kacar defa kullanildigini yazdirin.
        //
        // Input : {1,2,3,4,5,3,4,2,5,1,3,2,4,1}
        // output : 1 kullanimi : 3 adet
        // 2 kullanimi : 3 adet
        // 3 kullanimi : 3 adet
        // 4 kullanimi : 3 adet
        // 5 kullanimi : 2 adet

        int[] input = {1, 2, 3, 4, 5, 3, 4, 2, 5, 1, 3, 2, 4, 1, 6};

        // bir map oluşturalım
        // key array'deki sayılar olsun
        // value kullanım miktarları olsun

        Map<Integer, Integer> kullanimMiktariMap = new TreeMap<>();

        // {1, 2, 3, 4, 5, 3, 4, 2, 5, 1, 3, 2, 4, 1, 6};

        for (Integer each : input
        ) {
            // map'i kotrol edeceğim
            // bizim oğlanın getirdiği sayı map'de yoksa, kullanım adedi = 1 olarak ekleyelim

            if (!kullanimMiktariMap.containsKey(each)) {

                kullanimMiktariMap.put(each, 1);
            } else {


                // bizim oğlanın getirdiği sayı map'de varsa, kullanım adedini 1 olarak artıralım

                Integer eskiKullanimMiktari = kullanimMiktariMap.get(each);

                kullanimMiktariMap.put(each, eskiKullanimMiktari + 1);
            }
        }

        System.out.println(kullanimMiktariMap); // {1=3, 2=3, 3=3, 4=3, 5=2, 6=1}




        /*

        Arrays.sort(input); // [1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 6]

        int sayilanSayi;
        int sayac = 0;

        for (int i = 0; i < input.length-1; i++) {

            sayilanSayi = input[i];

            if (input[i + 1] == input[i]) {
                sayac++;
            } else {
                sayac++;
                System.out.println(sayilanSayi + " : " + sayac + " adet");
                sayac = 0;
            }

        }

        if (input[input.length-1] == input[input.length-2]){
            System.out.println(input[input.length-1] + " : " + (sayac+1)+ " adet");
        }else {
            System.out.println(input[input.length-2] + " : " + (sayac+1)+ " adet");
            System.out.println(input[input.length-1] + " : " + (sayac+1)+ " adet");
        }

         */

    }
}
