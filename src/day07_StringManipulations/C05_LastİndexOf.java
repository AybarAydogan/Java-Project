package day07_StringManipulations;

import java.util.Scanner;

public class C05_LastİndexOf {

    public static void main(String[] args) {

        // Verilen bir cumlede
        // aranan bir metin icin asagidaki cumlelerden
        // uygun olani yazdiracak bir program yaziniz
        // - Cumle aranan metni icermiyor
        // - Cumlede aranan metin sadece 1 kere kullanilmis
        // - Cumlede aranan metin sadece 1'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String cumle = scanner.nextLine();

        System.out.println("lütfen aranan metin giriniz");
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin); // -1 veya index
        int soniIndex = cumle.lastIndexOf(metin); // -1 veya index


        if (ilkIndex == -1){
            System.out.println("cumle aranan metni içermiyor");
        } else if (ilkIndex == soniIndex) {
            System.out.println("Cumlede aranan metin sadece 1 kere kullanilmis");
        }else{
            System.out.println("Cumlede aranan metin sadece 1'den fazla kullanilmis");
        }


    }
}
