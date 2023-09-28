package day05_NestedİfElse_Ternary_Switch;

import java.util.Scanner;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        /* b
        büyük olmayan demekle kuçuk olan demek farklıdır
        çünkü 9 ve 9 verildiğinde büyük olmayan 9
              9 ve 9 verildiğinde küçük olan ????

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen iki sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();


        System.out.println(sayi1 > sayi2 ? sayi2 : sayi1);

    }
}
