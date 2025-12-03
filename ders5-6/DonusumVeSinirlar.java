public class DonusumVeSinirlar{
    public static void main(String[] args) {
        System.out.println("\n-- Örnek --");
        int ortalama = (90 + 95 + 96) / 3;
        System.out.println("Ortalama: " + ortalama);
        
        double gercekOrtalama = (90 + 95 + 96) / 3.0;
        System.out.println("Gerçek Ortalama: " + gercekOrtalama);
        System.out.println("\n-- Başka Örnek --");
        // ** 
        int toplamNot = 290;
        int sinavSayisi = 3;

        int yanlisOrtalama = toplamNot / sinavSayisi;
        System.out.println("Yanlış Ortalama: " + yanlisOrtalama);

        double dogruOrtalama = (double) toplamNot / sinavSayisi;
        System.out.println("Doğru Ortalama: " + dogruOrtalama);
        System.out.println("\n-- Integer Sınırları --");
        // ** 
        System.out.println("Integer MAX: " + Integer.MAX_VALUE) ;
        System.out.println("Integer MIN: " + Integer.MIN_VALUE);

        int maksimumDeger = Integer.MAX_VALUE;
        System.out.println("Maksimum Değer:" + maksimumDeger);
        int tastanDeger = maksimumDeger + 1;
        System.out.println("Taştan Değer:" + tastanDeger);
    }
}
