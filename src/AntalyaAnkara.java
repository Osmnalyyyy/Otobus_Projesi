import java.util.Map;
import java.util.Set;

public class AntalyaAnkara {
    public static void antalyaAnkaraBosKoltukGoruntuleme() {
        Set<Map.Entry<Integer,String>> entrySet=Seferler.yolcuListesiAntalyaAnkara().entrySet();
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

    public static void antalyaAnkaraFiyatGoruntuleme() {
        System.out.println("ANTALYA-ANKARA sefer fiyati : 375 TL dir");
    }

    public static void antalyaAnkaraYolcuListeleme() {
        Set<Map.Entry<Integer,String>> entrySet=Seferler.yolcuListesiAntalyaAnkara().entrySet();
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

