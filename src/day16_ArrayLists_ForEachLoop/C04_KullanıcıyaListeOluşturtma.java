package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanıcıyaListeOluşturtma {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri
        //        bize liste olarak dondurecek bir method olusturun.

        System.out.println(ListeOluştur());
    }

    public static List<String> ListeOluştur() {

        List<String> isimler = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String girilenİsim;

        do {
            System.out.println("Listeye eklemek için bir isim yazın" +
                    "\nVeya işlemi sonlandırmak için Q'ya basın");
            girilenİsim = scanner.nextLine();

            if (!girilenİsim.equalsIgnoreCase("q")) {
                isimler.add(girilenİsim);
            }

        } while (!girilenİsim.equalsIgnoreCase("q"));

        return isimler;

    }


}
