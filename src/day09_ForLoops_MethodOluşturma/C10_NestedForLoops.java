package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C10_NestedForLoops {
    public static void main(String[] args) {

         /*
         kullanıcıdan satır ve sutun sayısını alıp
          aşağıdak gibi *'lardan oluşan bir şekil yazdırın

          *
          * *
          * * *
          * * * *
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satır

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");

        }
    }

}
