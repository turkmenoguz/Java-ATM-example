public class BireyselMusteri extends Musteri {

    private String adres;

    public BireyselMusteri(){
    }

    public BireyselMusteri(String tcKimlikNo, String adSoyad, int bakiye, boolean kurumsal, String adres) {
        super(tcKimlikNo, adSoyad, bakiye, kurumsal);
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
