package day02_scanner_DataCasting;

public class C06_ExplicitlyNarrowing {
    public static void main(String[] args) {

        int sayi = 20;

        byte byt = (byte) sayi;
        System.out.println("20'nin byte karşılığı : "  + byt);

        // 20'nin byte karşılığı : 20

        sayi = 130;
        byt = (byte) sayi;
        System.out.println("130'un byte karşılığı : "  + byt);
        //130'un byte karşılığı : -126

        sayi = 256;
        byt = (byte)sayi;
        System.out.println("256'un byte karşılığı : "  + byt);
        //  256'un byte karşılığı : 0



        sayi = 567;
        byt = (byte)sayi;
        //  567'nin byte karşılığı : 55



        sayi = 640;
        byt = (byte)sayi;
        System.out.println("640'ın byte karşılığı : "  + byt);
        //  640'ın byte karşılığı : -128


        double dbl = 34.7;
        sayi = (int)dbl;
        System.out.println("34.7 nin int değeri  :  "  + sayi);
        // 34.7 nin int değeri : 34


      /*

        String str = (String)sayi;
        explicit casting her data türü için çalışmaz
        biz şimdilik sayisal primitive data türlerinden
        geniş değeri dar kapsamlı variable'a atamak için kullanıyoruz

        Non-primitive data türlerinde de olur ancak parent-child class'lar arasında geçerlidir

       */



    }
}
