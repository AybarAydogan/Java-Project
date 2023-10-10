package day24_inheritance_constructorCall;

public class E_Toyota extends D_Car {

    E_Toyota(){
        super(); // önce parent'daki parametresiz constructor'ı çalıştır
    }



    String marka = "Toyota";
    String uretimYeri = "Japonya ve Türkiye";

    String sanziman = "Otamatik veya manuel";
    String lastik = "Pirelli";
    String guvenlik = "Toyota araçlar ekstra güvenlik donanımına sahiptir";
    String aku = "Akü atanmadı";
}
