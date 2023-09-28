package day17_Constructors;

public class C05 {

    // default constructor ile aynı ilevi yapan
    // görünür b,r constructor oluşturalım

    C05(){
        System.out.println("Merhaba, ben constructor");

    }
    // bu constructor görünür olduğu için
    // buna default constructor değil
    // PARAMETRESİZ constructor denir.
    // Çünkü default constructor'ların body'si boş olur
    // ama biz parametresiz constructor'ların body'sine kod ekleyebiliriz

    int sayi = 0;
    String str;


    public void method1(){
        System.out.println("C05 method1 çalıştı");

    }

    public void C05(){
        // method isimleri küçük harfale başlamalıdır
        // ama bu bir kural değil convention (genel kabul)'dir.
        // bir kod blogunun return type'i varsa method'dur

    }

    /*
      public asd(){

       }

       c05(){

       }

       Invalid method declaration; return type required
       ismi class adı ile aynı değil, olsa olsa method olabilir
       ama method için return type yazılmalı

     */

}
