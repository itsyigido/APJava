public class OyunKarakteriYaratici {
    public static void main(String[] args) {
        int strength = (int)(Math.random() * 16) + 3;
        int intelligence = (int)(Math.random() * (18 - 3 + 1)) + 3;
        int dexterity = (int)(Math.random() * (18 - 3 + 1)) + 3 ;
            System.out.println("\n" + "KARAKTERİNİZİN ÖZELLİKLERİ " + "\n" +
                           "    Gücü: " + strength + "\n" +
                           "    Zekası: " + intelligence + "\n" +
                           "    Çevikliği: " + dexterity); 
    }
}