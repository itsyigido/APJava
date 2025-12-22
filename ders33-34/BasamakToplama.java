public class BasamakToplama {
    public static void main(String[] var0) {
      // Problem: Verilen bir sayının basamakları toplamını nasıl buluruz? Örn: 153 -> 1+5+3 = 9.

        // 1. Bir toplam değişkeni oluştur ve 0’a eşitle.
        // 2. Sayı 0’dan büyük olduğu sürece bir while döngüsü kur ( while (sayi > 0) ).
        // 3. Döngü içinde, sayının son basamağını % 10 ile al ( int basamak = sayi % 10; ).
        // 4. Bu basamağı toplam ’a ekle.
        // 5. Sayının son basamağını / 10 ile at ( sayi = sayi / 10; )

        int sayi = 153;
        String donusum = "" + sayi;
        int uzunluk = donusum.length();
        int toplam = 0;
        for (int i = 0; i < uzunluk; i++) {
            int bolen = (int) Math.pow(10, uzunluk - i - 1);
            
            int basamak = (sayi / bolen % 10 );
            toplam += basamak;
        }
        System.out.println("\n" + "Basamak Toplamı = " + toplam);
    }
}
