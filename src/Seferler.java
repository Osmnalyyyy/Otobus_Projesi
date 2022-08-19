import java.util.*;

public class Seferler {
    static Scanner scan = new Scanner(System.in);
    public static Map<Integer, String> istanbulAntalya = new HashMap<>();
    public static Map<Integer, String> ankaraIzmir = new HashMap<>();
    public static Map<Integer, String> antalyaAnkara = new HashMap<>();
    public static Map<Integer, String> istanbulAnkara = new HashMap<>();
    public static Map<Integer, String> izmirIstanbul = new HashMap<>();
   static double ucret;

    public static Map<Integer, String> yolcuListesiIstanbulAnkara() {
        istanbulAnkara.put(1, "E,DAbdullatif,Abzak,2131545,15111021412");
        istanbulAnkara.put(2, "K,Fatma Ozlem,Acar,1254875,15111021436");
        istanbulAnkara.put(3, "B,,,,");
        istanbulAnkara.put(4, "B,,,,");
        istanbulAnkara.put(5, "K,Ozde,Acarkan,2131545,15111341436");
        istanbulAnkara.put(6, "B,,,, ");
        istanbulAnkara.put(7, "E,Atahan,Adanir,2131545,15111045436");
        istanbulAnkara.put(8, "B,,,, ");
        istanbulAnkara.put(9, "E,Murat,Adanir,2131545,15111045436");
        istanbulAnkara.put(10, "B,,,,");
        istanbulAnkara.put(11, "B,,,,");
        istanbulAnkara.put(12, "B,,,, ");
        istanbulAnkara.put(13, "B,,,, ");
        istanbulAnkara.put(14, "B,,,, ");
        istanbulAnkara.put(15, "E,Bestami,Agıragac,2131545,15111013436");
        istanbulAnkara.put(16, "B,,,, ");
        istanbulAnkara.put(17, "B,,,, ");
        istanbulAnkara.put(18, "E,Hakli,Agır,2131545,15111013436");
        istanbulAnkara.put(19, "B,,,,");
        istanbulAnkara.put(20, "E,Levent,Ak,2131545,15111013436");
        istanbulAnkara.put(21, "B,,,,");
        istanbulAnkara.put(22, "B,,,, ");
        istanbulAnkara.put(23, "B,,,, ");
        istanbulAnkara.put(24, "B,,,,");
        istanbulAnkara.put(25, "E,Aykanat,Agnar,2131545,15118721436");
        istanbulAnkara.put(26, "B,,,,");
        istanbulAnkara.put(27, "B,,,,");
        istanbulAnkara.put(28, "B,,,,");
        istanbulAnkara.put(29, "B,,,,");
        istanbulAnkara.put(30, "B,,,,");
        istanbulAnkara.put(31, "B,,,,");
        istanbulAnkara.put(32, "B,,,,");
        istanbulAnkara.put(33, "K,Mugenur,Ak,2131545,15119821436");

        return istanbulAnkara;
    }

    public static Map<Integer, String> yolcuListesiAnkaraIzmir() {
        ankaraIzmir.put(1, "E,Kayihan Nedim,Akarcali,8134583,97340222728");
        ankaraIzmir.put(2, "E,Lemi,Akarcay,1387363,74469147248");
        ankaraIzmir.put(3, "B,,,,");
        ankaraIzmir.put(4, "B,,,,");
        ankaraIzmir.put(5, "E,Rafi,Akas,1488532,79504812792");
        ankaraIzmir.put(6, "B,,,,");
        ankaraIzmir.put(7, "B,,,,");
        ankaraIzmir.put(8, "B,,,,");
        ankaraIzmir.put(9, "E,Rafet,Akay,9016731,36190943230");
        ankaraIzmir.put(10, "B,,,,");
        ankaraIzmir.put(11, "B,,,,");
        ankaraIzmir.put(12, "E,Mehmetcan,Akay,5843658,66875410108");
        ankaraIzmir.put(13, "B,,,,");
        ankaraIzmir.put(14, "B,,,,");
        ankaraIzmir.put(15, "K,Emine Munevver,Akca,6836873,95917660812");
        ankaraIzmir.put(16, "B,,,,");
        ankaraIzmir.put(17, "B,,,,");
        ankaraIzmir.put(18, "E,Servet,Akcagunay,1404778,15402646244");
        ankaraIzmir.put(19, "B,,,,");
        ankaraIzmir.put(20, "B,,,,");
        ankaraIzmir.put(21, "B,,,,");
        ankaraIzmir.put(22, "K,Cilem,Akcay,5827277,95596080024");
        ankaraIzmir.put(23, "B,,,,");
        ankaraIzmir.put(24, "B,,,,");
        ankaraIzmir.put(25, "B,,,,");
        ankaraIzmir.put(26, "B,,,,");
        ankaraIzmir.put(27, "B,,,,");
        ankaraIzmir.put(28, "B,,,,");
        ankaraIzmir.put(29, "B,,,,");
        ankaraIzmir.put(30, "B,,,,");
        ankaraIzmir.put(31, "B,,,,");
        ankaraIzmir.put(32, "B,,,,");
        ankaraIzmir.put(33, "B,,,,");


        return ankaraIzmir;
    }


    public static Map<Integer, String> yolcuListesiAntalyaAnkara() {
        antalyaAnkara.put(1, "E,Sarper,Akıs,4471273,91950519728");
        antalyaAnkara.put(3, "B,,,,");
        antalyaAnkara.put(2, "B,,,,");
        antalyaAnkara.put(4, "B,,,,");
        antalyaAnkara.put(5, "B,,,,");
        antalyaAnkara.put(6, "E,Ahmet Rasit,Akoguz,4096357,65891402746");
        antalyaAnkara.put(7, "B,,,,");
        antalyaAnkara.put(8, "B,,,,");
        antalyaAnkara.put(9, "B,,,,");
        antalyaAnkara.put(10, "B,,,,");
        antalyaAnkara.put(11, "B,,,,");
        antalyaAnkara.put(12, "K,Nukhet,Aksan,8643134,46905496036");
        antalyaAnkara.put(13, "B,,,,");
        antalyaAnkara.put(14, "K,Senem,Aksevim,9452998,96843060950");
        antalyaAnkara.put(15, "B,,,,");
        antalyaAnkara.put(16, "B,,,,");
        antalyaAnkara.put(17, "B,,,,");
        antalyaAnkara.put(18, "B,,,,");
        antalyaAnkara.put(19, "B,,,,");
        antalyaAnkara.put(20, "K,Semina,Aktuna,8017435,93709058090");
        antalyaAnkara.put(21, "B,,,,");
        antalyaAnkara.put(22, "B,,,,");
        antalyaAnkara.put(23, "B,,,,");
        antalyaAnkara.put(24, "B,,,,");
        antalyaAnkara.put(25, "E,Ali,Akyildirim,8546068,32609927334");
        antalyaAnkara.put(26, "B,,,,");
        antalyaAnkara.put(27, "B,,,,");
        antalyaAnkara.put(28, "B,,,,");
        antalyaAnkara.put(29, "B,,,,");
        antalyaAnkara.put(30, "B,,,,");
        antalyaAnkara.put(31, "B,,,,");
        antalyaAnkara.put(32, "B,,,,");
        antalyaAnkara.put(33, "B,,,,");


        return antalyaAnkara;
    }


    public static Map<Integer, String> yolcuListesiIstanbulAntalya() {
        istanbulAntalya.put(1, "B,,,,");
        istanbulAntalya.put(2, "B,,,,");
        istanbulAntalya.put(3, "B,,,,");
        istanbulAntalya.put(4, "K,Nesibe Nurefsan,Alkan,6945117,78814879822");
        istanbulAntalya.put(5, "B,,,,");
        istanbulAntalya.put(6, "B,,,,");
        istanbulAntalya.put(7, "K,Hiba,Alpugan,4541909,65385258170");
        istanbulAntalya.put(8, "B,,,,");
        istanbulAntalya.put(9, "B,,,,");
        istanbulAntalya.put(10, "K,Elif Tugce,Altas,4654979,68745199458");
        istanbulAntalya.put(11, "B,,,,");
        istanbulAntalya.put(12, "E,Ahmet Ruken,Altay,2001159,47798367786");
        istanbulAntalya.put(13, "B,,,,");
        istanbulAntalya.put(14, "B,,,,");
        istanbulAntalya.put(15, "B,,,,");
        istanbulAntalya.put(16, "B,,,,");
        istanbulAntalya.put(17, "B,,,,");
        istanbulAntalya.put(18, "B,,,,");
        istanbulAntalya.put(19, "E,Burak Tatkan,Altıntas,9814552,51261677432");
        istanbulAntalya.put(20, "B,,,,");
        istanbulAntalya.put(21, "B,,,,");
        istanbulAntalya.put(22, "K,Rima,Altıparmak,1100805,17072904594");
        istanbulAntalya.put(23, "B,,,,");
        istanbulAntalya.put(24, "B,,,,");
        istanbulAntalya.put(25, "B,,,,");
        istanbulAntalya.put(26, "B,,,,");
        istanbulAntalya.put(27, "B,,,,");
        istanbulAntalya.put(28, "B,,,,");
        istanbulAntalya.put(29, "K,Nefse,Altunbulak,1871198,77912165356");
        istanbulAntalya.put(30, "B,,,,");
        istanbulAntalya.put(31, "B,,,,");
        istanbulAntalya.put(32, "B,,,,");
        istanbulAntalya.put(33, "E,Volkan,Altun,6492319,29225002170");

        return istanbulAntalya;
    }


    public static Map<Integer, String> yolcuListesiIzmirIstanbul() {
        izmirIstanbul.put(1, "K,Cisem,Atok,6993574,80878123568");
        izmirIstanbul.put(2, "K,Rubabe Gokcen,Atlı,7805432,82166550216");
        izmirIstanbul.put(3, "K,İlkim,Atescan,6434854,16241659228");
        izmirIstanbul.put(4, "B,,,,");
        izmirIstanbul.put(5, "K,Hanife Duygu,Ata,1719644,62968023286");
        izmirIstanbul.put(6, "B,,,,");
        izmirIstanbul.put(7, "B,,,,");
        izmirIstanbul.put(8, "K,Hayrunnisa,Asveren,9725260,10702098298");
        izmirIstanbul.put(9, "B,,,,");
        izmirIstanbul.put(10, "B,,,,");
        izmirIstanbul.put(11, "B,,,,");
        izmirIstanbul.put(12, "B,,,,");
        izmirIstanbul.put(13, "B,,,,");
        izmirIstanbul.put(14, "K,Serife,Asil,5620334,55056250862");
        izmirIstanbul.put(15, "B,,,,");
        izmirIstanbul.put(16, "B,,,,");
        izmirIstanbul.put(17, "K,Seyda Nur,Arikan,5989395,40453897932");
        izmirIstanbul.put(18, "B,,,,");
        izmirIstanbul.put(19, "B,,,,");
        izmirIstanbul.put(20, "B,,,,");
        izmirIstanbul.put(21, "B,,,,");
        izmirIstanbul.put(22, "E,Memet Ali,Ardic,9185930,74085831736");
        izmirIstanbul.put(23, "B,,,,");
        izmirIstanbul.put(24, "B,,,,");
        izmirIstanbul.put(25, "B,,,,");
        izmirIstanbul.put(26, "B,,,,");
        izmirIstanbul.put(27, "B,,,,");
        izmirIstanbul.put(28, "B,,,,");
        izmirIstanbul.put(29, "B,,,,");
        izmirIstanbul.put(30, "B,,,,");
        izmirIstanbul.put(31, "B,,,,");
        izmirIstanbul.put(32, "B,,,,");
        izmirIstanbul.put(33, "K,Busra Gul,Altundal,6744694,75437000602");
        return izmirIstanbul;
    }

    public static void istanbulAntalyaSeferi() {
        System.out.println("ISTANBUL-ANTALYA SEFERINE HOS GELDINIZ");
        Set<Map.Entry<Integer, String>> entrySeti = yolcuListesiIstanbulAntalya().entrySet();

        Integer koltukNumarasi;
        String yolcuBilgisi;
        String[] yolcu1;
        Integer count = 1;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltukNumarasi = entry.getKey();
            yolcu1 = entry.getValue().split(",");

            System.out.printf("%-2d-%s  ", koltukNumarasi, yolcu1[0]);
            if (count % 3 == 0) {
                System.out.println();
            }
            count++;
        }

        Integer secilenKoltukNo;
        while (true) {
            System.out.println("Lutfen Secmek Istediginiz Koltuk Numarasini giriniz");
            secilenKoltukNo = scan.nextInt();
            if (secilenKoltukNo > 0 && secilenKoltukNo < 34) {
                break;
            }
        }

        Integer koltuk;
        String[] koltukArrayi;


        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltuk = entry.getKey();
            koltukArrayi = entry.getValue().split(",");

            if (secilenKoltukNo == koltuk) {
                if (koltukArrayi[0].equals("B")) {
                    String eklenecekYolcu = yolcuBilgileriAlma();
                    String[] yolcuBilgisiArray = eklenecekYolcu.split(",");
                    System.out.println(secilenKoltukNo + " Numara " + yolcuBilgisiArray[1] + " " + yolcuBilgisiArray[2]);
                    istanbulAntalya.put(secilenKoltukNo, eklenecekYolcu);
                    YolcuBilgileri yolcu = new YolcuBilgileri();
                    ucret = 500;

                    BiletIslemleri.odemeMenusu();
                } else {
                    System.out.println("Sectiginiz Koltuk Doludur Lutfen Bos Koltuk Seciniz");
                }
            }
        }


    }



    public static void ankaraIzmirSeferi() {

        System.out.println("ANKARA-IZMIR SEFERINE HOS GELDINIZ");
        Set<Map.Entry<Integer, String>> entrySeti = yolcuListesiAnkaraIzmir().entrySet();

        Integer koltukNumarasi;
        String yolcuBilgisi;
        String[] yolcu;
        Integer count = 1;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltukNumarasi = entry.getKey();
            yolcu = entry.getValue().split(",");

            System.out.printf("%-2d-%s  ", koltukNumarasi, yolcu[0]);
            if (count % 3 == 0) {
                System.out.println();
            }
            count++;
        }

        Integer secilenKoltukNo;
        while (true) {
            System.out.println("Lutfen Secmek Istediginiz Koltuk Numarasini giriniz");
            secilenKoltukNo = scan.nextInt();
            if (secilenKoltukNo > 0 && secilenKoltukNo < 34) {
                break;
            }
        }

        Integer koltuk;
        String[] koltukArrayi;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltuk = entry.getKey();
            koltukArrayi = entry.getValue().split(",");

            if (secilenKoltukNo == koltuk) {
                if (koltukArrayi[0].equals("B")) {
                    String eklenecekYolcu = yolcuBilgileriAlma();
                    String[] yolcuBilgisiArray = eklenecekYolcu.split(",");
                    System.out.println(secilenKoltukNo + " Numara " + yolcuBilgisiArray[1] + " " + yolcuBilgisiArray[2]);
                    yolcuListesiAnkaraIzmir().put(secilenKoltukNo, eklenecekYolcu);
                    YolcuBilgileri yolcu1 = new YolcuBilgileri();
                     ucret = 350;

                    BiletIslemleri.odemeMenusu();
                } else {
                    System.out.println("Sectiginiz Koltuk Doludur Lutfen Bos Koltuk Seciniz");
                }
            }
        }


    }

    public static void antalyaAnkaraSeferi() {


        System.out.println("ANTALYA-ANKARA SEFERINE HOS GELDINIZ");
        Set<Map.Entry<Integer, String>> entrySeti = yolcuListesiAntalyaAnkara().entrySet();

        Integer koltukNumarasi;
        String yolcuBilgisi;
        String[] yolcu;
        Integer count = 1;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltukNumarasi = entry.getKey();
            yolcu = entry.getValue().split(",");

            System.out.printf("%-2d-%s  ", koltukNumarasi, yolcu[0]);
            if (count % 3 == 0) {
                System.out.println();
            }
            count++;
        }

        Integer secilenKoltukNo;
        while (true) {
            System.out.println("Lutfen Secmek Istediginiz Koltuk Numarasini giriniz");
            secilenKoltukNo = scan.nextInt();
            if (secilenKoltukNo > 0 && secilenKoltukNo < 34) {
                break;
            }
        }

        Integer koltuk;
        String[] koltukArrayi;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltuk = entry.getKey();
            koltukArrayi = entry.getValue().split(",");

            if (secilenKoltukNo == koltuk) {
                if (koltukArrayi[0].equals("B")) {
                    String eklenecekYolcu = yolcuBilgileriAlma();
                    String[] yolcuBilgisiArray = eklenecekYolcu.split(",");
                    System.out.println(secilenKoltukNo + " Numara " + yolcuBilgisiArray[1] + " " + yolcuBilgisiArray[2]);
                    yolcuListesiAntalyaAnkara().put(secilenKoltukNo, eklenecekYolcu);
                    YolcuBilgileri yolcu1 = new YolcuBilgileri();
                    ucret = 375;

                    BiletIslemleri.odemeMenusu();
                } else {
                    System.out.println("Sectiginiz Koltuk Doludur Lutfen Bos Koltuk Seciniz");
                }
            }
        }


    }


    public static void istanbulAnkaraSeferi() {


        System.out.println("ISTANBUL-ANKARA SEFERINE HOS GELDINIZ");
        Set<Map.Entry<Integer, String>> entrySeti = yolcuListesiIstanbulAntalya().entrySet();

        Integer koltukNumarasi;
        String yolcuBilgisi;
        String[] yolcu;
        Integer count = 1;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltukNumarasi = entry.getKey();
            yolcu = entry.getValue().split(",");

            System.out.printf("%-2d-%s  ", koltukNumarasi, yolcu[0]);
            if (count % 3 == 0) {
                System.out.println();
            }
            count++;
        }

        Integer secilenKoltukNo;
        while (true) {
            System.out.println("Lutfen Secmek Istediginiz Koltuk Numarasini giriniz");
            secilenKoltukNo = scan.nextInt();
            if (secilenKoltukNo > 0 && secilenKoltukNo < 34) {
                break;
            }
        }

        Integer koltuk;
        String[] koltukArrayi;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltuk = entry.getKey();
            koltukArrayi = entry.getValue().split(",");

            if (secilenKoltukNo == koltuk) {
                if (koltukArrayi[0].equals("B")) {
                    String eklenecekYolcu = yolcuBilgileriAlma();
                    String[] yolcuBilgisiArray = eklenecekYolcu.split(",");
                    System.out.println(secilenKoltukNo + " Numara " + yolcuBilgisiArray[1] + " " + yolcuBilgisiArray[2]);
                    yolcuListesiIstanbulAnkara().put(secilenKoltukNo, eklenecekYolcu);
                    YolcuBilgileri yolcu1 = new YolcuBilgileri();
                  ucret = 250;

                    BiletIslemleri.odemeMenusu();
                } else {
                    System.out.println("Sectiginiz Koltuk Doludur Lutfen Bos Koltuk Seciniz");
                }
            }
        }

    }

    public static void izmirIstanbulSeferi() {


        System.out.println("IZMIR-ISTANBUL SEFERINE HOS GELDINIZ");
        Set<Map.Entry<Integer, String>> entrySeti = yolcuListesiIzmirIstanbul().entrySet();

        Integer koltukNumarasi;
        String yolcuBilgisi;
        String[] yolcu;
        Integer count = 1;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltukNumarasi = entry.getKey();
            yolcu = entry.getValue().split(",");

            System.out.printf("%-2d-%s  ", koltukNumarasi, yolcu[0]);
            if (count % 3 == 0) {
                System.out.println();
            }
            count++;
        }

        Integer secilenKoltukNo;
        while (true) {
            System.out.println("Lutfen Secmek Istediginiz Koltuk Numarasini giriniz");
            secilenKoltukNo = scan.nextInt();
            if (secilenKoltukNo > 0 && secilenKoltukNo < 34) {
                break;
            }
        }

        Integer koltuk;
        String[] koltukArrayi;
        for (Map.Entry<Integer, String> entry : entrySeti) {
            koltuk = entry.getKey();
            koltukArrayi = entry.getValue().split(",");

            if (secilenKoltukNo == koltuk) {
                if (koltukArrayi[0].equals("B")) {
                    String eklenecekYolcu = yolcuBilgileriAlma();
                    String[] yolcuBilgisiArray = eklenecekYolcu.split(",");
                    System.out.println(secilenKoltukNo + " Numara " + yolcuBilgisiArray[1] + " " + yolcuBilgisiArray[2]);
                    yolcuListesiIzmirIstanbul().put(secilenKoltukNo, eklenecekYolcu);
                    YolcuBilgileri yolcu1 = new YolcuBilgileri();
                   ucret = 300;


                    BiletIslemleri.odemeMenusu();
                } else {
                    System.out.println("Sectiginiz Koltuk Doludur Lutfen Bos Koltuk Seciniz");
                }
            }
        }

    }
    public static String yolcuBilgileriAlma() {


        System.out.println("Lutfen Yolcu Bilgilerini Giriniz");
        String cinsiyet;
        while (true) {
            System.out.println("Lutfen cinsiyetinizi giriniz E/K");
            cinsiyet = scan.next().substring(0, 1).toUpperCase();
            if (cinsiyet.equals("E") || cinsiyet.equals("K")) {
                break;
            }
        }

        YolcuBilgileri yolcu = new YolcuBilgileri();
        scan.nextLine();
        System.out.println("Lutfen Isminizi Giriniz");
        String isim = scan.nextLine();
        yolcu.setYolcuIsmi(isim);
        System.out.println("Lutfen Soyisminizi Giriniz");
        String soyisim = scan.nextLine();
        yolcu.setYolcuSoyIsmi(soyisim);

        String tcNo;
        while (true) {
            System.out.println("Lutfen Tc no giriniz");
            tcNo = scan.nextLine();
            if (tcNo.length() != 11) {
                System.out.println("Lutfen Tc no giriniz\nDevlet oyle istiyor");
            } else {
                yolcu.setYolcuTcNo(tcNo);
                break;
            }
        }
        System.out.println("Lutfen telefon numaranizi giriniz");
        String telNo = scan.nextLine();
        yolcu.setYolcuTelNo(telNo);


        String yolcuBilgisi = cinsiyet + "," + isim + "," + soyisim + "," + telNo + "," + tcNo;


        return yolcuBilgisi;
    }

}