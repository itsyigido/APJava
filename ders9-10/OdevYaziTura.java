public class OdevYaziTura {
    public static void main(String[] args) {
        int yazitura = (int)(Math.random() + 0.5);

        String sonuc = "Tura";

        if (yazitura == 0) {
        sonuc = "Yazı";
        } else {
        sonuc = "Tura";
        }
        System.out.println("Yazı tura sonucu: " + sonuc);
    }
}