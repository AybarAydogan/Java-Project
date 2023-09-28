package day11_whileLoop_dowhileLoop;

public class C08_DoWhileLoop {

    public static void main(String[] args) {

        /*
        While loop'u kullanıcıdan değer alınan
        ve/veya  tekrar sayısı belli olmayan durumlarda kullanmayı tercih ediyoruz

        while loop'un 2 tane negatif yönü vardır
        1- loop öncesinde başlangıç değerini bizim atamamız gerekir
           kullanıcıdan değeri loop içinde alırız
           eğer ilk değer atamasında dikkat edilmezse
           hatalı bir değer atanabilir ve bu durumda loop calısmayabilir

       2- kotnrol işlemi başta yapılır, body sonradan çalıştığı için
          kontrol işlemi hep bir fazla yapılır

         */

        int sayi = 5;

        // verilen sayı ile 3(hariç) arasındaki sayıları yazdırın

        while (sayi > 3){

            System.out.println(sayi + " ");
            sayi--;
        }

        // Java özellikle kullanıcıdan feğer alırken
        // ilk değeri yanlış atamamamız için
        // bir alternatif olarak do-while loop'u oluşturmuştur
        // do-while loop'da önce işlem yapılır sonra kontrol edilir


         sayi = 5;

        // verilen sayı ile 3(hariç) arasındaki sayıları yazdırın

        do {

            System.out.println(sayi + " ");
            sayi--;
        }while (sayi > 3);
    }
}
