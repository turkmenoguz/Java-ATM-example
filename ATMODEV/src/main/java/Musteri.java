public class Musteri  {
    public static void main(String[] args) {

    }
    private String tcKimlikNo;
    private String adSoyad;
    private int bakiye;
    private boolean kurumsal;

    public Musteri() {
    }

    public Musteri(String tcKimlikNo, String adSoyad, int bakiye, boolean kurumsal) {
        this.tcKimlikNo = tcKimlikNo;
        this.adSoyad = adSoyad;
        this.bakiye = bakiye;
        this.kurumsal = kurumsal;
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(String tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public boolean isKurumsal() {
        return kurumsal;
    }

    public void setKurumsal(boolean kurumsal) {
        this.kurumsal = kurumsal;
    }
}
