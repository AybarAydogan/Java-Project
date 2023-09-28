package day04_İfStatements;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class C06_İfElseStatements {
    public static void main(String[] args) {

        // soru 5- kullanıcandan bir harf isteyin girlen karakter,
        //         kuçuk harf ise onu buyuk harf olarak yazdırın,
        //         yoksa girilen karakteri yazdırın

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");

        char krk = scanner.next().charAt(0);

       if (krk >= 'a' && krk <= 'z'){
           System.out.println(Character.toUpperCase(krk));

        }else{
           System.out.println(krk);
       }










    }
}
