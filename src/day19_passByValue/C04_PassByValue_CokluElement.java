package day19_passByValue;

import java.util.Arrays;
import java.util.Random;

public class C04_PassByValue_CokluElement {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        System.out.println("arr ilk hali : " + Arrays.toString(arr));

        elemanlari2Artir(arr);

        System.out.println("Elemanları artır method call'dan sonra arr : " + Arrays.toString(arr));

        arrayidegistir(arr);

        System.out.println("array'i değiştir method call'dan sonra arr : " + Arrays.toString(arr));
    }


    public static void elemanlari2Artir(int[] arr ){

        // array'in tüm elementlerini 2 artırıp
        // yeni halini yazdırsın

        for (int i = 0; i < arr.length; i++) {

            arr[i] +=2;
        }

        System.out.println("Eleman artır method'unda değiştirilen arr : " + Arrays.toString(arr));
    }


    public static void arrayidegistir(int[] arr ){

        // yeni 3 elemanlı bir array oluşturup
        // içine rastgele 100'den küçük sayılar koyun
        // array'e bu yeni değeri atayın
        // ve arr'yi yazdırın

        int[] yeniArr = new int[3];
        Random rnd = new Random();

        for (int i = 0; i < yeniArr.length; i++) {

            yeniArr[i] = rnd.nextInt(100);
        }

        arr = yeniArr;

        System.out.println("Array'i değiştir method'unda arr : " + Arrays.toString(arr));


    }
}
