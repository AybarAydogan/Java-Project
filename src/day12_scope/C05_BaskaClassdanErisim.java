package day12_scope;

public class C05_BaskaClassdanErisim {
    /*
       Class içerisinde oluşturduğumuz class üyelerinin
       static olup olmaması
       başka class'lardan erişimi de etkiler

       Başka class'dan static bir class üyesine ulaşmak için
       classİsmi.staticClassUyesiIsmi kullanılır

       Başka class'dan static olmayan class üyesine ulaşmak için
       Önce o class'dan bir obje oluşturup
       sonra objeIsmi.staticOlmayanClassUyesiIsmi kullanılır

        PEKİİ static bir class üyesine
        OBJE üzerinden ulaşabilir miyiz ?

        Java obje ismini yazıp nokta koyunca
        static üyeleri otomatikolarak önermez
        AMMA biz manuel olarak obj.staticClassUyeİsmi yazarak
        java istediğimizi static uyeyi getirir
        bu durumda intellij bu kullanımı sarıya boyar
        static bir class üyesine, static olmayan yolla erişiyorsun
        diye bizi uyarır ama çalışmaya engel olmaz
        */

    public static void main(String[] args) {

        System.out.println(C03_Scope_ClassVariables.bl); // true
        System.out.println(C03_Scope_ClassVariables.chr); // a
        C03_Scope_ClassVariables.statichMethod();

        C03_Scope_ClassVariables obje = new C03_Scope_ClassVariables();
        System.out.println(obje.sayi); // 23
        System.out.println(obje.str); // Java
        obje.staticOlmayanMethod();

        System.out.println(obje.bl);// true
        System.out.println(obje.chr);// a


    }




}
