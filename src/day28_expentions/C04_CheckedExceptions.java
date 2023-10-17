package day28_expentions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {
    public static void main(String[] args) throws FileNotFoundException {

        /*
            Check Exceptions daha çok dosya okuma
            veya dosya'ya bilgi kaydetme ile ilgilidir
            java'da bu işlemlere input/output dendiğinden
            exception olarak IOException ve child class'ları oluşturulmuştur
         */

        String dosyaYolu = "src/day28_expentions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);

        /*
         Unhandled exception: java.io.FileNotFoundException

         CheckedExceptions kod çalışmadan riskli olan kodlarda bizi uyarır
         bu konuda inisiyatif bizdedir

         1- istersek bu satırı try-catch ile handle eder ve
            exception oluşsa da yoluna devam etmesini sağlarız

         2- veya exception oluştuğunda kodun durmasını istiyorsak
            sadece altındaki kırmızı çzgünün gitmesini ve çalışmasını istiyorsak
            method deklarasyonunun yanına
            bu riskin farkında olduğumuzu ve bu method'un
            belirtilen exception'ı fırlatabilceğini yazarız
         */






    }
}
