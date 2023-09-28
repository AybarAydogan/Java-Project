package day09_ForLoops_MethodOluşturma;

public class C06_NestedForLoops {
    public static void main(String[] args) {

        // 1 2 3 4 yaxdırın

        for (int i = 1; i <= 4; i++) {
            System.out.print(i + " ");

        }
        System.out.println("");

        // 2 4 6 8 yazdırın

        for (int i = 1; i <= 4; i++) {
            System.out.print(2 * i + " ");

        }
        System.out.println("");

        //3 6 9 12 yazdırın

        for (int i = 1; i <= 4; i++) {
            System.out.print(3 * i + " ");

        }
        System.out.println("");

        /*
         bu tur tekrar eden işlemleri NESTED(içiçe) For-Loop ile yapabiliriz.
         Yukarıda 3 kez aynı loop'u çalıştırdık (satır sayısı kadar)
         1 2 3 4
         2 4 6 8
         3 6 9 12
         aralarında tek fark 1*i, 2*i, 3*i

         */
        System.out.println("=================");

        for (int i = 1; i <= 3; i++) { // outer(dış) loop satırları kontrol eder

            for (int j = 1; j <= 4; j++) { // inner(iç) loop sütünları kontrol eder

                System.out.print(i * j + " ");
            }
            System.out.println("");
        }

    }
}
