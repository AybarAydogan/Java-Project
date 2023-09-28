package day05_NestedİfElse_Ternary_Switch;

import java.util.Scanner;

public class C09_SwitchStatements {
    public static void main(String[] args) {

        // kulanıcının girdiği gün numarasına göre
        // gün isimlerini yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen gün numarasını giriniz");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4 :
                System.out.println("Perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("yanlış gün numarası");
        }

    }
}
