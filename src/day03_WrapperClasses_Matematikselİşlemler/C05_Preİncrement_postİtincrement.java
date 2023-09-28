package day03_WrapperClasses_Matematikselİşlemler;

public class C05_Preİncrement_postİtincrement {
    public static void main(String[] args) {

        int a = 20 ;

        // a'nın degerini yazdırın
        // sanra a'nın degerini 1 artır ve oluşturacagınız b variable'ına yeni deger atayın

        System.out.println("a : " + a);
        a += 1 ;
        int b = a ;

        System.out.println("işlem sonunda a : " + a + ",b :" + b );

        a = 20;
       // a'nın degerini b'ye atayıp
       // sonra a'nın degerini 1 artırın

       b = a ;
       a += 1 ;

        System.out.println("işlem sonunda a : " + a + ",b :" + b );

        System.out.println("===================");
        // u anlatılan sadece ++ veya -- seklinde kullanım içinidr
        a = 20 ;
        b = a++ ;
        System.out.println("a++ işlem sonunda a : " + a + ",b :" + b );

        a=20;
        b= ++a;
        System.out.println("++a işlem sonunda a : " + a + ",b :" + b );

        int c = 40;

        System.out.println("c++ ile yazdırınca :" + c++);
        System.out.println("c++ ile bir alt satırda c'nin degeri : " + c);

        c = 40;

        System.out.println("++c ile yazdırınca :" + ++c );
        System.out.println("++c ile bir alt satırda c'nin degeri : " + c);


    }
}
