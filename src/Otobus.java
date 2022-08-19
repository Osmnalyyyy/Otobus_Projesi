import java.util.Scanner;

public class Otobus {
    static Scanner scan = new Scanner(System.in);

    public static void otobusAnaMenu() throws InterruptedException {
        System.out.println("=====================================");
        System.out.println("==========    GUZELYALI   ===========");
        System.out.println("===========    SEYAHAT   ============");
        System.out.println("=======   IYI GUNLER DILER   ========");
        System.out.println("========     HOSGELDINIZ     ========");
        System.out.println("=====================================");
        Thread.sleep(1000);

        System.out.println("Lutfen yapmak ıstediginiz islemi seciniz\n" +
                "1-Bilet Al\n" +
                "2-Seyahat Bilgileri\n" +
                "3-Bilet Iptal Etme\n" +
                "4-Cikis");
        char tercih;
        tercih = scan.next().charAt(0);
        switch (tercih) {
            case '1':
                biletAlMenusu();
                break;
            case '2':
                Seyehat.seyahatBilgileriMenusu();
                break;
            case '3':
                //   biletIptalEtmeMenusu();
                break;
            case '4':
                cikisMenusu();
                break;
            default:
                System.out.println("Yanlis secim yaptiniz \nAna menuye yonlendiriliyorsunuz");
                otobusAnaMenu();
        }


    }

    private static void biletAlMenusu() throws InterruptedException {
        scan.nextLine();
        System.out.println("----------------------------------------");
        System.out.println("  Bilet Satin Alma Menusune Hosgeldiniz");
        System.out.println("----------------------------------------");
        System.out.println("Lutfen kalkis ve varis noktasini seciniz" +
                "\n1-Istanbul-Antalya" +
                "\n2-Ankara-Izmir" +
                "\n3-Antalya-Ankara" +
                "\n4-Istanbul-Ankara" +
                "\n5-Izmir-Istanbul" +
                "\n6-Ana Menu");

        String seferSecimi = scan.nextLine();
        switch (seferSecimi) {
            case "1":
                Seferler.istanbulAntalyaSeferi();
                break;
            case "2":
                Seferler.ankaraIzmirSeferi();
                break;
            case "3":
                Seferler.antalyaAnkaraSeferi();
                break;
            case "4":
                Seferler.istanbulAnkaraSeferi();
                break;
            case "5":
                Seferler.izmirIstanbulSeferi();
                break;
            case "6":
                otobusAnaMenu();
                break;
            default:
                System.out.println("Yanlis secim yaptiniz");
                biletAlMenusu();
        }


    }

    private static void cikisMenusu() {
        System.out.println("GUZELYALI SEYAHAT IYI GUNLER DILER");
        System.out.println("********** HOSCAKALIN ************");
    }


}
