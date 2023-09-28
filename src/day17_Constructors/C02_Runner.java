package day17_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_Runner {

    public static void main(String[] args) {

        C01 obj = new C01();
        System.out.println(obj.sayi);

        // bana rastgele bir sayı lazım
          obj.rastgeleSayiUret();
          // Bugün kü şanslı sayi : 898

        // Bugün ne yemek pişirsem ?
        obj.bugunNePisireyim();
        // Bugünün yemek teklifi : Makarna

        Scanner scanner = new Scanner(System.in);
        String str = new String("Java Candır");
        List<Integer> sayilar = new ArrayList<>();

              C01         obj2          =              new            C01();
        // Class adı     obje adı    atama işareti   keyword       Constructor

        /*
            Constructor b,r clas'dan obje oluşturmak istediğimizde
            o objeye oluşturulduğu class'daki variable ve methodlarla ilgili
            ilk atamayı(initialize) yapan yapıdır


         */


    }
}
