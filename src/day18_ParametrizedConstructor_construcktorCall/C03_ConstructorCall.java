package day18_ParametrizedConstructor_construcktorCall;

public class C03_ConstructorCall {

    C03_ConstructorCall(){
        this("Java");
       // this(5); // Call to 'this()' must be first statement in constructor body
            System.out.println("Parametresiz constructor çalıştı");
        }

    C03_ConstructorCall(int sayi){

        System.out.println("İnt parametreli constructor çalıştı");
    }

    C03_ConstructorCall(String metin){
       // C03_ConstructorCall(); // method call Syntax'i olduğundan java bu isimde method arar
        this(6); // constructor call syntax'i
                      // constructor adını değil this(istenen parametreler) yazarız
        System.out.println("String parametreli constructor çalıştı");
    }

    public static void main(String[] args) {

           C03_ConstructorCall obj1 = new C03_ConstructorCall("A");
        // int parametreli constructor çalıştı
        // String parametreli constructor çalıştı

        C03_ConstructorCall obj2 = new C03_ConstructorCall();

    }
}
