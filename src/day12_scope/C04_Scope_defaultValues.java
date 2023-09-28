package day12_scope;

public class C04_Scope_defaultValues {
    String str = "Java";
    String str2;
    int sayi = 23;
    int sayi2;

    static boolean bl = true;
    static boolean bl2;
    static char chr = 'a';
    static char chr2;

    public static void main(String[] args) {

        String metin;

        // System.out.println(metin);

        // System.out.println(str);
        //  System.out.println(sayi);
        System.out.println(bl); // true
        System.out.println(bl2); // false
        System.out.println(chr); // a
        System.out.println(chr2); // hiçlik
        // staticOlmayanMethod();
        // non-static method staticOlmayanMethod() cannot be referenced from a static context
        // static olan main method içerisinden static olmayan bir method direkt ÇAĞIRILAMAZ

        // static method'llar içerisinden
        // static olmayan class uyelerine ulaşmak istersek
        // obje oluşturmamız gerekir

        C04_Scope_defaultValues obj = new C04_Scope_defaultValues();
        obj.staticOlmayanMethod();

    }
    /*
         Local variable'lar değer atamadan oluşturulabilir
         ANCAK değer atanmadan KULLANILAMAZ

         class level varaible'lar ise
         ister static olsun, ister static olmasın
         değer atamadan oluşturulabilir
         VE değer atanmadan da KULLANILABİLİR

         class level varaible'lara biz değer ATAMAZSAK
         Java defualt olarak belirlediği değerleri ATAR

         Defualt Java değerleri

         char ==> hiçlil
         boolean ==> false
         sayısal primitive'ler ==> 0
         non-primitive'ler için ==> null
     */

    public void staticOlmayanMethod() {
        System.out.println(str); // Java
        System.out.println(str2); // null
        System.out.println(sayi); // 23
        System.out.println(sayi2); // 0




    }
}

