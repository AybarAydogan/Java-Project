package day29_exceptions_garbageCollector;

public class C04_BilinmesiGerekenExceptionlar {
    public static void main(String[] args) {

        String str = "Java Candir";

       // Integer sayi = str;

        Object obj = str; // arada parent child ilişkisi olduğundan auto widening

       // Integer sayi = (Integer) obj; // arada parent child ilişkisi olduğundan explicit narrowing yapılabilir
        // ClassCastException



        String aramaSonucuStr = "123a";
        Integer aramaSonucuInt = Integer.parseInt(aramaSonucuStr);
        // NumberFormatException

        // arama sonuç sayısının 100'den fazla olduğunu test edin

        if (aramaSonucuInt > 100){
            System.out.println("Arama sonuçu 100'den büyük, test PASSED");
        }else {
            System.out.println("Arama sonuçu 100'den büyük değil, test FAILED");
        }





    }
}
