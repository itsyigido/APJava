public class ÖdevBankaHesabi {
    public static void main(String[] args) {

        System.out.println("\n-- ÇÖZÜM--");
        double anapara = 100;
        double yatirilanpara = 200;
        double cekilenpara = 50;
        // Banka hesabına 200 tl yatırıldı
        anapara = anapara + yatirilanpara;

        System.out.println("Para Yatırma işleminiz başarıyla gerçekleşti. Işlem sonu Bakineyiz: " + anapara);

        // Banka hesabından 2 kere 50 tl çekildi
        anapara = anapara - ( cekilenpara * 2 );
        System.out.println("Para çekme işleminiz başarıyla gerçekleşti. Işlem sonu Bakiyeniz: " + anapara);
    }
}
