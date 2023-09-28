package day10_MethodOluşturma_MethodOverloading;

public class C06_AsalSayilariBulma {
    public static void main(String[] args) {

        // bir önceki class'da oluşturulan method'u kullanarak
        // 3 basamaklı sayılardan asal olanları yazdırın

        for (int i = 100; i < 1000; i++) {

          if (C05_AsalSayiMiDondur.asalMiDondur(i)){
              System.out.print(i + " ");

          }

        }


        // 4 basamaklı kaç tane asal sayı var ?
        System.out.println("");
        int sayac = 0;

        for (int i = 1000; i <10000 ; i++) {

            if (C05_AsalSayiMiDondur.asalMiDondur(i)){
                sayac++;
            }

        }
        System.out.println("4 basamaklı sayılardaki asal sayi adedi : " + sayac );
    }
}
