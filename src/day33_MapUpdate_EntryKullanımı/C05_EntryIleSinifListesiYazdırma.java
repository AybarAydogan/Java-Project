package day33_MapUpdate_EntryKullanımı;

import day32_Maps.MapMethodDepo;

import java.util.Map;

public class C05_EntryIleSinifListesiYazdırma {
    public static void main(String[] args) {

        // verilen sınıf ve şube bilgii ile
        // sınıf listesini numara,isim,soisim olarak yazdıran bir method oluşturun

        Map<Integer,String> ogrenciMapi = MapMethodDepo.okulMapDondur();

        String sinif = "11";
        String sube = "K";

        MapMethodDepo.sinifListesiYazdirma(ogrenciMapi,sinif,sube);

    }
}
