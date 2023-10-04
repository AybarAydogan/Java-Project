package day21_varargs_StringBuilder;

public class C07_StringBuilder_EklemeSilme {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("Java Candır");

        sb.append(".");
        System.out.println(sb); // Java Candır.

        String str = "Hava çok güzel";

        sb.append(str,5,8);

        System.out.println(sb); // Java Candır.çok

        sb.insert(5,"çok ");

        System.out.println(sb); // Java çok Candır.çok

        sb.insert(19,str,8,14);
        // bizim sb'nin 19.index'ine yukarıdaki str'in 8.index'i ile 14.index'i arasına ekle

        System.out.println(sb); // Java çok Candır.çok güzel

        sb.delete(16,25);
        System.out.println(sb); // Java çok Candır.

        // sondaki karakteri silin
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb); // Java çok Candır

        // index saymadan "çok " silin

       int indexÇok = sb.indexOf("çok");
        sb.delete(indexÇok,indexÇok+4);
        System.out.println(sb); // Java Candır

    }
}
