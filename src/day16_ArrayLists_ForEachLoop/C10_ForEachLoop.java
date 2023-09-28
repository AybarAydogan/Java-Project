package day16_ArrayLists_ForEachLoop;

public class C10_ForEachLoop {
    public static void main(String[] args) {

       /*
          For-each loop
          birden fazla eleman bulunduran
          array ve list gibi yapılarla çalışmak üzere hazrıalnmıştır.

          1'den 100'e kadar sayıları toplama,
          sayı 50'den küçük olduğu mudedetce...yapma
          gibi işlemler için uygun değildir

          for each loop
          birden fazla eleman barındıran yapılardaki elementleri
          hiç bir sıralama şartı olmadan ve index kullanmadan
          BİZE GETİRİR

          for-each loop'da 3 şeyi yazmalıyız
          1-çalışacağımız elementlerin data türü
          2- loop içinde gelen elemanları hangi isimle kullanıcaz (array'de arr[i])
          3- üzerinde işlem yapacağımz çok elementli obje
               */
        int[] arr = {2, 5, 7, 9, 0};

        // array'in tüm elementlerini yazdırın

        for (int each : arr
        ) {
            System.out.print(each + " ");
        } //2 5 7 9 0

        System.out.println("");

        // array'deki tüm elemanları toplayın
        int toplam = 0;
        for (int w : arr
        ) {
            toplam += w;
        }
        System.out.println("Elementlerin toplamı : " + toplam);
        // Elementlerin toplamı : 23


        // array'Deki çift sayıların çarpımını yazdırın
        int carpim = 1;
        for (int each : arr
        ) {
            if (each % 2 == 0) {
                carpim *= each;
            }
        }

        System.out.println("Çarpım sonuçu : " + carpim); // Çarpım sonuçu : 0

    }
}