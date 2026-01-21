public class BankaHesabiTest {
    public static void main(String[] args) {
        BankaHesabi hesap1 = new BankaHesabi("Yiğit Yaşar", 5000.0);
        BankaHesabi hesap2 = new BankaHesabi("Ahmet Hamdi Tanpınar", 3000.0);
        BankaHesabi hesap3 = new BankaHesabi("Mehmet Şahin", 1500.0);

        System.out.println("\n========== HESAP BİLGİLERİ ==========\n");
        hesap1.bilgileriYaz();
        System.out.println();
        hesap2.bilgileriYaz();
        System.out.println();
        hesap3.bilgileriYaz();

        System.out.println("\n========== PARA YATIRMA İŞLEMLERİ ==========\n");
        hesap1.paraYatir(2000.0);
        hesap2.paraYatir(1500.0);
        hesap3.paraYatir(500.0);

        System.out.println("\n========== PARA ÇEKME İŞLEMLERİ ==========\n");
        if (hesap1.paraCek(3000.0)) {
            System.out.println(hesap1.getHesapSahibi() + " başarıyla para çekmiştir.");
        }

        System.out.println();
        if (hesap3.paraCek(3000.0)) {
            System.out.println(hesap3.getHesapSahibi() + " başarıyla para çekmiştir.");
        } else {
            System.out.println(hesap3.getHesapSahibi() + " para çekme işlemi başarısız olmuştur.");
        }

        System.out.println();
        if (hesap2.paraCek(hesap2.getBakiye())) {
            System.out.println(hesap2.getHesapSahibi() + " tüm bakiyesini çekmiştir.");
        }

        System.out.println("\n========== SON BAKİYELER ==========\n");
        System.out.println("(ID: " + hesap1.getHesapID() + ") " + hesap1.getHesapSahibi() + " - Bakiye: " + hesap1.getBakiye() + " TL");
        System.out.println("(ID: " + hesap2.getHesapID() + ") " + hesap2.getHesapSahibi() + " - Bakiye: " + hesap2.getBakiye() + " TL");
        System.out.println("(ID: " + hesap3.getHesapID() + ") " + hesap3.getHesapSahibi() + " - Bakiye: " + hesap3.getBakiye() + " TL");
    }
}
