public class OdevYaziTura {
    public static void main(String[] args) {
        int yazitura = (int)(Math.random() * 2);
        String sonuc = "Tura";
        if (yazitura == 0) {
        sonuc = "Yazı geldi";
        } else {
        sonuc = "Tura geldi";
        }
        System.out.println("\n" + "Yazı tura sonucu: " + sonuc);
    }
}