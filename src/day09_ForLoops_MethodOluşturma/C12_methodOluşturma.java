package day09_ForLoops_MethodOluşturma;

public class C12_methodOluşturma {
    public static void main(String[] args) {

        String str = "Sevim bak kim gelmiş ?";

        str.toUpperCase();

        // method biz bir sonuç döndürüyorsa 2 şekilde o sonucu kullanabiliriz

        // sadece o satırda, sonucu görmek istiyorsanız, kalıcı bir değişiklik yapmayacaksınız
        System.out.println(str.toLowerCase()); // sevim bak kim gelmiş ?

        // veya değişikliğin kalıcı olmasını istiyorsak
        // yeni halini kaydedebiliriz.

        String strBuyukHarf = str.toUpperCase();

        System.out.println(str); // sevim bak kim gelmiş ?
        System.out.println(strBuyukHarf); // SEVİM BAK KİM GELMİŞ ?

        // Google === google  bug
    }
}
