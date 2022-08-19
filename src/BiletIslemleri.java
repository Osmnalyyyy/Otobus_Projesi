import java.util.Scanner;

public class BiletIslemleri {

    public static void odemeMenusu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Odeme Menusune Hosgeldiniz");
        YolcuBilgileri yolcu = new YolcuBilgileri();
        double fiyat =Seferler.ucret;
        System.out.println("Odemeniz Gereken Fiyat : " + fiyat);
        System.out.println("Lutfen Kredi Karti Bilgilerinizi Giriniz");

        String kkNo;
        while (true) {
            System.out.println("KK no Giriniz");
            kkNo = scan.nextLine();
            if (kkNo.length() != 16) {
                System.out.println("Lutfen Kart Numarasini Dogru Giriniz");
            } else {
                break;
            }
        }
        System.out.println("Lutfen Isminizi Giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen Soyisminiz Giriniz");
        String soyIsim = scan.nextLine();

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyIsim = soyIsim.substring(0, 1).toUpperCase() + soyIsim.substring(1).replaceAll("\\w", "*");
        kkNo = "**** **** **** " + kkNo.substring(12);
        System.out.println(isim + " " + soyIsim + "\n" + kkNo);
        System.out.println(fiyat+" Odenmistir ");

    }

}
