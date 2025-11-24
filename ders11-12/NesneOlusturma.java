import java.util.Scanner;
import java.util.Random;
public class NesneOlusturma {
    public static void main(String [] args) {
        // Class bir nesne şablonudur
        // Class, nesnelerin sahip olacağı özellikleri (değişkenleri) ve davranışları (metotlar) tanımlar
        // Nesne ise bu şablon üzerinden oluşturulan varlıklardır


        // Class soyuttur, nesne ise somuttur

        // 1. Yol Literal(Kısayol) Yöntem
        // En yaygın kullanılan yöntemdir.
        String mesaj1 = "Merhaba, Dünya!";

        // 2. Yol: "new" Anahtar Kelimesi ile Nesne yaratarak
        // Bu nesne yaratmanın standart açık yoludur.
        String mesaj2 = new String("Merhaba, Dünya!");

        System.out.println("Mesaj 1: " + mesaj1);
        System.out.println("Mesaj 2: " + mesaj2);

        // Scanner sınıfından bir nesne oluşturma örneği
        // (System.in), klavyeden girdi almanı sağlar
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz");
        int sayi = myScanner.nextInt();
        System.out.println("Girdiğiniz sayı: " + sayi);

        // Random sınıfından bir nesne oluşturma örneği
        // Math.random()'a alternatif bir yöntem sunar
        Random myRandom = new Random();
        int RastgeleSayi = myRandom.nextInt(100); // 0 ile 99 arasında rastgele sayı
        System.out.println("Rastgele Sayı: " + RastgeleSayi);

        // Sınıf(Class) Bir şeyi üretmek için kullanılan plan veya şablondur. Bir tariftir, bir tanımdır.
        // Nesne(Object): O planı veya tarifi kullanarak ürettiğimiz gerçek, somut bir üründür

        // new anahtar kelimesi, Java'da yeni bir nesne oluşturmak için kullanılır.
        // Örneğin, bir sınıfın tanımını kullanarak yeni bir nesne oluşturmak istediğimizde "new" anahtar kelimesini kullanırız.
        // Bir sınıf yazdığımız zaman bilgisayara ben arama diye bir kavram tanımlamak isterim deriz. Bir gün araba üretirsem arabanın özelliklerini (nitelik, method) şunlar olsun deriz.
        // new kullandığımız zaman bilgisayara şunu deriz "Hani sana daha önce 'araba' yapmayı öğretmiştim ya, işte şimdi bana o tarifi kullanarak yeni bir araba yap",
        
        
        /* Analoji 1: Banka hesap formu vs. Gerçek Hesaplar

        1. Sınıf (Class): BankaHesabi

        - Bankaya gittiğinizde size verilen boş hesap açma formudur.
        - Formun üzerinde "Hesap Sahibi: ", "IBAN: ", "Bakiye: ", gibi boş alanlar (Nitelikler) vardır.
        - Ayrıca formun üzerinde "Para Yatır", "Para Çek" gibi işlemler (Metotlar) vardır.
        -
         */ 
        
        
    }
}
