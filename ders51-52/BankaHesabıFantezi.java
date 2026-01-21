import java.util.Scanner;

public class BankaHesabıFantezi {
    public static void main(String[] args) {
        BankaHesabi hesap1 = new BankaHesabi("Yiğit Yaşar", 5000.0);
        BankaHesabi hesap2 = new BankaHesabi("Ahmet Hamdi Tanpınar", 3000.0);
        BankaHesabi hesap3 = new BankaHesabi("Mehmet Şahin", 1500.0);
        
        BankaHesabi[] hesaplar = {hesap1, hesap2, hesap3};
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n========== HESAP LİSTESİ ==========");
            for (int i = 0; i < hesaplar.length; i++) {
                System.out.println((i + 1) + ". (ID: " + hesaplar[i].getHesapID() + ") " + hesaplar[i].getHesapSahibi());
            }
            
            System.out.print("\nHesap seçiniz (1-" + hesaplar.length + ") | Çıkmak için (0): ");
            int hesapSecimi = scanner.nextInt();
            
            if (hesapSecimi == 0) {
                System.out.println("ATM'den uzaklaştınız!");
                break;
            }
            
            if (hesapSecimi < 1 || hesapSecimi > hesaplar.length) {
                System.out.println("Hesap bulunamadı! Geçersiz hesap numarası. Lütfen 1-" + hesaplar.length + " arasında bir sayı girin.");
                continue;
            }
            
            BankaHesabi secilenHesap = hesaplar[hesapSecimi - 1];
            
            System.out.println("\n========== SEÇİLEN HESAP BİLGİLERİ ==========");
            secilenHesap.bilgileriYaz();
            
            System.out.println("\n========== İŞLEM SEÇİMİ ==========");
            System.out.println("1. Para Yatır");
            System.out.println("2. Para Çek");
            System.out.println("3. Bakiye Sorgula");
            System.out.print("İşlem seçin (1-3): ");
            int islemSecimi = scanner.nextInt();
            
            if (islemSecimi < 1 || islemSecimi > 3) {
                System.out.println("Geçersiz işlem numarası!");
                continue;
            }
            
            switch (islemSecimi) {
                case 1:
                    System.out.print("Yatırılacak tutarı girin: ");
                    double yatirMiktar = scanner.nextDouble();
                    secilenHesap.paraYatir(yatirMiktar);
                    break;
                case 2:
                    System.out.print("Çekilecek tutarı girin: ");
                    double cekMiktar = scanner.nextDouble();
                    secilenHesap.paraCek(cekMiktar);
                    break;
                case 3:
                    System.out.println("Güncel Bakiye: " + secilenHesap.getBakiye() + " TL");
                    break;
            }
            
            System.out.println("\n İşleminiz başarıyla gerçekleşti. İyi günler dileriz!");
            break;
        }
        
        scanner.close();
    }
}
