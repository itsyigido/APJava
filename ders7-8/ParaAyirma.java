public class ParaAyirma {
    public static void main(String[] args) {
        double para = 127.85; // Başlangıçtaki para miktarı kesiriyle beraber alınır
        double toplamkurus = para * 100; // Mevcut parayı 100 ile çarparak toplam paranın kaç kuruş olduğu bulunur
        int lira = (int)toplamkurus / 100; // Toplam kuruştan başlangıç miktarının kuruşu ayrıştırılarak lira kısmı bulunur
        int kurus = (int)toplamkurus % 100; // Toplam kuruşun modu alınarak başlangıç miktarınının kuruş kısmı bulunur
        System.out.println("Girilen Para: " + para); // Başlangıç parasının çıktısı alınır 
        System.out.println("----------------"); 
        System.out.println(lira + " Lira"); // Başlangıç parasının lira kısmının çıktısı
        System.out.println(kurus + " Kuruş"); // Başlangıç parasının kuruş kısmının çıktısı
    }
}
