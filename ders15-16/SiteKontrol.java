public class SiteKontrol {
        public static void main(String[] args) {
        
            /*
             * Problem 1: Isim Soyisim Ayırıcı:
             * 
             * Verilen string tamAd = "Burak Üstün"
             * Istenen: Ekrana "İsim: Burak" ve "Soyisim: Üstün" yazdırma
             * 
             * 
             * Problem 2: Web Sitesinin uzantı kontrolü
             * 
             * Verilen String siteAdresi = "www.kodrix.net"
             * Istenen: Sitenin .net ile bitip bitmediğini kontrol edip ekrana true veya false yazdırır.
             */

             // PROBLEM 1:
             String tamAd = "Burak Üstün";
             int adAyristirici = tamAd.indexOf(" ");
             int adUzunlugu = tamAd.length();
             String isim = tamAd.substring(0,adAyristirici);
             String soyisim = tamAd.substring(adAyristirici,adUzunlugu);
             System.out.println("Isim: " + isim + ", " + "Soyisim:" + soyisim);

             // PROBLEM 2:
             String siteAdresi = "www.kodrix.net";
             
    }
}
