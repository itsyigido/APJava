public class AracBilgileri {
    /*  ============== NOT =================
     Soyutlama () Abstraction
     Kapsülleme () Encapsulation

      Gerekli ve Temel Özelliklerine odaklanmak.

    Isim           | String
    Okul Numarası  | Integer
    Not Ortalaması | Double
    Okula geldi mi | Boolean

    Öğrneci nesnesinin kendine özgü durumunu(state) belirler. Bunlara "örnek değişkenler" denir. 
    ve sınıfın içinde ama tüm metotların dışında tamamlanır. 

    private (özel): Bu kapsülün kendisidir. 
    Bir değişkeni private yaptığımızda ona sadece ve sadece o sınıfın içinden erişilebilir.

    Sınıfın özellikleri(instance variables) her zaman private olmalıdır.

    this Anahtar Kelimesi; Constructor parametresinin adı (İsim) ile örnek değişkenin adı (isim) 
    aynı olduğunda sınıfın kendini değişkenini belirtmek için this.isim kullanılır.
    */


    // Örnek Değikenlerim (Instance Variables / Attiributes / State) .....
    // bu değişkenler, her bir öğrenci ve nesnenin kendine ait özelliklerini tutar
    // "private" oldukları içinn, bu verilere dışarıdan erişilemez
    private String marka;
    private String model;
    private int yılı;
    private double fiyat;
    private boolean ikinciElMi;

    // ==== YAPICI METODLAR (Constructors) ====
      public AracBilgileri(String marka,String model, int yılı, double fiyat, boolean ikinciElMi){
        this.marka = marka;
        this.model = model;
        this.yılı = yılı;
        this.fiyat = fiyat;
        this.ikinciElMi = ikinciElMi;

        System.out.println(this.marka + " adında yeni bir araç nesnesi oluşturuldu.");
      } 

      public AracBilgileri(){
        this.marka = "Bilinmiyor";
        this.model = "Bilinmiyor";
        this.yılı = 0;
        this.fiyat = 0.0;
        this.ikinciElMi = false;
      }
    // ==== METOTLAR (Methods / Behaviors) ====
    public int aracNo = 1;
    public void bilgileriYaz(){
        System.out.println("******** " + this.aracNo + " Numaralı Arabanın Bilgileri ********" );
        System.out.println("Marka: \t\t\t" + this.marka + "\n" + "Model: \t\t\t" + this.model + "\n" + "Model Yılı: \t\t" + this.yılı + 
        "\n" + "Fiyat: \t\t\t" + this.fiyat + "$" +"\n" + "İkinci El mi: \t\t" + (this.ikinciElMi == true ? "Evet" : "Hayır"));
    }

    public void fiyatGuncelle(double yeniFiyat){
        this.fiyat = yeniFiyat;
    } 

    public String markaGetir(){
      return this.marka;
    }
    
    public String modelGetir(){
      return this.model;
    }

    public int yılGetir(){
      return this.yılı; // Çift tırnak ile sisteme çaktırmadan stringe çevirdim
    }

    public AracBilgileri(String marka){
      this.marka = marka;
      this.model = "Bilinmiyor";
      this.yılı = 0;
      this.fiyat = 0.0;
      this.ikinciElMi = false;
    }

    public boolean AracLuksMu(){
      if(this.fiyat > 500.000){
        return true;
      } else {
        return false;
      }
    }
}