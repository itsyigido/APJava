public class StringInceleme {
    public static void main(String[] args) {
        String cumle = "Java Programlama Dili";

        // Lenght() metodu: String'in uzunluğunu döndürür
        int uzunluk = cumle.length();
        System.out.println("\n" + "Cümlenin uzunluğu: " + uzunluk);

        // indexOf() metodu: Belirtilen karakterin veya alt dizinin ilk geçtiği index'i döner
        // 0'dan Başlar
        int p_indeksi = cumle.indexOf("Programlama");
        System.out.println(" 'Programlama' kelimesinin başladığı indeks: " + p_indeksi);

        int z_indeksi = cumle.indexOf("Python");
        System.out.println("Python kelimesinin indeksi: " + z_indeksi);
        // Kelime bulunamazsa -1 döner

        // static (Sınıf) Metodları:
        // Doğrudan sınıfın kendisine aittir bir nesneye ihtiyaç duymazlar
        // Math sınıfı Math.pow(2,3) demek için yeni bir nesne yaratmamız gerekir
        Math.pow(2,3); // 2 üzeri 3 işlemi - Math bir nesne ve pow o sınıfın static metodudur ve nesne üretmeden kullanılabilir.

        // instance (Nesne) Metodları:
        // Bir nesneye bağlı olarak çalışırlar ve o nesne üzerinden çağrılırlar
        // String cümle - "Merhaba"; sınıf kullanarak bir nesne oluşturduk.
        int sayisaluzunluk = cumle.length(); // length() bir instance (nesne) meetodudur ve sınıf kullanarak üretilen nesne üzerinden çağrılır.

        // KURAL !
        // String içindeki her karakterin bir sıra numarası (index'i) vardır ve bu numaralandırma her zaman 0'dan başlar.
        // Yani ilk karakterin indexi 0, ikinci karakterin indexi 1'dir.
        // Java kelimesinde J=0, a=1, v=2, a=3 şeklindedir.

    }
}
