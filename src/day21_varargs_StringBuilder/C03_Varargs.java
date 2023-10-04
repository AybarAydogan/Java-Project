package day21_varargs_StringBuilder;

import com.sun.tools.javac.Main;

public class C03_Varargs {

    // 1 int ve istenen kadar String parametre alıp
    // String parametre sayısı ile int sayının çarpımını yazdıran bir method oluşturun

    public static void main(String[] args) {

        islemYap(5,"a","b","c"); // 5 * 3 = 15
        islemYap(2,"a"); // 2 * 1 = 2
        islemYap(5); // 5 * 0 = 0
        islemYap(3,"","","","",""); // 3 * 5 = 15

    }


    public static void islemYap(int sayi, String...strings){

        System.out.println(sayi * strings.length);
    }
}
