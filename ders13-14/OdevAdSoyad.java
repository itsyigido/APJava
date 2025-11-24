public class OdevAdSoyad {
        public static void main(String[] args) {
        String adSoyad = "Yiğit Yaşar";
        int adSoyadUzunluk = adSoyad.length();
        int boslukIndex = adSoyad.indexOf(" ");
        System.out.println("\n" + "Ad Soyad Uzunluğu: " + adSoyadUzunluk + "\n" +
                           "Boşluk İndexi: " + boslukIndex);
    }
}
