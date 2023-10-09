package day23_inheritance;

public class I_Child extends H_Parent{
    public static void main(String[] args) {

        I_Child child1 = new I_Child();

       // child1.araba private
        System.out.println(child1.kasa); // kasa boş

        kasa = "75";
        System.out.println(kasa); // 75

        // default normalde inheritance için uygun değildir
        // ama bu class aynı package'da olduğu için kullanabilirsin
        // Parent başka package'da olursa,child class
        // parent class'daki default access modifier'a sahip
        // class üyelerine ulaşamaz
        child1.sayi = 34;
        System.out.println(child1.adres); // Yenimahalle

    }
}
