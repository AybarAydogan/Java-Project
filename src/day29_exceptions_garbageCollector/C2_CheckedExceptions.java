package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C2_CheckedExceptions {
    public static void main(String[] args) throws Exception {

        /*
           Eğer birden fazla exception oluşma ihtimali varsa
           ve biz try-catch yerine throws keyword kullanmak istiyorsak
           en geniş yakalama kapasitesi olan ( en ince elek aralığı olan)
           parent exception'ı yazmamız yeterli olucaktır
         */

        FileInputStream fis = new FileInputStream("src/day28_expentions/text.txt");

        int k=0;
        while((k= fis.read() ) != (-1)) {
            System.out.print((char) k);
        }
    }
}
