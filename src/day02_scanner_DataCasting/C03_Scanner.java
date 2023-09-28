package day02_scanner_DataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // soru 5- kullanıcıdan ismini, soyisimini ve yaşını alıp aşağıdaki formatta yazdırın.
        //         girilen bilgiler : J Doe,44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen isiminizi giriniz");
        char İlkHarf = scanner.nextLine().charAt(0);

        System.out.println("Lütfen soyisiminisi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        int yaş = scanner.nextInt();

        System.out.println("girilen bilgiler : "  + İlkHarf + " "+soyisim+" , "+yaş) ;


    }
}
