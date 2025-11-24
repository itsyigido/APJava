public class zarAtmaDeneme {
    public static void main(String[] args) {
        Math.random(); // 0.0 ile 1.0 arasında rastgele sayı üretir
        double zar1 = Math.random();
        System.out.println("Zar 1: " + zar1);
        double rastgeleSayiorijinal = zar1 * 6;
        System.out.println("Rastgele Sayı Orijinal: " + rastgeleSayiorijinal);
        int rastgeleSayi = (int) (zar1 * 6);
        System.out.println("Rastgele Sayı: " + rastgeleSayi);
    }
}