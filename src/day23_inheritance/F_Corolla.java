package day23_inheritance;

public class F_Corolla extends E_Toyota {

    String model = "Corolla";
    String uretimYeri = "Türkiye";
    String lastik = "Pirelli Sakarya";
    String aku = "İnci akü";

    String jant = "19 inc";
    String guvenlik = "safe drive";
    String bagajHacmi = "200 litre";

    public static void main(String[] args) {

        F_Corolla corolla1 = new F_Corolla();

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.model); // Co Corolla
        System.out.println(corolla1.renk); // Ca Renk atanmamış
        System.out.println(corolla1.yakit); // Ca Yakıt atanmamış
        System.out.println(corolla1.uretimYeri); // Co Türkiye
        System.out.println(corolla1.sanziman); // Otamatik veya manuel
        System.out.println(corolla1.lastik); // Co Pirelli Sakarya
        System.out.println(corolla1.guvenlik); // Co safr drive
        System.out.println(corolla1.aku); // Co İnci akü
        System.out.println(corolla1.jant); // Co 19 inc
        System.out.println(corolla1.bagajHacmi); // C0 200 litre

    }

}
