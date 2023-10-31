package day34_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_NestedMapOlusturma {
    public static void main(String[] args) {

        //     ogrenciMap.put(101, "Ali-Can-11-H-MF");
        //     ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        //     ogrenciMap.put(103, "Ali-Cem-11-K-TM");

        // Key = 101,  Value = "Ali-Can-11-H-MF"
        // Key = 101,  Value Map olsun  {isim = "Ali,soyisim = Can, sınıf =11, şube = H, bölüm = MF}

        // öğrenci map'i {101 = ogrMap101, 102 = ogrMap102, 103 = ogrMap103}
        Map<Integer, Map<String, String>> ogrenciMap = new HashMap<>(); // Outer Map

        // 101 numaralı öğrenciyi eklemek istersek, once value map'ini oluşturmamız gerekir
        Map<String, String> ogrMap101 = new HashMap<>();

        ogrMap101.put("isim", "Ali");
        ogrMap101.put("soyisim", "Can");
        ogrMap101.put("sınıf", "11");
        ogrMap101.put("şube", "H");
        ogrMap101.put("bölüm", "MF");

        // ogrMap101 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(101, ogrMap101);

        Map<String, String> ogrMap102 = new HashMap<>();

        ogrMap102.put("isim", "Veli");
        ogrMap102.put("soyisim", "Cem");
        ogrMap102.put("sınıf", "10");
        ogrMap102.put("şube", "K");
        ogrMap102.put("bölüm", "TM");

        // ogrMap102 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(102, ogrMap102);

        Map<String, String> ogrMap103 = new HashMap<>();

        ogrMap103.put("isim", "Ali");
        ogrMap103.put("soyisim", "Cem");
        ogrMap103.put("sınıf", "11");
        ogrMap103.put("şube", "K");
        ogrMap103.put("bölüm", "TM");

        // ogrMap103 bitince bunu ogrenciMap'e ekleyelim
        ogrenciMap.put(103, ogrMap103);

        System.out.println(ogrenciMap);

        /*
        {
         101={sınıf=11, şube=H, soyisim=Can, bölün=MF, isim=Ali},
         102={sınıf=10, şube=K, soyisim=Cem, bölün=TM, isim=Veli},
         103={sınıf=11, şube=K, soyisim=Cem, bölün=TM, isim=Ali}
         }

         */

        // 102 numaralı öğrencinin soyismini yazdırın
        ogrenciMap.get(102); // 102={sınıf=10, şube=K, soyisim=Cem, bölün=TM, isim=Veli},
        System.out.println(ogrenciMap.get(102).get("soyisim")); // Cem

        // 103 numaralı öğrencinin bçlümünü yazdırın
        System.out.println(ogrenciMap.get(103).get("bölüm")); // TM

        // 101 numaralı öğrencinin soismini BULUT yapın

        ogrenciMap.get(101).put("soyisim","Bulut");
        System.out.println(ogrenciMap.get(101).get("soyisim")); // Bulut
        System.out.println(ogrenciMap.get(101)); // {sinif=11, sube=H, soyisim=BULUT, bolum=MF, isim=Ali}<<<<<<
    }
}
