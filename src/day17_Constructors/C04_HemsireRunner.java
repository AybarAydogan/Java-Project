package day17_Constructors;

public class C04_HemsireRunner {
    public static void main(String[] args) {

        C03_Hemsire hemsire1 = new C03_Hemsire();

        hemsire1.hemsireAdi = "Uğurcan";

        hemsire1.hemsireAdresi = "Yenimahalle";



        C03_Hemsire hemsire2 = new C03_Hemsire();

        System.out.println(hemsire2.hemsireTel); // null

        System.out.println((new C03_Hemsire().hemsireAdresi));

        // son oluşturduğumuz objeyi
        // atama yapmadğımız için bir daha kullanamayız
        // bu tür boş objeler java'daki garbage collector tarafından toplanıp yok edilir

        C03_Hemsire hemsire3;
       // hemsire3.method1();
      //  System.out.println(hemsire3.hemsireAdresi);
      //  initialize yapılmadığı için, her hangi bir variable değerini yazdıramaz


    }
}
