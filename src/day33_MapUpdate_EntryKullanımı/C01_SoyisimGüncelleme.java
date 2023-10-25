package day33_MapUpdate_EntryKullanımı;

import day32_Maps.MapMethodDepo;

import java.util.Map;

public class C01_SoyisimGüncelleme {
    public static void main(String[] args) {

        // öğrenci numarası verilen elemanın,
        // soyismini verilen yeni değer olarak update edin

        Map<Integer, String> ogrenciMap = MapMethodDepo.okulMapDondur();

       ogrenciMap = MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap,103,"Çelik");

        System.out.println(ogrenciMap.get(103)); // Ali-Çelik-11-K-TM

        ogrenciMap = MapMethodDepo.numaraIleSoyisimUpdate(ogrenciMap, 105, "Kanki");

        System.out.println(ogrenciMap.get(105)); // Sevgi-Kanki-11-M-TM

    }
}
