public class OtobusBilet2 {
    public static void main(String[] args) {
        int yas = 40;
        System.out.println("Yaşınız:" + yas);

        if (yas >= 65) {
            System.out.println("Emekli olduğunuz için otobüse ücretsiz binebilirsiniz.");
        } else if (yas <= 18) {
            System.out.println("Öğrenci olduğunuz için otobüse indirimli binebilirsiniz.");
        } else {
            System.out.println("Otobüse binmek için tam bilet almanız gerekmektedir.");
        

    }
}
}
