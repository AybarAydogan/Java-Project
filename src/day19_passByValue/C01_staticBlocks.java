package day19_passByValue;

public class C01_staticBlocks {

    C01_staticBlocks(){
        System.out.println("constructor çalıştı");
    }

    static {
        System.out.println("static bloc çalıştı");
        /*
           Eğer class çalışmaya başlamadan
           belirli ayarları yapmak isterseniz
           static block oluşturabilirsiniz

           static block'lar class'daki HERŞEYDEN
           hatta main method'dan bile
           önce çalışırlar

           birden fazla static block varsa,
           kendi içlerinde önce üstteki çalışır
         */
    }

    {
        System.out.println("static olmayan block");
        /*
           obje oluşturmadan önce
           yapılması gereken ön ayarlar varsa kullanılır
         */
    }




    public static void main(String[] args) {

        System.out.println("main method çalıştı");

        C01_staticBlocks obj = new C01_staticBlocks();


    }

    static {
       System.out.println("alttaki static block çalıştı");
    }
}
