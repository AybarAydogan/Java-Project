package day33_MapUpdate_EntryKullanımı;

import day32_Maps.MapMethodDepo;

import java.util.Map;

public class C08_NumaraIleOgrenciSilme {
    public static void main(String[] args) {

        // verilen numaradaki öğrenciyi
        // map'den silelim

        Map<Integer,String> ogrenciMap = MapMethodDepo.okulMapDondur();

        ogrenciMap.remove(101);

        System.out.println(ogrenciMap.remove(102)); // Veli-Cem-10-K-TM

        System.out.println(ogrenciMap.remove(103, "Ali-Cem-11-K-TM")); // true

        System.out.println(ogrenciMap.remove(104, "Ali-Cem-11-K-TM")); // false

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM");
        // hiç bir kontrol yapmadan değeri verdiğimiz değer olarak update eder

        ogrenciMap.replace(104,"Ali-Cem-11-K-TM","Ali-Yan-10-S-TM");
        // eğer eski değer verdiğimiz ile aynı ise yeni değeri atama yapar


        System.out.println(ogrenciMap.containsKey(103)); // false
        System.out.println(ogrenciMap.containsKey(107)); // true

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // value'nun içindeki değerlere değil
        // bir bütün olarak value'ya bakar
        // valu'su "Ali" olan yoksa false döner


        System.out.println(ogrenciMap);
    }
}
