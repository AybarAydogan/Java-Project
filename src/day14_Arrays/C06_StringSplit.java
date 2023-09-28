package day14_Arrays;

import java.util.Arrays;

public class C06_StringSplit {

    public static void main(String[] args) {

        String str = "Yaklaşık 173.000.000 sonuç bulundu (0,38 saniye) ";

        // arama sonuç sayısının 1 milyondan çok olduğunu test edin

        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Yaklaşık, 173.000.000, sonuç, bulundu, (0,38, saniye)]

       int sonucSayisi = Integer.parseInt(kelimeler[1].replaceAll("\\D",""));

        System.out.println(sonucSayisi); // 173000000

        String[] ayirace = str.split("e");

        System.out.println(Arrays.toString(ayirace)); // [Yaklaşık 173.000.000 sonuç bulundu (0,38 saniy, ) ]

        String[] ayiracHiclik = str.split("");
        System.out.println(Arrays.toString(ayiracHiclik));
        // [Y, a, k, l, a, ş, ı, k,  , 1, 7, 3, ., 0, 0, 0, ., 0, 0, 0,  , s, o, n, u, ç,  , b, u, l, u, n, d, u,  , (, 0, ,, 3, 8,  , s, a, n, i, y, e, ),  ]

        String[] ayiracNokta = str.split(",");

        System.out.println(Arrays.toString(ayiracNokta));
        // [Yaklaşık 173.000.000 sonuç bulundu (0, 38 saniye) ]


    }
}
