package day06_StringManipulations;

public class C02_equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "java";
        String str3= "Java";
        String str4 = new String("Java");
        String str5 = "Ja" + "va";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6+str7;


        // equals () String'lerin case sensitive olarak eşitliğini kontrol eder

        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str8)); // true

        /* bugune kadar karşılaştırmalara hep == ile yapmıştık
        ancak non-primitive data türleri için == sağlıklı çalışmaz
        ilerde Strig pool konusunda aşagıdaki =='lerin
        bazılarının true bazılarının false vermesinin sebebini öğreneceğiz

        ŞİMDİLİK
        equals() String'leri karşılaştırırken sadece metinlere bakar,
        == ise hem metinlere, hem de referanslara bakar,
        bundan dolayı aynı metni alsa bile bazen true. bazen false verir.
         */

        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // true
        System.out.println(str1 == str4); // false
        System.out.println(str1 == str5); // true
        System.out.println(str1 == str8); // false

    }
}
