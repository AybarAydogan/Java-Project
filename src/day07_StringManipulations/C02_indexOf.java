package day07_StringManipulations;

public class C02_indexOf {

    public static void main(String[] args) {


        String str = "Java candır, Selenium heyecan.";

        // str Selenium içeriyor mu ?

        System.out.println(str.contains("Selenium")); // true

        // str Selenium ile mi bitiyor ?

        System.out.println(str.endsWith("Selenium")); // false

        // str Selenium ile mi başlıyor ?

        System.out.println(str.startsWith("Selenium")); // false

        // peki bu Selenium nerede ?

        System.out.println(str.indexOf("Selenium")); // 13

        // olmayan bir metin aratılırsa

        System.out.println(str.indexOf("x"));  // -1
        System.out.println(str.indexOf('q')); // -1
        System.out.println(str.indexOf("a")); // 1

        // Contains() kullanmadan str'in java içerip içermediğini yazdırın

        if (str.indexOf("java") == -1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

        // str'daki ilk a harfinin index'ini yazdırın
        System.out.println(str.indexOf("a")); // 1

        // str'daki ikinci a harfinin index'ini yazdırın

        System.out.println(str.indexOf("a", 2)); // 3

        // str'dadki 3. a harfinin index'ini yazdırın

        System.out.println(str.indexOf("a", 4)); // 6

        // str'da 4. a varsa index'ini yazdırın
        // yoksa "str sadece 3 tane a içerir" yazdırın

        if (str.indexOf("a",7) == -1){
            System.out.println("str sadece 3 tane a içeriyor");
        }else{
            System.out.println("4.a'nin index'i : " + str.indexOf("a",7)); // 4.'nın index'i: 27
        }

        // str'da 5. a varsa index'ini yazdırın
        // yoksa "str sadece 4 tane a içerir" yazdırın

       if ( str.indexOf("a",28)== -1){
           System.out.println("str sadece 4 tane a içeriyor");
       }else{
           System.out.println("5.a'nin index'i : " + str.indexOf("a",28));
       }
    }
}
