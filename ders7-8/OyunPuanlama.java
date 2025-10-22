/*
 * Yiğit Yaşar
 * Oyun Puanlama
 */

public class OyunPuanlama {
    public static void main(String[] args) {
        int puan = 0; // Puan 0 olarak belirlenir
        System.out.println("Başlangıç Oyun Skoru: " + puan); // Puanın çıktısı alınır
        puan += 10; // Mevcut puan 10 puan fazlasına eşitlenir
        System.out.println("Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
        puan -= 5; // Mevcut puan 5 puan eksiğine eşitlenir
        System.out.println("2. Kez Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
        puan /= 5; // Mevcut puanın 5 ile bölümüne eşitlenir
        System.out.println("3. Kez Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
        puan *= 5; // Mevcut puanın 5 katına eşitlenir
        System.out.println("4. Kez Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
        puan %= 2; // Mevcut puanın 2 ile bölümünden kalana(2 ile moduna) eşitlenir
        System.out.println("5. Kez Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
        puan++; // Mevcut puanın +(1) puan fazlasına eşitlenir
        System.out.println("6. Kez Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
        puan--; // Mevcut puanın -(1) puan eksiğine eşitlenir
        System.out.println("7. Kez Güncellenmiş Oyun Skoru: " + puan); // Puanın güncllenmiş halinin çıktısı alınır
    }
}
