package day04_İfStatements;

import java.util.Scanner;

public class C04_İfEkseStatements {
    public static void main(String[] args) {


        // soru 1- kullanıcıdan bir ucgenin 3 kenar uzunluğu alın,
        //         ucgen eşkanar ise "eşkanar ucgen" yazdırın,
        //         değilse "eşkanar değil " yazdırın.



        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ucgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();


        if (kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("eşkenar ucgen");
        }else {
            System.out.println("eskaner değil");
        }











    }
}
