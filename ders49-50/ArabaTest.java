public class ArabaTest {
    public static void main(String[] var0) {
        AracBilgileri arac1 = new AracBilgileri("Mercedes", "C200", 2025, 86.205, false);
        AracBilgileri arac2 = new AracBilgileri("BMW", "E200", 1985, 760.505, true);

        System.out.println(arac1);
        System.out.println(arac2);
        arac1.bilgileriYaz();
    }
}
