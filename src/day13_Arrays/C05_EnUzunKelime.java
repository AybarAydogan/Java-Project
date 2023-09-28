package day13_Arrays;

public class C05_EnUzunKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        //        en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] isimler = {"Aybar","Uğurcan","Halil","Sibel","Buket","Elif"};

        enUzunEnKısaYazdır(isimler);

    }

    public static void enUzunEnKısaYazdır(String[] arr) {

        String enKIsaIsim = arr[0];
        String enUzunIsim = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].length() > enUzunIsim.length()) {
                enUzunIsim = arr[i];
            }

            if (arr[i].length() < enKIsaIsim.length()) {
                enKIsaIsim = arr[i];
            }
        }
        System.out.println("en uzun isim : " +enUzunIsim);
        System.out.println("en kısa isim : " +enKIsaIsim);


    }

}
