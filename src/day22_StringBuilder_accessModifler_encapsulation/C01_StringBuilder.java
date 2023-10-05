package day22_StringBuilder_accessModifler_encapsulation;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Candır");

        sb.reverse();

        System.out.println(sb); // rıdnaC avaJ

        sb.reverse();

        System.out.println(sb); // Java Candır

        StringBuilder sb2 = new StringBuilder("Java Guzeldir");

        StringBuilder sb3 = new StringBuilder("Hava Guzel");

        StringBuilder sb4 = new StringBuilder("Ne bu simdi?");

        StringBuilder sb5 = new StringBuilder("Java Candır");


        System.out.println(sb.compareTo(sb2)); // -4
        System.out.println(sb.compareTo(sb3)); // 2
        System.out.println(sb.compareTo(sb4)); // -4
        System.out.println(sb.compareTo(sb5)); // 0


        System.out.println(sb.equals(sb5)); // false

        /*
             StringBuilder esitligini anlamak icin equals() kulanılmaz
             Eger 2 StringBuilderin aynı oldugunu kontrol etmek istersek
             sb1.compareTo(sb2) yazarız
             sonuc olarak bize 0 dondururse iki SB aynıdır

             aynı degilse bastan konrol ederek ilerler
             ve buldugu farkları harfler arasında (ascii table) kac sayı oldugunu dondurur

             Bir String bir StringBuilder karsılastırıla bilir mi ?
         */


       /*
              Bir String bir StringBuilder karsılastırıla bilir mi ?

              java da farklı non-primitive datalar == ile karsılastırılamaz

              bir String ile bir StrinBuilder i
              equals() ile karsılastırmanıza java CTE vermez
              AMMA metinler aynı olsa bile bize false döndürür
        */

        String str = "Java Candır";

        // System.out.println(str == sb);
        // Operator '==' cannot be applied to 'java.lang.String', 'java.lang.StringBuilder'

        System.out.println(str.equals(sb)); // false

        sb.replace(0,4,"Hava");

        System.out.println(sb); // Hava Candır


    }
}
