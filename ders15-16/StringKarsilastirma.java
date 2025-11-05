public class StringKarsilastirma {
    public static void main(String[] args) {
        /* 
         int a = 5;
         String b = "Yiğit";
         double c = 5.2;
         boolean d = true;

         = atama == karşılaştırma
         5 == 5 karşılaştırma
         6 == "6" false
         */

        String mesaj2 = new String("Merhaba Dünya!");
        String mesaj1 = "Merhaba Dünya!"; // Mesaj iki ile içerik aynı olsa bile new diyerek farklı bir nesneye atamasını yaptık.
        System.out.println(mesaj1 == mesaj2); // false

        String x = "Yiğit Yaşar";
        String y = "Yiğit Yaşar"; // Java bunu optimize eder ve aynı nesneyi kullanır çünkü içerik aynı
        System.out.println(x == y); // true

        System.out.println(mesaj1.equals(mesaj2));
        // x.equals(y) metodu direkt olarak içeriğe bakar, o yüzden farklı adreslenseler bile eğer içerik eşitse true değerini döndürür.

        // ALTIN KURAL: Nesnelerin içeriklerini karşılaştırırken her zaman .equals() metodunu kullanırız.

        // .compareTo

        // Sıfır(0) Eğer kelime1 ve kelime2 eşitse
        String kelime1 = "Armut";
        String kelime2 = "Armut";
        
        System.out.println("Armut.compareTo(Armut): " + kelime1.compareTo(kelime2));
        // Negatif Sayı(-): Eğer kelime1 alfabetik olarak kelime2'den önce geliyorsa ("armut".compareTo(elma))
        String kelime3 = "Armut";
        String kelime4 = "Elma";
        
        System.out.println("Armut.compareTo(Elma): " + kelime3.compareTo(kelime4));

        // Pozitif Sayı(+): Eğer kelime1 alfabetik olarak kelime2'den sonra geliyorsa ("zebra".compareTo(kedi))
        String kelime5 = "Zebra";
        String kelime6 = "Kedi";
        
        System.out.println("Zebra.compareTo(Kedi): " + kelime5.compareTo(kelime6));
    }
}
   