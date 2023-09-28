package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C08_NestedForLoops {
    public static void main(String[] args) {

        /*
         kullanıcıdan satır ve sutun sayısını alıp
          aşağıdak gibi *'lardan oluşan bir şekil yazdırın

          1 1 1 1 1
          2 2 2 2 2
          3 3 3 3 3
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satir = scanner.nextInt();

        System.out.println("Sutun sayısını giriniz");
        int sutun = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satır

            for (int j = 1; j <= sutun; j++) { // sütün

                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
