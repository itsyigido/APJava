
public class EnBuyukBasamak {
    public static void main(String[] var0) {
/* Görev 1  
 VERILEN SAYILARIN HANGI BASAMAĞININ DAHA BÜYÜK OLDUĞUNU BULUN 4785
 enBuyuk adında bir değişken oluştur
 Bu değişkene dizinin ilk elemanını veya daha küçük bir değer ata
 dizinin geri kalan elemanları üzerinde gezinecek bir döngü kur
 Döngünün içinde o anki eleman enBuyuk değişkeniyle karşılaştır
 Eğer o anki eleman enBuyuk2'ten daha büyükse enBuyuk değişkeninin değerini o anki elemanın değeriyle güncelle
Döngü bittiğinde enBuyuk değişkeni aradığımız sonucu tutuyor olacaktır.
While döngüsü kullanın
*/
 int sayi = 4785;
 int orijinalsayi = sayi;
 int enBuyuk = -1;
while (sayi > 0) {
  int basamak = sayi % 10;
    if (basamak > enBuyuk) {
    enBuyuk = basamak;
    }
  sayi /= 10; // sayi = sayi / 10;
}
System.out.println(orijinalsayi  + " Sayısının en büyük basamağı: " + enBuyuk);
    }
}