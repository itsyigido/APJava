public class StringTersCevir { 
    public static void main(String[] var0) {
        /* Kullanıcıdan bir kelime al ve bu kelimenin tersini yazdır.
            1. tersKelime adında boş bir String oluştur ("")
            2. Bir for döngüsünü, kelimenin son harfinin indeksinden ( kelime.length() - 1 )
            başlatıp, O . indekse kadar geriye doğru ( i--) çalıştır.
            3. Döngünün her adımında, i . indeksteki harfi al ( substring(i, i+1) ) .
            4. Aldığın bu harfi, tersKelime değişkeninin sonuna ekle ( tersKelime += harf ) .
         */

            String kelime = "Merhaba";
            String tersKelime = "";
            for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.substring(i, i + 1);
            }
            System.out.println("\n" + "Kelime başlatıpnin tersi: " + tersKelime);
    }
}