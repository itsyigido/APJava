public class ArabaTest {
    public static void main(String[] var0) {
        AracBilgileri arac1 = new AracBilgileri("Mercedes", "C200", 2025, 860.205, false);
        AracBilgileri arac2 = new AracBilgileri("BMW", "E200", 1985, 760.505, true);
        AracBilgileri arac3 = new AracBilgileri("Toyota","Corolla",2020,350.000,false);

        System.out.println(arac1);
        System.out.println(arac2);
        arac1.bilgileriYaz();
        if (arac1.AracLuksMu()) {
            System.out.println(arac1.markaGetir() + " " + arac1.modelGetir() + " (" + arac1.yılGetir() + ") lüks bir araçtır.");
        } else {
            System.out.println(arac1.markaGetir() + " " + arac1.modelGetir() + " (" + arac1.yılGetir() + ") lüks bir araç değildir.");
        }
        if (arac1.aracNo >= 1) {
            arac3.aracNo = arac1.aracNo + 1;
        }
        arac3.bilgileriYaz();
        if (arac3.AracLuksMu()) {
            System.out.println(arac3.markaGetir() + " " + arac3.modelGetir() + " (" + arac3.yılGetir() + ") lüks bir araçtır.");
        } else {
            System.out.println(arac3.markaGetir() + " " + arac3.modelGetir() + " (" + arac3.yılGetir() + ") lüks bir araç değildir.");
        }
    }
}
