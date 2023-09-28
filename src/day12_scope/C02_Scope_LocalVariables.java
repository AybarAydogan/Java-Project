package day12_scope;

public class C02_Scope_LocalVariables {

    /*
    bir method/kod blogu içerinde oluşuturulan variable'lara local variable denir
    ve local variable'ların scopee'u içerisinde oluşturuldukları kod blogudur.


   loop'lar dabağımsız kod bloklarıdır
   loop içerisinde oluşturulan variable'ların scope'u
   içerisinde oluşturuldukları kod blogu olan loop ile sınırlıdır
   yani loop içerisinde oluşturulan local variable'lar
   loop dışında KULLANILAMAZ

     */
    public static void main(String[] args) {

        int sayi = 20;
        // System.out.println(str);
        // System.out.println(bl);

        String s = "Hava";

        for (int i = 0; i < 10; i++) {

            System.out.println(i);
            String str = "Java";
            str += i;
            s += i;

        }
        // System.out.println(str);
        // System.out.println(i);
        System.out.print(s);
    }


    public static void staticMethod() {
        // System.out.println(sayi);
        String str = "Java";
        // System.out.println(bl);

    }


    public static void statikOlmayanMethod() {
        // System.out.println(sayi);
        // str = "Tava";
        boolean bl = true;
    }
}
