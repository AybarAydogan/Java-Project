package day25_İnheritanceDataTypeKullanımı_Overriding;

public class H_Runner {
    public static void main(String[] args) {

        /*

         özellikler method olarak oluşturulmuşsa

                 - constructor ve data türü aynı ise
                   o class'dan aramaya başlayıp, parent class'lara doğru devam ederiz
                   ilk bulduğumuz method çalıştırılır

                   - constructor ve data türü aynı değil ise
                   data türü olan class'dan aramaya başlayıp, parent class'lara doğru devam ederiz
                   eğer bulunursa, hemen çalıştırılmaz
                   o method'un constructor olan class'a kadar daha günceli var mı kontrol edilir
                   daha güncel varsa güncel olan çalışır

                   aramaya başladığımız class'da ve parent class'larında method bulunamazsa
                   child class'lara dönülmez, güncel var mı bakılmaz
                   CTE oluşur

         */

        G_Avcikuslar kartal4 = new G_Avcikuslar();


        kartal4.hareket(); // G ucarlar
        kartal4.solunum(); // F Akciğerler nefes alirlar
        kartal4.beslenme(); // G Et yerler
        kartal4.cogalma(); // F Yumurtayla cogalirlar
        kartal4.omur(); // E Yasar ve olurler
        kartal4.kanat(); // F Kanatlidirlar
        kartal4.gaga(); // G Sivri gagali
        kartal4.pence(); // G Pencelidir

        F_Kuslar kartal5 = new G_Avcikuslar();

        kartal5.hareket(); // G ucarlar
        kartal5.solunum(); // F Akciğerler nefes alirlar
        kartal5.beslenme(); // G Et yerler
        kartal5.cogalma(); // F Yumurtayla cogalirlar
        kartal5.omur(); // E Yasar ve olurler
        kartal5.kanat(); // F Kanatlidirlar
        kartal5.gaga(); // G Sivri gagali
        // kartal5.pence(); // CTE

        E_Hayvanlar kartal6 = new G_Avcikuslar();

        kartal6.hareket(); // G ucarlar
        kartal6.solunum(); // F Akciğerler nefes alirlar
        kartal6.beslenme(); // G Et yerler
        kartal6.cogalma(); // F Yumurtayla cogalirlar
        kartal6.omur(); // E Yasar ve olurler
        // kartal6.kanat(); // CTE
        // kartal6.gaga(); // CTE
        // kartal6.pence(); // CTE

        F_Kuslar kus1 = new F_Kuslar();

        // constructor ve data türü aynı
        // kuşlara gidip ilk bulduğumu kullanırım


        kus1.hareket(); // E hareket ederler
        kus1.solunum(); // F Akciğerler nefes alirlar
        kus1.beslenme(); // E beslenirler
        kus1.cogalma(); // F Yumurtayla cogalirlar
        kus1.omur(); // E Yasar ve olurler
        kus1.kanat(); // F Kanatlidirlar
        kus1.gaga(); // F gagalari vardir
        // kus1.pence(); // CTE

        E_Hayvanlar kus2 = new F_Kuslar();

        kus2.hareket(); // E hareket ederler
        kus2.solunum(); // F Akciğerler nefes alirlar
        kus2.beslenme(); // E beslenirler
        kus2.cogalma(); // F Yumurtayla cogalirlar
        kus2.omur(); // E Yasar ve olurler
        // kus2.kanat(); // CTE
        // kus2.gaga(); // CTE
        // kus2.pence(); // CTE

        E_Hayvanlar hayvanlar1 = new E_Hayvanlar();

        hayvanlar1.hareket(); // E hareket ederler
        hayvanlar1.solunum(); // E nefes alirlar
        hayvanlar1.beslenme(); // E beslenirler
        hayvanlar1.cogalma(); // E cogalirlar
        hayvanlar1.omur(); // E Yasar ve olurler
        // hayvanlar1.kanat(); // CTE
        // hayvanlar1.gaga(); // CTE
        // hayvanlar1.pence(); // CTE
    }
}
