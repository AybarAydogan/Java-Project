package day13_Arrays;

public class C04_Arrays {

    public static void main(String[] args) {

        // Verilen String bir array'de
        // istenen harfi iceren elementleri yazdirin

        String [] isimler = {"Aybar","Uğurcan","Halil","Sibel","Buket","Elif"};
        String istenenHarf = "a";

        for (int i = 0; i < isimler.length ; i++) {

            if (isimler[i].contains(istenenHarf)){
                System.out.print(isimler[i] + " ");
            }
        }
    }
}
