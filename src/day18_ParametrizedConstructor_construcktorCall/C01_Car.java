package day18_ParametrizedConstructor_construcktorCall;

public class C01_Car {

    String marka = "Marka atanmamış";
    String model = "Model Atanmamış";
    String renk = "Renk Atanmamış";
    int yıl = 2023;
    int fiyat;

    public C01_Car(){
      //  renk = "Kırmızı";
        /*
            Default constructor ile parametresiz constructor'ın en büyük farkı
            default cons..'ın body'si boş iken
            parametresiz cons.'lara kod yazılabilir
            bu durum yapılan tüm araçlar için standart olarak uygulanır
         */
    }


    C01_Car(String mrk, String mdl, String rnk){

        marka = mrk;
        model = mdl;
        renk = rnk;
    }

    C01_Car(String marka, String model, String renk, int fiyat){
       this.marka = marka;
        this.model = model;
        this.renk = renk;
       this.fiyat = fiyat;
   }

   // tüm instance'lar için parametre olan bir cons. oluşturalım


    public C01_Car(String marka, String model, String renk,int yıl,int fiyat){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.fiyat = fiyat;

    }

    // model ve yıl parametreleri olsun
    // biz hep toyota satıyoruz ve renkleri de hep mavi


    public C01_Car(String model, int yıl) {
        this.model = model;
        this.yıl = yıl;
        marka = "Toyota";
        renk = "Mavi";
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
