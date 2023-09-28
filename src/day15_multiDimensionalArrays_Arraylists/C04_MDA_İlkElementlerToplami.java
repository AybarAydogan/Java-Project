package day15_multiDimensionalArrays_Arraylists;

public class C04_MDA_İlkElementlerToplami {
    public static void main(String[] args) {

        // verilen bir MDA'de
        // her inner array'in ilk elementlerinin toplamı
        // bize döndüren bir method oluşturun

        int[][] arr = {{1,4,7},{3,5},{1,9,0,8},{5,2}};

        System.out.println("ilk elementler toplamı : " + ilkElemenlarToplami(arr));

    }

    public static int ilkElemenlarToplami(int[][] arr){

        // tüm elemanlara ihtiyaçımız yok
        // for loop inner array'leri getirirse, biz o inner array'in ilk elemanını alırız
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) { // arr[0], arr[1], arr[2], arr[3],

           toplam += arr[i][0];

        }
        return toplam;
    }
}
