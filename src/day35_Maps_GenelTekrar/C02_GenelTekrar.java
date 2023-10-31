package day35_Maps_GenelTekrar;

public class C02_GenelTekrar {

         /*
    Yıldızlar (*) ile baklava deseni oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;

              *
             * *
            * * *
           * * * *
          * * * * *
           * * * *
            * * *
             * *
              *


          şeklini konsola yazdiriniz.
         */

    public static void main(String[] args) {

        int enGEnisSatir = 5;

        for (int i = 1; i <= enGEnisSatir; i++) {


            for (int j = 1; j <= enGEnisSatir-i ; j++) { // baştaki boşluklar için
                System.out.print(" ");
            }


            for (int j = 1; j <= i; j++) { // yıldızlar için
                System.out.print("* ");
            }
            System.out.println("");
        } // en geniş satıra ladar olan kısım

        for (int i = enGEnisSatir-1; i >= 1 ; i--) {

            for (int j = 1; j <= enGEnisSatir-i ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i ; j++) {

                System.out.print("* ");
            }

            System.out.println("");
        }
    }
}
