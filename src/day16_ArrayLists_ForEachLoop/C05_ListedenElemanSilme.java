package day16_ArrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C05_ListedenElemanSilme {
    public static void main(String[] args) {

        // Soru 3- Verilen String bir listede
        //        istenmeyen harf iceren elementleri silip,
        //         kalan kismini list olarak bize donduren bir method olusturun

        /*
            Listenin elemanlarını index ile kontrol edip
             silmemiz isteniyorsa
             yaptığımızda aradan bir element çıkarılacağı için
             index bir elemani atlar

             bunu engellemek için
                  - silme yapınca i bir azaltılabilir
                  - verilen listede silme yapılmaz. yeni bir liste oluşturulup
                   silinmeyecek elemanlar yeni listeye eklenebilir

         */

        List<String> isimler = new ArrayList<>();

        isimler.add("Aybar");
        isimler.add("Uğurcan");
        isimler.add("Sibel");
        isimler.add("Buket");
        isimler.add("Halil");
        isimler.add("Elif");
        isimler.add("Aybar");

        String silinecekHarf = "a";

        System.out.println(istenmeyenleriSil(isimler, silinecekHarf));

    }

    public static List<String> istenmeyenleriSil(List<String> isimler, String silinecekHarf) {

        List<String> silinmeyeceklerListesi = new ArrayList<>();

        for (int i = 0; i < isimler.size() ; i++) {

            /*
            if (isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                isimler.remove(isimler.get(i));
                i--;
            }
             */
            if (!isimler.get(i).toUpperCase().contains(silinecekHarf.toUpperCase())){
                silinmeyeceklerListesi.add(isimler.get(i));
            }
        }
        return silinmeyeceklerListesi;

    }
}
