public class substringdeneme {
        public static void main(String[] args) {
            String email = "yigit@gmail.com";
            System.out.println("\n" + email);

            // AMAÇ 1: Kullanıcı adını almak ("burak.ustun")
            // STRATEJI: Baştan (indeks 0) başla ve '@' karakterine kadar (hariç) al

            // System.out.print(email.substring(0,5)); - Direkt olarak el ile sayarak yigit'i aldık fakat istediğimiz bu değil

            int adIndeksi = email.indexOf("@");
            System.out.println("Kullanıcı Adı İndeksi: " + adIndeksi);

            String kullaniciAdi = email.substring(0, adIndeksi);
            System.out.println("Kullanıcı Adı: " + kullaniciAdi);

            // AMAÇ 2: Domain Adını Almak ("gmail.com")
            // STRATEJI: '@' karakterinden sonraki tüm karakterleri al
            String domain = email.substring(adIndeksi + 1);
            System.out.println("Domain Adı: " + domain);
        }
}
