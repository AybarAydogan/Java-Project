package day17_Constructors;

import java.util.Random;

public class C01 {
        int sayi = 6;
        String str = "Java candir";


        public void rastgeleSayiUret(){

            Random random = new Random();
            int rastgeleSayi = random.nextInt(1000);
            System.out.println("Bugün kü şanslı sayi : " + rastgeleSayi);
        }

        public void bugunNePisireyim (){

            String[] yemekler = {"Makarna", "Tavuk sote", "Mercimek çorbası"};

            Random random = new Random();
            int yemekNo = random.nextInt(yemekler.length);
            System.out.println("Bugünün yemek teklifi : " + yemekler[yemekNo]);
        }
}
