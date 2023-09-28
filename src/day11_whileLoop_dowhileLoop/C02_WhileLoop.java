package day11_whileLoop_dowhileLoop;

public class C02_WhileLoop {

    public static void main(String[] args) {

        // 1'den 10'a kadar olan sayıları yazdırın

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }


        // soruyu while loop ile yapmak istersek
        // while loop'da
        //       -loop içinde kullanılacak variable,
        //       - bitiş şartı
        //       - artış/azalış yöntemini bizim yazmamız gereklidir

        int sayi = 1;
        while (sayi <= 10) {
            System.out.println(sayi + " ");
            sayi++;
        }

        //for loop ile yapılabilecek bir işlem
        // for loop ile yapmak tercih edilir
    }
}
