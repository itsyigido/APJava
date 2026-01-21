public class BankaHesabi {
// Her hesabın bir hesap sahibi ( String ) ve bir bakiyesi ( double ) olmalı ve bu bilgilere
    // dışarıdan doğrudan erişilmemelidir.

    // Bir hesap, hesap sahibi ve başlangıç bakiyesi ile oluşturulabilmelidir.

    // Hesabın mevcut bakiyesi öğrenilebilmelidir.

    // Hesaba para yatırılabilmelidir ( paraYatir ).

    // Hesaptan para çekilebilmelidir ( paraCek ). Para çekme işlemi,ancakçekilmekistenen
    // miktar bakiyeden az veya eşitse gerçekleşmelidir.

    // Örnek Değişkenleri: private String hesapSahibi; , private double bakiye;

    // Constructor: public BankaHesabi(String sahip, double baslangicBakiye)
    
    // Metotlar: public double getBakiye() , public void paraYatir(double miktar) , public
    // boolean paraCek(double miktar) (Başarılı olup olmadığını döndürmesi daha kullanışlıdır).

    private String hesapSahibi;
    private double bakiye;
    private int hesapID;
    private static int idCounter = 1; // Hesap ID'leri için sayacın başlatılması
    private static BankaHesabi[] tumHesaplar = new BankaHesabi[100]; // Tüm hesapları tutmak için
    private static int hesapSayisi = 0; // Toplam hesap sayısı

    public BankaHesabi(String sahip, double baslangicBakiye) {
        this.hesapSahibi = sahip;
        this.bakiye = baslangicBakiye;
        this.hesapID = idCounter++;
        tumHesaplar[hesapSayisi++] = this; // Hesabı otomatik olarak ekle
        System.out.println(this.hesapSahibi + " adında yeni bir banka hesabı oluşturuldu (ID: " + this.hesapID + "). Başlangıç Bakiyesi: " + this.bakiye + " TL");
    }

    // bakiye check 
    public double getBakiye() {
        return this.bakiye;
    }

    // para yatır 
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            this.bakiye += miktar;
            System.out.println(miktar + " TL yatırılmıştır. Yeni bakiye: " + this.bakiye + " TL");
        } else {
            System.out.println("Geçersiz miktar! Lütfen pozitif bir sayı giriniz.");
        }
    }

    // para çek
    public boolean paraCek(double miktar) {
        if (miktar > 0 && miktar <= this.bakiye) {
            this.bakiye -= miktar;
            System.out.println(miktar + " TL çekilmiştir. Yeni bakiye: " + this.bakiye + " TL");
            return true;
        } else if (miktar > this.bakiye) {
            System.out.println("Yetersiz bakiye! Çekmeye çalıştığınız miktar: " + miktar + " TL, Mevcut bakiye: " + this.bakiye + " TL");
            return false;
        } else {
            System.out.println("Geçersiz miktar! Lütfen pozitif bir sayı giriniz.");
            return false;
        }
    }

    // hesap sahibi kimsin sen
    public String getHesapSahibi() {
        return this.hesapSahibi;
    }

    // hesap IDsi gel oglum
    public int getHesapID() {
        return this.hesapID;
    }

    // hesap datasini print et
    public void bilgileriYaz() {
        System.out.println("======== " + this.hesapID + " ID'li Banka Hesabının Bilgileri ========");
        System.out.println("Hesap ID: " + this.hesapID);
        System.out.println("Hesap Sahibi: " + this.hesapSahibi);
        System.out.println("Bakiye: " + this.bakiye + " TL");
    }
}
