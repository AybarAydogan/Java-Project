package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C07_NestedForLoops {
    public static void main(String[] args) {

        /*
          kullanıcıdan satır ve sutun sayısını alıp
          aşağıdak gibi *'lardan oluşan bir şekil yazdırın

          * * * * *
          * * * * *
          * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sutun sayısını giriniz");
        int sutun = scanner.nextInt();

        // satır = 5 sutun = 9

        for (int i = 1; i <= satir; i++) { // satir
            for (int j = 1; j <= sutun; j++) { // sutun

                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
