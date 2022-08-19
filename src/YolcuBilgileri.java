import java.util.Scanner;

public class YolcuBilgileri {
    static Scanner scan = new Scanner(System.in);
    private String yolcuIsmi;
    private String yolcuSoyIsmi;
    private String yolcuTcNo;
    private String yolcuTelNo;
    private Double odenecekFiyat;

    public Double getOdenecekFiyat() {
        return odenecekFiyat;
    }

    public void setOdenecekFiyat(Double odenecekFiyat) {
        this.odenecekFiyat = odenecekFiyat;
    }

    public String getYolcuIsmi() {
        return yolcuIsmi;
    }

    public void setYolcuIsmi(String yolcuIsmi) {
        this.yolcuIsmi = yolcuIsmi;
    }

    public String getYolcuSoyIsmi() {
        return yolcuSoyIsmi;
    }

    public void setYolcuSoyIsmi(String yolcuSoyIsmi) {
        this.yolcuSoyIsmi = yolcuSoyIsmi;
    }

    public String getYolcuTcNo() {
        return yolcuTcNo;
    }

    public void setYolcuTcNo(String yolcuTcNo) {
        this.yolcuTcNo = yolcuTcNo;
    }

    public YolcuBilgileri() {

    }

    public String getYolcuTelNo() {
        return yolcuTelNo;
    }

    public void setYolcuTelNo(String yolcuTelNo) {
        this.yolcuTelNo = yolcuTelNo;
    }

    @Override
    public String toString() {
        return
                "\nIsmi : " + yolcuIsmi + " " +
                        "Soyisim : " + yolcuSoyIsmi + " " +
                        "Tcno : " + yolcuTcNo+" " +
                        "Tel. no : " +yolcuTelNo;
    }
}
