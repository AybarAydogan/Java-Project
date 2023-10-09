package day23_inheritance;

public class G_Auris extends E_Toyota{
    public static void main(String[] args) {

        /*
           Bir class başka bir class'a extends ile child olursa
           o class ve o class'ın parent class'larındaki tüm özelliklere
           OTOMATİK olarak sahip olur.

           Child class
           isterse parent class'lardaki özellikleri sahipleir
           isterse o bilgileri günceller
           isterse de parent class'larda olan özelliklere ilave olarak
                   kendi spesifik özelliklerini ekleyebilir.

           Child class ne kadar güncellem yaparsa
           özellikleri o kadar kendisine uyarlamış olur.

           Özellikleri kendisine uyarlamazsa
           parent class'ın bütün child class'ları kapsayan
           DAHA GENEL özelliklerini sahiplenmiş olur.

         */

        G_Auris auris1 = new G_Auris();
        System.out.println(auris1.marka); // T Toyota
        System.out.println(auris1.model); // Ca Model atanmamış
        System.out.println(auris1.renk); // Ca Renk atanmamış
        System.out.println(auris1.yakit); // Ca Yakıt atanmamış
        System.out.println(auris1.uretimYeri); // T Japonya veya Türkiye
        System.out.println(auris1.sanziman); // T Otomaik ve manuel
        System.out.println(auris1.lastik); // T Pirelli
        System.out.println(auris1.guvenlik); // T Toyota araçlar ekstra güvenlik donanımına sahiptir
        System.out.println(auris1.aku); // T Akü atanmadı


    }
}
