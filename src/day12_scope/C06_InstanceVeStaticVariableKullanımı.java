package day12_scope;

public class C06_InstanceVeStaticVariableKullanımı {
    // okul uygulaması yaptığımızı düşünelim

    static String okulIsmi = "Yıldız Koleji";
    static String mudur = "Aybar Aydoğan";
    static String okulAdresi = "Çankaya";

    String ogretmenIsmi = "İsim atanmadı";
    String ogretmenAdresi = "Adres girilmedi";
    String ogretmenTelefonu = "Telefon girilmedi";

    public static void main(String[] args) {

        C06_InstanceVeStaticVariableKullanımı ogr1 = new C06_InstanceVeStaticVariableKullanımı();

        System.out.println(ogr1.ogretmenAdresi); // adres girilmedi
        ogr1.ogretmenIsmi = "Aybar";
        ogr1.ogretmenAdresi = "Yeenimahalle";
        System.out.println(ogr1.mudur); // Aybar Aydoğan


        C06_InstanceVeStaticVariableKullanımı ogr2 = new C06_InstanceVeStaticVariableKullanımı();
        System.out.println(ogr2.ogretmenIsmi); // Isim atanmadı
        ogr2.ogretmenIsmi = "Beyza";

        C06_InstanceVeStaticVariableKullanımı ogr3 = new C06_InstanceVeStaticVariableKullanımı();


        System.out.println("====");
        System.out.println(ogr1.ogretmenIsmi); // Aybar
        System.out.println(ogr2.ogretmenIsmi); // Beyza
        System.out.println(ogr3.ogretmenIsmi); // İsim atanmadı

        System.out.println(ogr1.okulIsmi); // Yıldız Koleji
        System.out.println(ogr2.okulIsmi); // Yıldız Koleji
        System.out.println(ogr3.okulIsmi); // Yıldız Koleji

        ogr1.okulAdresi = " Yenimahalle";
        System.out.println(okulAdresi); // Yenimahalle
        System.out.println(ogr2.okulAdresi); // Yenimahalle
        System.out.println(ogr3.okulAdresi); // Yenimahalle

    }
}

