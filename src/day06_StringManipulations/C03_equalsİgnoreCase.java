package day06_StringManipulations;

import java.util.Scanner;

public class C03_equalsİgnoreCase {
    public static void main(String[] args) {

        // kullanıcıdan bir harf isteyin
        // kullanıcı a yazarsa "aile"
        // i yazarsa "Is" yazdırın
        // bu harflerin dışında bir karakter girerse
        // "Buharfi bilmiyorum" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char girilenHarf = scanner.next().charAt(0);

        // kullanıcı küçük veya büyük harf girmiş olailir
        // String'leri büyük küçük harf gözetmeksizin karşılaştırabilriz

        String harf = girilenHarf + "";

        if (harf.equals("a") || harf.equals("A")){
            System.out.println("Aile");
        }else if (harf.equalsIgnoreCase("i")){
            System.out.println("Is");
        }else {
            System.out.println("Bu harfi bilmiyorum");


            // equalsIgnoreCase() küçük-büyük harf önemsemeksizin
            // metinlere bakar,


            String str1 = "Java";
            String str2 = "java";
            String str3= "JAva";
            String str4 = new String("Java");
            String str5 = "JA" + "Va";
            String str6 = "jA";
            String str7 = "vA";
            String str8 = str6+str7;

            System.out.println(str1.equals(str2));  // Java java ==> false
            System.out.println(str1.equalsIgnoreCase(str2)); // true

            System.out.println(str1.equals(str3));  // Java JAva ==> false
            System.out.println(str1.equalsIgnoreCase(str3)); // true

            System.out.println(str1.equals(str4));  // JAVa java ==> false
            System.out.println(str1.equalsIgnoreCase(str4)); // true








        }
    }

}
