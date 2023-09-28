package day06_StringManipulations;

public class C05_length {
    public static void main(String[] args) {

        String str = "Java öğren işsiz kalmaz";

        System.out.println(str.length()); // 26

        // sondan 2.karakteri yazdırın

      // System.out.println(str.charAt(26-2)); // z

        str = "Java";
        System.out.println(str.charAt(str.length()-2)); // v

        // kodlamada DİNAMİK kod yazmak önemlidir
        //Dinamik kod inpu'dan bilgileri alıp,
        // input değişse bile çalışmaya devam eden kod demektir.


        // metni son karakterini yazdırın

        System.out.println(str.charAt(str.length()-1)); // a

        str = "Java güzeldir";

        System.out.println(str.charAt(str.length()-1)); // .


    }
}
