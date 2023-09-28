package day17_Constructors;

public class C08_CarRuner {
    public static void main(String[] args) {

        C07_Car car1 = new C07_Car();

        System.out.println(car1.marka); // Marka atanmamış
        System.out.println(car1.model); // Model Atanmamış

        System.out.println(car1); // day17_Constructors.C07_Car@5f184fc6
        System.out.println(car1.toString()); // day17_Constructors.C07_Car@5f184fc6


        // eğer bir class'dan obje oluşturduğumuzda
        // objenin tüm özelliklerini tek bir sout ile yazdırmak isterseniz
        // o class'a toString() oluşturmalısınız

        System.out.println(car1);
        // C07_Car{marka='Marka atanmamış', model='Model Atanmamış', renk='Renk Atanmamış', yıl=2023, fiyat=0}
        // C07_Car Özelliklermarka='Marka atanmamış', model='Model Atanmamış', renk='Renk Atanmamış', yıl=2023, fiyat=0


        C07_Car car2 = new C07_Car();
        car2.marka = "Mercedes";
        car2.model = "G 63";
        car2.renk = "Mat";
        car2.yıl = 2023;
        car2.fiyat = 1000000000;
        System.out.println(car2);
     // C07_Car Özellikle ==> marka'Mercedes', model='G 63', renk='Mat', yıl=2023, fiyat=1000000000


        C07_Car car3 = new C07_Car();
        car3.marka = "Tesla";
        car3.model = "X";
        car3.renk = "Beyaz";
        car3.yıl = 2023;
        car3.fiyat = 1200000000;
        System.out.println(car3);
        // C07_Car Özellikler ==>marka='Tesla', model='X', renk='Beyaz', yıl=2023, fiyat=1200000000

        // eğer atamayı her seferinde tek tek yapmak istemezseniz
        // atama işlemini constructor'da yapabiliriz

        C07_Car car4 = new C07_Car("Porsche", "Carrera");
        System.out.println(car4);
        // C07_Car Özellikler ==>marka='Porsche', model='Carrera', renk='Renk Atanmamış', yıl=2023, fiyat=0

        C07_Car car5 = new C07_Car("Citroen","C3");
        System.out.println(car5);
        // C07_Car Özellikler ==>marka='Citroen', model='C3', renk='Renk Atanmamış', yıl=2023, fiyat=0

        // marka, model, yıl, fiyat olan araçlar üretmek istiyoruz
        C07_Car car6 = new C07_Car("Honda","Cıvıc",2019,10000);
        System.out.println(car6);
        // C07_Car Özellikler ==>marka='Honda', model='Cıvıc', renk='Renk Atanmamış', yıl=2019, fiyat=10000

        C07_Car car7 = new C07_Car("Audi","Rs6",2023,80000000);
        System.out.println(car7);
        // C07_Car Özellikler ==>marka='Audi', model='Rs6', renk='Renk Atanmamış', yıl=2023, fiyat=80000000








    }
}
