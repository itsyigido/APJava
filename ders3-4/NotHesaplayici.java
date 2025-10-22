public class NotHesaplayici {
        public static void main(String[] args) {

        int sayi1 = 78; // 1. Sayı belirlenir
        int sayi2 = 37; // 2. Sayı belirlenir

        int notOrtalama = (sayi1 + sayi2) / 2; // Iki sayı toplanıp kaç adet sayı olduğuna bölünerek aritmetik ortalaması alınır
        System.out.println("Not Hesaplama: " + notOrtalama); // Not ortalamasının çıktısı alınır

        double dogruNotOrtalama = (sayi1 + sayi2) / 2.0;    // Not ortalaması küsüratıyla beraber aritmetik ortalaması alınır
        System.out.println("Tam Not Hesaplama: " + dogruNotOrtalama); // Not ortalamasının küsüratıyla çıktısı alınır
        }
    }