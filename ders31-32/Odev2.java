public class Odev2 {
    public static void main(String[] args) {
     // 1. GÖREV 1'DEN 10'A KADAR TOPLAM
     // 2. GÖREV 1'DEN 10'A KADAR ÇARPIM TOPLAMINI
     
     // 1. GÖREV
      System.out.println("1. GÖREV" + "\n");
      int faktoriyel = 0;
      for (int i = 1; i <= 10; i++) {
        faktoriyel += i;
        System.out.println("Sayaç: " + i + " | Sayaç sonrası toplam " + faktoriyel);
      }
      // 2. GÖREV
      System.out.println("\n" + "2. GÖREV" + "\n");
      int carpim = 1;
      for (int x = 1; x <= 10; x++) {
        carpim *= x;
        System.out.println("Sayaç: " + x + " | Sayaç sonrası carpim " + carpim);
      }
      // 3. GÖREV  
      System.out.println("\n" + "3  . GÖREV" + "\n");
      for (int sayi = 1; sayi<=100; sayi++) {
        if (sayi % 15 == 0) { 
        //[ALTERNATIF] if (sayi % 5 == 0 and sayi % 3 == 0) {   
          System.out.println("FizzBuzz " + sayi);
          } else if (sayi % 5 == 0) {
          System.out.println("Buzz " + sayi);
          } else if (sayi % 3 == 0) {
          System.out.println("Fizz " + sayi);
          } else {
          System.out.println("Sayı: " + sayi);
        }  
      }                                    
}
}
