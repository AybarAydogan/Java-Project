package day17_Constructors;

public class C07_Car {


    String marka = "Marka atanmamış";
    String model = "Model Atanmamış";
    String renk = "Renk Atanmamış";
    int yıl = 2023;
    int fiyat;
    C07_Car(){
        // bir class'da asagidaki gibi gorunur bir constructor olusturdugumuzda
        // Java default constructor'i siler
        // Bu durumda proje kapsamindaki baska class'larda
        // bu class'in default constructor'ini kullanarak olusturulmus olan objeler
        // CTE verir
        // Bu durumun onune gecmek icin
        // bir class'da gorunur bir parametreli constructor olusturuldugunda
        // DEFAULT constructor yerine de parametresiz ve bos bir cons. olusturulur

    }

    C07_Car(String mrk,String mdl){

        marka = mrk;
        model = mdl;
    }

    C07_Car(String mrk , String mdl , int yl, int fyt ){
        marka = mrk;
        model = mdl;
        yıl = yl;
        fiyat = fyt;


    }


    public String toString() {
        return "C07_Car Özellikler ==>" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yıl=" + yıl +
                ", fiyat=" + fiyat ;
    }
}
