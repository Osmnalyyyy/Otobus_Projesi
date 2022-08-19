import java.util.Map;
import java.util.Set;

public class IzmirIstanbul {
    public static void bosKoltukGoruntuleme() {
        Set<Map.Entry<Integer,String>> entrySet=Seferler.yolcuListesiIzmirIstanbul().entrySet();
        int koltukNo;
        String[] yolcuListesi;
        for (Map.Entry<Integer,String> entry : entrySet){
            koltukNo=entry.getKey();
            yolcuListesi=entry.getValue().split(",");
            if (yolcuListesi[0].equals("B")){
                System.out.println(koltukNo+" Numarali Koltuk Bostur");
            }
        }
    }

    public static void fiyatGoruntuleme() {
        System.out.println("IZMIR-ISTANBUL sefer fiyati : 300 TL dir");
    }

    public static void izmirIstanbulYolcuListesiYazdir() {
        Set<Map.Entry<Integer,String>> entrySet=Seferler.yolcuListesiIzmirIstanbul().entrySet();
        int koltukNo;
        String[] yolcuListesi;
        System.out.printf("%-9s   %-15s   %-15s","Koltuk No","Yolcu Adi","Yolcu Soyadi");
        System.out.println("\n------------------------------------------");

        for (Map.Entry<Integer,String> entry :entrySet){
            koltukNo=entry.getKey();
            yolcuListesi=entry.getValue().split(",");
            if (!yolcuListesi[0].equals("B")){
            System.out.printf("\n%-9d   %-15s   %-15s",koltukNo,yolcuListesi[1],yolcuListesi[2]);
        }}

    }
}
