public class GirisKontrolu {
    public static void main(String[] args) {
 
// MANTIKSAL OPERAT RLER
// && (VE / AND) bir ifadenin sonucunun true olabilmesi için her iki tarafındaki
// koşulun da true olması gerekir.

// true && true -> true
// true && false -> false
// false && true -> false
// false && false -> false


// || (VEYA / OR) Sonucun true olması için bağlacın iki tarafındaki koşullardan en az birinin true olması yeterli
// true || true -> true
// true || false -> true
// false || true -> true
// false || false -> false


// ! (DEĞİL / NOT) Bu opreatörün, bir boolen İfadesinin sonucunu tersine çevirdiğini söyleyebiliriz.
// ! true -> false
// (5 10) -ş false 5 IO'DAN BijYüK1üR DİYE SORARIM VE CEVAP -> false
// ! (5 10) true 15 IO'DAN BÜYÜK DEĞİLDİR -> true

    int yas = 20;
    boolean davetiyeVarMi = true;

    // Senaryo 1 VIP Alanına girmek için 18 yaşından büyük ve davetiyesi olmalı.
    if (yas >= 18 && davetiyeVarMi == true) {
        System.out.println("VIP Alana hoşgeldiniz.");
    } else {
        System.out.println("Koşulları karşılamadığınız için VIP alana giremezsiniz.");
    }

    // Senaryo 2 Hafta sonu mu?
    String gun = "Pazar";
    if (gun.equals("Cumartesi") || (gun.equals("Pazar"))) {
        System.out.println("İyi Tatiller");
    } else {
        System.out.println("Daha hafta sonu olmamış");
    }

    // Senaryo 3 Otobüs bileti var mı Yada 65 yasindan buyukmu
    int yas2 = 66;
    boolean otobusBileti = false;

    if (yas2 >= 65 || otobusBileti == true) {
        System.out.println("Otobüse binebilirsiniz");
    } else {
        System.out.println("Otobüse binemezsiniz");
    }
}
}
