import java.util.Scanner;

public class Seyehat {
    static Scanner scan = new Scanner(System.in);

    public static void seyahatBilgileriMenusu() throws InterruptedException {
        System.out.println("Seyahat Bilgileri Menusune Hosgeldiniz");
        System.out.println("Lutfen Bilgilerini Gormek Istediginiz Seferi Seciniz\n" +
                "1-Istanbul-Antalya" +
                "\n2-Ankara-Izmir" +
                "\n3-Antalya-Ankara" +
                "\n4-Istanbul-Ankara" +
                "\n5-Izmir-Istanbul" +
                "\n6-AnaMenu");
        Integer secim = scan.nextInt();
        switch (secim) {
            case 1:
                istanbulAntalyaMenusu();
                break;
            case 2:
                ankaraIzmirMenusu();
                break;
            case 3:
                antalyaAnkaraMenusu();
                break;
            case 4:
                istanbulAnkaraMenusu();
                break;
            case 5:
                izmirIstanbulMenusu();
                break;
            case 6:
                Otobus.otobusAnaMenu();
                break;
            default:
                System.out.println("Yanlis secim yaptiniz");
                seyahatBilgileriMenusu();
        }


    }

    private static void izmirIstanbulMenusu() {
        System.out.println("Sefer adi : Izmir-Istanbul" +
                "\nLutfen Seciminizi Yapiniz" +
                "\n1-Yolcu Listesi" +
                "\n2-Fiyat Goruntuleme" +
                "\n3-Bos Koltuk Listesi");
        Integer secim = scan.nextInt();
        switch (secim) {
            case 1:
                IzmirIstanbul.izmirIstanbulYolcuListesiYazdir();
                break;
            case 2:
                IzmirIstanbul.fiyatGoruntuleme();
                break;
            case 3:
                IzmirIstanbul.bosKoltukGoruntuleme();
                break;

        }
    }

    private static void istanbulAnkaraMenusu() {
        System.out.println("Sefer adi : Istanbul-Ankara" +
                "\nLutfen Seciminizi Yapiniz" +
                "\n1-Yolcu Listesi" +
                "\n2-Fiyat Goruntuleme" +
                "\n3-Bos Koltuk Listesi");
        Integer secim = scan.nextInt();
        switch (secim) {
            case 1:
                IstanbulAnkara.istanbulAnkaraYolcuListesiYazdir();
                break;
            case 2:
                IstanbulAnkara.fiyatGoruntuleme();
                break;
            case 3:
                IstanbulAnkara.bosKoltukListelem();
                break;

        }


    }

    private static void antalyaAnkaraMenusu() {
        System.out.println("Sefer adi : Antalya-Ankara" +
                "\nLutfen Seciminizi Yapiniz" +
                "\n1-Yolcu Listesi" +
                "\n2-Fiyat Goruntuleme" +
                "\n3-Bos Koltuk Listesi");
        Integer secim = scan.nextInt();
        switch (secim) {
            case 1:
                AntalyaAnkara.antalyaAnkaraYolcuListeleme();
                break;
            case 2:
                AntalyaAnkara.antalyaAnkaraFiyatGoruntuleme();
                break;
            case 3:
                AntalyaAnkara.antalyaAnkaraBosKoltukGoruntuleme();
                break;

        }
    }

    private static void ankaraIzmirMenusu() {
        System.out.println("Sefer adi : Ankara-Izmir" +
                "\nLutfen Seciminizi Yapiniz" +
                "\n1-Yolcu Listesi" +
                "\n2-Fiyat Goruntuleme" +
                "\n3-Bos Koltuk Listesi");
        Integer secim = scan.nextInt();
        switch (secim) {
            case 1:
                AnkaraIzmir.ankaraIzmirYolcuListele();
                break;
            case 2:
                AnkaraIzmir.ankaraIzmirFiyatGoruntule();
                break;
            case 3:
                AnkaraIzmir.ankaraIzmirBosKoltukListele();
                break;
            default:
                ankaraIzmirMenusu();
        }
    }

    private static void istanbulAntalyaMenusu() {
        System.out.println("Sefer adi : Istanbul-ANtalya" +
                "\nLutfen Seciminizi Yapiniz" +
                "\n1-Yolcu Listesi" +
                "\n2-Fiyat Goruntuleme" +
                "\n3-Bos Koltuk Listesi");
        Integer secim = scan.nextInt();
        switch (secim) {
            case 1:
                IstanbulAntalya.istanbulAntalyaYolcuListesiYazdir();
                break;
            case 2:
                IstanbulAntalya.istanbulAntalyaFiyatGoruntule();
                break;
            case 3:
                IstanbulAntalya.istanbulAntalyaBoskoltukListele();
                break;
            default:
                istanbulAntalyaMenusu();
        }
    }
}
