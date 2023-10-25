package day33_MapUpdate_EntryKullanımı;

import day32_Maps.MapMethodDepo;

import java.util.Map;

public class C03_SinifUpdate {
    public static void main(String[] args) {

        // yıl sonunda alıştırılmak üzere
        // tüm ğrencileri bir üst sınıfa çıkartan method oluşturun
        // 12.sınıftaki öğrencilerin sınıf bilgisi olarak mezun yazın

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

       ogrenciMap = MapMethodDepo.yilSonuSinifArtir(ogrenciMap);

        System.out.println(ogrenciMap);

        //{
        // 101=Ali-Can-12-H-MF,
        // 102=Veli-Cem-11-K-TM,
        // 103=Ali-Cem-12-K-TM,
        // 104=Ayse-Can-11-H-MF,
        // 105=Sevgi-Cem-12-M-TM,
        // 106=Sevgi-Can-11-K-MF,
        // 107=Esra-Han-12-M-SOZ,
        // 108=Azim-Kan-Mezun-L-SOZ,
        // 109=Huseyin-Fan-Mezun-H-MF,
        // 110=Azim-Kayisi-12-K-TM
        // }

    }
}
