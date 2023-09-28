package day02_scanner_DataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {
        int sayıINT = 34;
        String str = "Java Candır";
        boolean bl = true;
        char chr = '%';
        double dbl = 4.5;
        byte byt = 10;
        short shrt = 23;

        // Data casting : bir data türündeki variable 'a başka data türünden değer atamaya denir

        // bl = sayıINT ;
        // bl = str ;
        // bl = chr;
        // boolean data türündeki bir variable 'a sadece boolean değerler  atayabilirsiniz

        // str = sayıİnt;
        // str = bl;
        // str = chr;

        // sayısal değerler alan variable'a başka sayısal data türlerinde ki değerler ATANABİLİR Mİ?

        dbl = sayıINT;
        dbl = byt;
        dbl = shrt;
        dbl = chr;

        //sayıINT = dbl;
        sayıINT = shrt;
        sayıINT = byt;
        sayıINT = chr;

        // shrt = dbl;
        // shrt = sayıİnt;
        shrt = byt;
        // shrt = chr;


    }
}
