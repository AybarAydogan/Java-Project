package day08_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = "Java candir";

        System.out.println(str.replace('a', 'q')); // Jqvq cqndir

        System.out.println(str.replace("Java", "Tava")); // Tava candir

        System.out.println(str.replace("java", "X")); // X candir

        System.out.println(str.replace("X", "y")); // Java candir

        System.out.println(str.replace("a", "e").replace("i","a"));
        // Jeve cendar

        System.out.println(str.replace("i", "a").replace("a", "e"));
        // Jeve cender


        // değişecek metin sadece ilk değer için değişsin diyorsak
        // replace() yerine replaceFirst() kullanılır

        System.out.println(str.replaceFirst("a", "x")); // Jxva candir

        // regex : regular expressions:belirlenmiş kısaltmalar
        // ilk harfi * yapalım
        // varsa ilk string içindeki ilk rakamı + yapalım

        System.out.println(str.replaceFirst("\\w", "*")); // *ava candir

        str = "Java 44candir";
        System.out.println(str.replaceFirst("\\d", "+")); // Java +4candir

    }
}
