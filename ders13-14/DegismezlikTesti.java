public class DegismezlikTesti {
    public static void main(String[] args) {
        // Değişmezlik (Immutability) Testi

        String s = "YiğiT";
        System.out.println("\n" + "1. Orjinal String 's' değeri: " + s);
        // Bu kodun 's'yi değiştirmesini bekleriz ama değiştirmez.

        s.toLowerCase();
        System.out.println("2. toLowerCase() metodundan sonra String 's' değeri: " + s);
        // Neden değişmedi?
        // s.toLowerCase() metodu, "YiğiT" nesnesini değiştirmez.
        // O, hafızada "YiğiT" adında yeni bir string nesnesi yaratır. 
        // ve bu yeni nesneyi geri döndürür ama biz bu dönen değeri yakalamadık.

        // DOĞRU YÖNTEM (Yeniden Atama):
        // Yeni nesneyi yakalayıp 's' referansına tekrar atamalıyız.
        s = s.toLowerCase(); //toLowerCase()
        System.out.println("3. atama işleminden sonra String 's' değeri: " + s);

        String memduh = s.toLowerCase();
        System.out.println("4. toLowerCase() metodunun String 'memduh' değeri: " + memduh);
    }
}
