package day24_inheritance_constructorCall;

public class I_Child extends H_Parent{

    I_Child(){
        System.out.println("C parametresiz");

    }

    I_Child(String str){
        super(5);
        System.out.println("C String");

    }

    I_Child(int sayi){
        System.out.println("C int");

    }

    I_Child(boolean bl){
        System.out.println("C boolen");

    }

    public static void main(String[] args) {

        I_Child child2 = new I_Child("Aybar");
        //GP parametresiz
        //P int
        //C String

        I_Child child1 = new I_Child();
        // GP parametresiz
        //P parametresiz
        //C parametresiz
    }


    /*
       Biz bir class'da görünür bir constructor oluşturduğumuzda
       default constructor'ın silindiği g
       GİBİ
       eğer extends kullanan bir class'daki
       herhangi bir constructor'ın ilk satırına
       görünür bir constructor call yazarsak
       Java default super() siler.
     */
}
