package day34_NestedMaps;

import day32_Maps.MapMethodDepo;

import java.util.Map;

public class C03_FarkliDataTurleriIleMapOlusturma {
    public static void main(String[] args) {
        /*

         {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2023-07-21",
                   "checkout" : "2023-08-10"
                      },
            "additionalneeds" : "wi-fi" }

         */
        Map<String, Object> bookingMap =
                MapMethodDepo.rezervasyonOlustur("Hasan","Yan",300,true,"2023-10-21","2023-10-25","wi-fi");


        System.out.println(bookingMap);

        Map<String,Object> bookingMap2 = MapMethodDepo.rezervasyonOlustur("Zeliha","Selcuk",200,false,"2023-11-07","2023-11-11",null);


        /*
            {
            firstname=Hasan,
            additionalneeds=wi-fi,
            bookingdates={
                            checkin=2023-10-21,
                            checkout=2023-10-25
                            },
           totalprice=300,
           depositpaid=true,
           lastname=Yan
           }
         */

        // fistname'i yazdırın

        System.out.println(bookingMap.get("fistname")); // Hasan

        // depositpaid yazdırın

        System.out.println(bookingMap.get("depositpaid")); // true

        // checkin yazdırın

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin")); // 2023-10-21

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkout")); // 2023-10-25

        // totalprice'i 300 olarak update edin

        bookingMap.put("totalprice",300);

        // checkin değerini 2023-10-18 olarak update edelim

        ((Map<String, String>) bookingMap.get("bookingdates")).put("checkin","2023-10-18");

        System.out.println(bookingMap);


    }
}
