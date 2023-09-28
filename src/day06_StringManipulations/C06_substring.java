package day06_StringManipulations;

public class C06_substring {

    public static void main(String[] args) {

        String str = "Java en güzel programlama dili";


        System.out.println(str.substring(5)); // en güzel programlama dili

        System.out.println(str.substring(0)); // Java en güzel programlama dili

        System.out.println(str.substring(1)); // ava en güzel proramlama dili

        // son 4 karakteri yazdırın

        System.out.println(str.substring(str.length()-4)); // dili


        // metinden sadece Java^'yi yazdırın

        System.out.println(str.substring(0,4));

        // 0.index'den başla 4 karakter yazdır
        // veya 0.index(dahil) ile 4.index(hariç) arası.

        // cumledeki 2.space'in index'i 7 ise
        // 2.space'den sonraki 5 harfi yazdırın

        System.out.println(str.substring(8,13)); //güzel

        System.out.println(str.substring(0, 1)); // J 0.index'deki karakteri
        System.out.println(str.substring(3,4)); // a 3.index'deki karakteri

        // 6.index'deki harfi String olarak kaydedin

        String index6dakiHarf = str.substring(6,7);
        System.out.println(index6dakiHarf); // n


        System.out.println("baş indexi ve btiş indexi ayni olursa" + str.substring(5,5)+"---"); // ""


       // System.out.println(str.substring(5,2)); // StringIndexOutOfBoundsException: Range [5, 2) out of bounds for length 30


    }
}
