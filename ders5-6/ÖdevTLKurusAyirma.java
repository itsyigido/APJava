public class ÖdevTLKurusAyirma {
    public static void main(String[] args) {
        
        System.out.println("\n-- ÇÖZÜM--");
        double anapara = 127.85;
        // Ana paranın integer hali alındığı zaman küsürat alınmadığından dolayı parayının kuruş halini yok sayar ve sadece lira olan kısım kalır
        int lira = (int)anapara;
        // Ana paradan lira çıktığı zaman ortaya sadece kuruş kalır, ardından bunu 100 ile çarptığımızda tam değere ulaşırız.
        double kurus = (double)((anapara - lira) * 100 + 0.5);
        System.out.println("Paranız " + lira + " Lira " + (int)kurus + " Kuruştur");

        System.out.println("\n-- ALTERNATIF ÇÖZÜM--");

        double anapara2 = 127.85;
        // Burada iki adım içinde farklı farklı işlem yapmamak ve kafa karışıklığını önlemek adına Virgülden kurtuluyoruz
        int toplamKurus = (int)(anapara2 * 100);
        // Burada 100'e bölerek lirayı bölüyoruz burada bize bölüm kısmını verdiği ve oda liraya eşit olduğundan lirayı buluyoruz
        int lira2 = toplamKurus / 100;
        // Burada ise sayımızı yine 100'e bölüyoruz ancak burada mod işareti bizlere kalan kısmını verdiğinden ve oda kuruşa eşit olduğundan kuruşu buluyoruz
        int kurus2 = toplamKurus % 100;
        System.out.println("Ana Para : " + anapara2);
        System.out.println(lira2 +" Lira");
        System.out.println(kurus2 + " Kuruş" );
    }
}
