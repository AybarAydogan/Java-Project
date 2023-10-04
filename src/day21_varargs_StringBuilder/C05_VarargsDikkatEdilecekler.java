package day21_varargs_StringBuilder;

public class C05_VarargsDikkatEdilecekler {
    public static void main(String[] args) {

        // istenen kadar int parametre alıp
        // ilk sayı dışındaki tüm sayıları toplayıp
        // bulunan toplamı ilk sayi ile çarpıp yazdıran
        // bir method oluşturun

        islem1(1,2,3,4,5,6); // 20  1 * 20
        islem1(2,3,0); // 6  2 * 3
        islem1(0,3); // 0   0 * 3
        islem1(1); // 0  1 *      burada geriye kalanlar [] olur , 0 method'da toplama bizim atadığımız ilk değer

        // istenen kadar int parametre alıp
        // son sayı dışındaki tüm sayıları toplayıp
        // bulunan toplamı son sayi ile çarpıp yazdıran
        // bir method oluşturun

    }
    /*
    public static void islemYapSon(int...toplanacakSayilar , int sonSayi){
        // Vararg parameter must be the last in the list
    }

    varargs alacağı element sayısı konusunda sınır tanımadığından
    tüm elementleri almak ister

    bundan dolayı bir method'da parametre olarak varargs yazılacaksa
    EN SON parametre olarak yazılmalıdır

    bu sebeple bir method'da 2 varargs parametre de KULLANILAMAZ
     */


    public static void islem1(int ilkSayi, int...geriyeKalanlar){
        int toplam = 0;
        for (int each : geriyeKalanlar){

            toplam += each;
        }

        System.out.println(ilkSayi * toplam);
    }
}
