public class KurumsalMusteri  extends Musteri{

    public String sirketadi;

    public KurumsalMusteri() {
    }

    public KurumsalMusteri(String tcKimlikNo, String adSoyad, int bakiye, boolean kurumsal, String sirketadi) {
        super(tcKimlikNo, adSoyad, bakiye, kurumsal);
        this.sirketadi = sirketadi;
    }

    public String getSirketadi() {
        return sirketadi;
    }

    public void setSirketadi(String sirketadi) {
        this.sirketadi = sirketadi;
    }
}
