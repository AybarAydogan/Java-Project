package day18_ParametrizedConstructor_construcktorCall;

import day17_Constructors.C01;

public class C02_CarRunner {
    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println("Car1 " + car1);
        // Car1 C07_Car Özellikler ==>marka='Marka atanmamış', model='Model Atanmamış', renk='Renk Atanmamış', yıl=2023, fiyat=0

        car1.marka = "BMW";
        car1.model = "M5";
        car1.yıl = 2023;
        car1.fiyat = 5000000;
        System.out.println("Car1 " + car1);
        // Car1 C07_Car Özellikler ==>marka='BMW', model='M5', renk='Renk Atanmamış', yıl=2023, fiyat=5000000

        // marka, model ve renk değerlerini parametree olarak
        // yollayabileceğimiz bir constructor oluşturalım

        C01_Car car2 = new C01_Car("Mercedes","G 63","siyah");
        System.out.println(car2);
        // C07_Car Özellikler ==>marka='Mercedes', model='G 63', renk='siyah', yıl=2023, fiyat=0

        C01_Car car3 = new C01_Car("Audi","RS6","Beyaz");
        System.out.println(car3);
        // C07_Car Özellikler ==>marka='Audi', model='RS6', renk='Beyaz', yıl=2023, fiyat=0

        // marka,model,renk ve fiyat parametreleri olan
        // bir constructor oluşturun

        C01_Car car4 = new C01_Car("Honda","Cıvıc","Mat",950000);
        System.out.println(car4);
        // C07_Car Özellikler ==>marka='Honda', model='Cıvıc', renk='Mat', yıl=2023, fiyat=950000













    }
}
