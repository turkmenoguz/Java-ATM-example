import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtmBase {

    public static void main(String[] args) {


        BireyselMusteri bireyselMusteri1 = new BireyselMusteri("1111","Oğuzhan",1111,false,"Trabzon");
        BireyselMusteri bireyselMusteri2 = new BireyselMusteri("2222","Hakan",2222,false,"İstanbul");
        BireyselMusteri bireyselMusteri3 = new BireyselMusteri();
        bireyselMusteri3.setAdSoyad("Ali");
        bireyselMusteri3.setTcKimlikNo("3333");
        bireyselMusteri3.setBakiye(3333);
        bireyselMusteri3.setAdres("Ankara");
        bireyselMusteri3.setKurumsal((false));

        KurumsalMusteri kurumsalMusteri1 = new KurumsalMusteri("4444","Ayşe",4444,true,"İstanbul");
        KurumsalMusteri kurumsalMusteri2 = new KurumsalMusteri("5555","Zeynep",5555,true,"İzmir");

        KurumsalMusteri kurumsalMusteri3 = new KurumsalMusteri();
        kurumsalMusteri3.setAdSoyad("Hakan");
        kurumsalMusteri3.setTcKimlikNo("6666");
        kurumsalMusteri3.setBakiye(6666);
        kurumsalMusteri3.setSirketadi("Testinium");
        kurumsalMusteri3.setKurumsal((true));

        List<Musteri> musteriList = new ArrayList<>();
        musteriList.add(bireyselMusteri1);
        musteriList.add(bireyselMusteri2);
        musteriList.add(bireyselMusteri3);
        musteriList.add(kurumsalMusteri1);
        musteriList.add(kurumsalMusteri2);
        musteriList.add(kurumsalMusteri3);

        System.out.println("Bankaya Hoşgeldiniz");
        System.out.println("Müşteri no giriniz");
        Scanner scan = new Scanner(System.in);
        String alinanbilgi = scan.nextLine();

        int anapara = -1;

        for (int i = 0; i < musteriList.size(); i++) {

            if (musteriList.get(i).getTcKimlikNo().equals(alinanbilgi)) {

                if (musteriList.get(i).isKurumsal()) {
                    System.out.println("Sayın " + musteriList.get(i).getAdSoyad() + " Hoşgeldiniz\n" + "Tc:" + musteriList.get(i).getTcKimlikNo() + "\n" + "Bakiye " + musteriList.get(i).getBakiye() + "\n" + " Kurumsal bir şirkettir");
                } else {
                    System.out.println("Sayın " + musteriList.get(i).getAdSoyad() + " Hoşgeldiniz\n" + "Tc: " + musteriList.get(i).getTcKimlikNo() + "\n" + "Bakiye " + musteriList.get(i).getBakiye() + "\n" + "Bireysel müşteridir.");
                }
                anapara = musteriList.get(i).getBakiye();
            }

        }
        if(anapara == -1) {
            System.out.println( "Yanlıs Müşteri numarası");
            return ;
        }

        System.out.println("----------------");
        System.out.println("İşlemler için 10 ve katlarını kullanınız.");
        System.out.println("----------------");
        System.out.println("Yapmak istediğiniz işlemi seçiniz:\nPara yatırmak için 1'e\nPara çekmek için 2 ye basınız.");
        Scanner scan2 = new Scanner(System.in);
        int deger = scan2.nextInt();
        System.out.print("İşlem yapmak istediğiniz tutarı giriniz: ");
        int tutar = scan.nextInt();

        islemler mislemler = new islemler();
        int yenibakiye;

        switch (deger) {

            case 1:
                yenibakiye = mislemler.paraYatırma(anapara, tutar);
                System.out.println("Yeni bakiyeniz = " + yenibakiye);
                System.out.print("İyi Günler ");
                break;

            case 2:
                yenibakiye = mislemler.paraCekme(anapara, tutar);
                if (yenibakiye != -1)
                {
                    System.out.println("Yeni bakiyeniz = " + yenibakiye);
                    System.out.print("İyi Günler ");
                }
                break;
        }
    }
    static class islemler {

        public int paraYatırma(int anapara, int tutar) {
            return  anapara + tutar;
        }

        public int paraCekme(int anapara, int tutar) {
            if (tutar> anapara) {
                System.out.println("yetersiz bakiye");
                return -1;
            }
            else {
                return anapara - tutar;
            }
        }
    }

}

