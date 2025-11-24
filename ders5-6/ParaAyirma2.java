public class ParaAyirma2 {
    public static void main(String[] args) {
        double para = 127.85;
        int toplamKurus = (int)(para * 100);
        int lira = toplamKurus / 100;
        int kurus = toplamKurus % 100;

        System.out.println("Girilen miktar: " + para + "TL");
        System.out.println("---------------");
        System.out.println("Lira Kısmı: " + lira + " TL ");
        System.out.println("Kuruş Kısmı: " + kurus + " Kuruş");
    }
}
