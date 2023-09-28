package day14_Arrays;

import day13_Arrays.C02_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Arrays {

    public static void main(String[] args) {

        int[] arr = {3,4,5};

        // kullanıcıdan bir değer alıp array'e ekleyin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen array'e eklemek için bir tam sayı giriniz");
        int eklenecekSayi = scanner.nextInt();

        arr = C02_ArrayeElemanEkleme.arrayeElemanEkle(arr,eklenecekSayi);

        System.out.println("Array'in yeni hali : " + Arrays.toString(arr));

    }
}
