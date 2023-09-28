package day04_İfStatements;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {


        // soru 4- kullanıcıdan bir ucgenin 3 kenar uzunluğunu alın ,
        //         ucgen eşkenar ile "eşkanr ucgen" yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ucgenin kenar uzunluklarını giriniz");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        // Java 2'li karşılaktırmaları kabuk eder
        // daha fazla karşılaştırmaya ihtiyaç varsa
        // mantıksal operatorler kullanılarak şartlar ayrı ayrı yazılıp, birleştirilir

        if (kenar1==kenar2 && kenar2==kenar3 && kenar2>0){
            System.out.println("verilen kenar uzunlukları eş kenar ucgen oluşturunuz " );
            }

















    }
}
