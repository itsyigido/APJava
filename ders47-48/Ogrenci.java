public class Ogrenci {
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
    private String isim;
    private int okulNumarası;
    private double notOrtalaması;
    private boolean geldiMi;

    // ==== YAPICI METODLAR (Constructors) ====
      public Ogrenci(String isim, int okulNumarası, double notOrtalaması, boolean geldiMi){
        this.isim = isim;
        this.okulNumarası = okulNumarası;
        this.notOrtalaması = notOrtalaması;
        this.geldiMi = geldiMi;
        System.out.println(this.isim + " adında yeni bir öğrenci nesnesi oluşturuldu.");

      } 

    // ==== METOTLAR (Methods / Behaviors) ====

    public void bilgileriYaz(){
        System.out.println("******** Öğrenci Bilgileri ********" );
        System.out.println("İsim: \t\t\t" + this.isim + "\n" + "Okul Numarası: \t\t" + this.okulNumarası + 
        "\n" + "Not Ortalaması: \t" + this.notOrtalaması + "\n" + "Okula Gelme Durumu: \t" + this.geldiMi);
    }
}