package day07_StringManipulations;

import java.util.Scanner;

public class C03_İndexOf {

    public static void main(String[] args) {

        // Verilen bir cumlede
    // aranan bir metin icin asagidaki cumlelerden
    // uygun olani yazdiracak bir program yaziniz
    // - Cumle aranan metni icermiyor
    // - Cumlede aranan metin sadece 1 kere kullanilmis
    // - Cumlede aranan metin sadece 2 kere kullanilmis
    // - Cumlede aranan metin 2'den fazla kullanilmis


        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("lütfen aranan metin giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = 0;
        int ikinciIndex = 0;
        int ucuncuIndex = 0;


        ilkIndex = cumle.indexOf(metin); // -1 veya kullanılan index

        if (ilkIndex == -1){
            System.out.println("Cumle aranan metni icermiyor");
        } else if ((ikinciIndex = cumle.indexOf(metin,ilkIndex+1)) == -1) { // mutlaka kullanılmış ama kaç defa bilmiyorum
            // ilk index -1 değil,ikinci index -1
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else {
            // ilk index -1 değil ikinci index -1 değil
            // şimdiki sorumuz sadece iki tane mi var yoksa ikiden fazla mı ?


            ucuncuIndex = cumle.indexOf(metin,ikinciIndex+1);
            // ucuncu index == -1 veya var olan bir index
            if (ucuncuIndex == -1){
                // ilk index değil, ikinci index değil ama ucuncu index -1
                System.out.println("Cumlede aranan metin sadece 2 kere kullanilmis");
            }else {
                // ilk index değil, ikinci index değil ama ucuncu index -1
                System.out.println(" Cumlede aranan metin 2'den fazla kullanilmis");
            }




        }
    }
}
