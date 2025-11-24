public class ParaAyirma {
    public static void main(String[] args) {
        double para = 127.85;
        int lira = (int)para;
        int kurus = (int) Math.round((para - lira) * 100);
        System.out.println("Girilen miktar: " + para + "TL");
        System.out.println("---------------");
        System.out.println("Lira Kısmı: " + lira + " TL ");
        System.out.println("Kuruş Kısmı: " + kurus + " Kuruş");
    }
}
