package day05_NestedİfElse_Ternary_Switch;

import java.util.Scanner;

public class C10_SwitchStatements {
    public static void main(String[] args) {

        // kullanıcıdan gün numarasını alıp
        // hafta içi veya hafta sonu yazdırın


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün numarasını giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta içi");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("yanlış gün numarası");
        }


        /* gün isminim baş harfini alın
        case s || S : OLMAZ
        case s,S : OLMAZ

        case s :
        case S:
         */
    }
}
