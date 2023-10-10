package day24_inheritance_constructorCall;

public class F_Corolla extends E_Toyota {

    String model = "Corolla";
    String uretimYeri = "Türkiye";
    String lastik = "Pirelli Sakarya";
    String aku = "İnci akü";

    String jant = "19 inc";
    String guvenlik = "safe drive";
    String bagajHacmi = "200 litre";

    F_Corolla(){
        super(); // önce parent'daki parametresiz constructor'ı çalıştır
    }




    public static void main(String[] args) {

        F_Corolla corolla1 = new F_Corolla();

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.model); // Co Corolla
        System.out.println(corolla1.renk); // Ca Renk atanmamış
        System.out.println(corolla1.yakit); // Ca Yakıt atanmamış
        System.out.println(corolla1.uretimYeri); // Co Türkiye
        System.out.println(corolla1.sanziman); // Otamatik veya manuel
        System.out.println(corolla1.lastik); // Co Pirelli Sakarya
        System.out.println(corolla1.guvenlik); // Co safr drive
        System.out.println(corolla1.aku); // Co İnci akü
        System.out.println(corolla1.jant); // Co 19 inc
        System.out.println(corolla1.bagajHacmi); // C0 200 litre


        /*
           Bir obje oluşturulduğunda
           ilk değer ataması (initializetion) için MUTLAKA constructor çalışmalıdır
           child cllas'da oluşturulan bir objenin
           parent claass'lardaki özellikleri de taşıması için
           parent class'lardaki CONSTRUCTOR'lar da ÇALIŞMALIDIR

           Java bunun için özel bir konsept oluşturmuştur

           Java'nın oluşturulan her class'a
           obje oluşturulmasına izin vermek için
           DEFAULT CONSTRUCTOR koyduğu gibi,

           AYNI ŞEKİLDE
           extends kullanan her class'da oluşturulan
           HER CONSTRUCTOR'ın ilk satırına da
           süper() koyar.
         */
    }

}
