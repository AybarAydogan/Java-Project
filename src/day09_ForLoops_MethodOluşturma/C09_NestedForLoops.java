package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C09_NestedForLoops {
    public static void main(String[] args) {

          /*
         kullanıcıdan satır ve sutun sayısını alıp
          aşağıdak gibi *'lardan oluşan bir şekil yazdırın

          1
          1 2
          1 2 3
          1 2 3 4
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satir = scanner.nextInt();

        // uçgen şekiller içinde nested for loop kullanılır
        // dikdörtgenden farkı, sutun nosuna ihtiyacımız yoktur
        // her satırdaki sutun sayısı o satırın nosu ile aynıdır


        for (int i = 1; i <= satir; i++) { // satır

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");

        }
    }

}
