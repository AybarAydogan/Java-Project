package day25_İnheritanceDataTypeKullanımı_Overriding;

public class D_Runner {
    public static void main(String[] args) {

        /*
            Bir obje oluşturulurken
            Data türü ve constructor aynı class'dan ise
            variable'ların hangi değeri alacağını bulmak için
            ilgili class'a gidip aramaya başlarız
            parent class'lara doğru aramaya devam ederiz
            ilk bulduğumuz yani en güncel olan değer
            geçerli değer olur.

            Java bir objenin data türü olarak
            constructor'ın olduğu class
            veya parent class'ları kabul eder

            Eğer data türü, constructor'ın parent'ı ise
            aramaya DATA TÜRÜ'nün olduğu class'dan başlanır

            parent class'lara doğru aramaya devam edilir
            ilk bulunan değer kullanılır
         */

        C_AvcıKuslar kartal1 = new C_AvcıKuslar();
        System.out.println(kartal1.hareket); // C Ucarlar
        System.out.println(kartal1.solunum); // B Akciğerle nefes alirlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.cogalma); // B Yumurtayla çoğalırlar
        System.out.println(kartal1.omur); // A Yaşar ve ölürler
        System.out.println(kartal1.kanat); // B Kanatlıdırlar
        System.out.println(kartal1.gaga); // C Sivri gagalıdır
        System.out.println(kartal1.pence); // C Pencelidir

        B_Kuslar kartal2 = new C_AvcıKuslar();

        System.out.println(kartal2.hareket); // A Hareket ederler
        System.out.println(kartal2.solunum); // B Akciğerle nefes alirlar
        System.out.println(kartal2.beslenme); // A Beslenirler
        System.out.println(kartal2.cogalma); // B Yumurtayla çoğalırlar
        System.out.println(kartal2.omur); // A Yaşar ve ölürler
        System.out.println(kartal2.kanat); // B Kanatlıdırlar
        System.out.println(kartal2.gaga); // B gagalari vardir
      // System.out.println(kartal2.pence); // CTE

        A_Hayvanlar kartal3 = new C_AvcıKuslar();

        System.out.println(kartal3.hareket); // A Hareket ederler
        System.out.println(kartal3.solunum); // A nefes alirlar
        System.out.println(kartal3.beslenme); // A Beslenirler
        System.out.println(kartal3.cogalma); // A cogalirlar
        System.out.println(kartal3.omur); // A Yaşar ve ölürler
        // System.out.println(kartal3.kanat); // CTE
        // System.out.println(kartal3.gaga); // CTE
        // System.out.println(kartal3.pence); // CTE

        B_Kuslar kus1 = new B_Kuslar();

    }
}
