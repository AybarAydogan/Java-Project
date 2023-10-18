package day29_exceptions_garbageCollector;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) {

        /*
            Birden fazla exception oluşma ihtimalli varsa
            ve bu exception'lar arasında parent child ilişkisi olursa

            once Child, sonra Parent yazılmalıdır

            Tersi yapılırsa
            yani önce Parent yazılırsa
            Parent exception'ın yakalama kapasitesi daha fazla olduğundan
            tüm olası excption'ları yakalayacak
            ve alttaki child exception'a iş kalmayacaktır
            Böyle yazarsak JAva altını çizer
            ve düzeltmemizi ister
         */

        try {

            FileInputStream fis = new FileInputStream("src/day28_expentions/text.txt");


            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }

        }catch (FileNotFoundException e){

            System.out.println("Dosya yolu yanlış");

        } catch (IOException e) {

            System.out.println("Dosya okunamıyor");
        }
    }
}
