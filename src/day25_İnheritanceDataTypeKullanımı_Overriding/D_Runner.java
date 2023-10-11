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
         */

        C_AvcıKuslar kartal1 = new C_AvcıKuslar();
        System.out.println(kartal1.hareket); // C ucarlar
        System.out.println(kartal1.solunum); // B Akciğerle nefes alirlar
        System.out.println(kartal1.beslenme); // C Et yerler
        System.out.println(kartal1.cogalma); // B Yumurta çoğalırlar
        System.out.println(kartal1.omur); // A Yaşar ve ölürler
        System.out.println(kartal1.kanat); // B Kanatlıdırlar
        System.out.println(kartal1.gaga); // C Sivri gagalıdır
        System.out.println(kartal1.pence); // C Pencelidir


    }
}
