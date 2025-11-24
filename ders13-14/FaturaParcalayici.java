public class FaturaParcalayici {
            public static void main(String[] args) {
                String faturaDetay = "Ürün : Laptop, Fiyat : 25000, Adet : 1";
                // System.out.println("\n" + "Fatura Detayı: " + faturaDetay);

                // AMAÇ 1: Ürün Adı
                String UrunEtiketi = "Ürün : ";
                int urunBaslangic = UrunEtiketi.length();

                int urunBitis = faturaDetay.indexOf(",");
                // System.out.println("Ürün için başlangıç: " + urunBaslangic + ", bitiş " + urunBitis);

                String urunAdi = faturaDetay.substring(urunBaslangic, urunBitis);
                System.out.println("\n" + UrunEtiketi + urunAdi);

                // AMAÇ 2: Fiyat
                String FiyatEtiketi = "Fiyat : ";
                int fiyatBaslangic = faturaDetay.indexOf(FiyatEtiketi) + FiyatEtiketi.length();

                int fiyatBitis = faturaDetay.indexOf(",", fiyatBaslangic);
                // System.out.println("Fiyat için başlangıç" + fiyatBaslangic + ", bitiş " + fiyatBitis);

                String urunFiyat = faturaDetay.substring(fiyatBaslangic, fiyatBitis);
                System.out.println(FiyatEtiketi + urunFiyat);
            }
}
