package day06_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {

        String str = "Java gün geçtikce güzelleşiyor";

        // ilk harfi yazdırın
        System.out.println(str.charAt(0)); // J


        System.out.println(str.charAt(4)); // space

        // str'da 31 karakter var
        // son karakter .'nin indeksi 30 olur

        // son karakteri yazdırın
        System.out.println(str.charAt(31-1)); // .

        // sondan 5. karakteri yazdırın
        System.out.println(str.charAt(31-5)); // i

        //  System.out.println(str.charAt(44)); // StringIndexOutOfBoundsException
    }
}
