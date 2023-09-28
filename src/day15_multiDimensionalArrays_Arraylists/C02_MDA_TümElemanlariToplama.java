package day15_multiDimensionalArrays_Arraylists;

public class C02_MDA_TümElemanlariToplama {
    public static void main(String[] args) {

        // verilen bir MDA'deki tüm sayıları toplayıp, toplamı yazdıran bir method oluşturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{2}};
        arraydekiElememtleriTopla(arr); // Array'deki tüm sayıların toplamı : 40
        arraydekiElememtleriTopla(new int [][]{{4,6,7}}); // Array'deki tüm sayıların toplamı : 17

    }

    public static void arraydekiElememtleriTopla(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                toplam += arr[i][j];
            }
        }
        System.out.println("Array'deki tüm sayıların toplamı : " + toplam);




    }
}
