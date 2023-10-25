package day33_MapUpdate_EntryKullanımı;

import day32_Maps.MapMethodDepo;

import java.util.Map;

public class C06_EntryIleIsimUpdate {
    public static void main(String[] args) {

        // Tüm listeyi gözden geçirerek
        // isimleri ilk harfi büyük, sonraki harfler küçük olacak şekilde
        // update eden bir method oluşturun

        Map<Integer,String> ogrenciMapi = MapMethodDepo.okulMapDondur();

      ogrenciMapi = MapMethodDepo.isimDuzenle(ogrenciMapi);

        System.out.println(ogrenciMapi);

        // {
        // 101=Ali-Can-11-H-MF,
        // 102=Veli-Cem-10-K-TM,
        // 103=Ali-Cem-11-K-TM,
        // 104=Ayse-Can-10-H-MF,
        // 105=Sevgi-Cem-11-M-TM,
        // 106=Sevgi-Can-10-K-MF,
        // 107=Esra-Han-11-M-SOZ,
        // 108=Azim-Kan-12-L-SOZ,
        // 109=Huseyin-Fan-12-H-MF,
        // 110=Azim-Kayisi-11-K-TM
        // }


    }
}
