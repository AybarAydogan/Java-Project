package day09_ForLoops_MethodOluşturma;

import java.util.Scanner;

public class C11_NestedForLoops {
    public static void main(String[] args) {

           /*
         kullanıcıdan satır ve sutun sayısını alıp
          aşağıdak gibi *'lardan oluşan bir şekil yazdırın

          1
          2 4
          3 6 9
          4 8 12 16
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısını giriniz");
        int satir = scanner.nextInt();

        for (int i = 1; i <= satir; i++) { // satır

            for (int j = 1; j <= i; j++){
                System.out.print(i*j + " ");
            }
            System.out.println("");
        }

    }
}
