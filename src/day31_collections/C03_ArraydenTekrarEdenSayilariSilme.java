package day31_collections;

import java.util.Arrays;

public class C03_ArraydenTekrarEdenSayilariSilme {
    public static void main(String[] args) {
        // verilen array'den tekrar eden elementleri silip
        // array'i her bir elementin unique olduğu hali ile kaydedin

        int[] arr = {2, 4, 6, 4, 1, 2, 5, 7, 9, 4, 5, 7, 2,6,8,2,1};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [1, 2, 2, 2, 4, 4, 4, 5, 5, 6, 7, 7, 9]

        // 1.yöntem- öne bir forloop ile kaç tane silinecek sayı var bulup
        // sonra boş bir array oluşturup uygun olan elementleri ona taşıyabiliriz

        // 2.yöntem- bir loop ile elemanları gözden geçirip
        // bir öncekine eşit olan element varsa oluşturucağım ayrı bir method'la
        // o elementi silip, arrayi değiştiririm

        // 1.yöntemle yapalım

        int silinecekElemanSayısı = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                silinecekElemanSayısı++;
            }
        }

        int[] yeniArr = new int[arr.length - silinecekElemanSayısı]; // 13-7 = 7 [0, 0, 0, 0, 0, 0, 0)
        int konulacakIndex = 0;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                yeniArr[konulacakIndex] = arr[i];
                konulacakIndex++;

            }
        }

        if (arr[arr.length-1] != yeniArr[yeniArr.length-1]){
            yeniArr[yeniArr.length-1] = arr[arr.length-1];
        }

        arr = yeniArr;
        System.out.println(Arrays.toString(arr));


    }
}
