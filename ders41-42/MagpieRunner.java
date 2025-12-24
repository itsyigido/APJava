public class MagpieRunner {
    public static void main(String[] var0) {
        Magpie magpieBot = new Magpie();

        System.out.println("Merhaba! Ben Magpie. Konuşmak istediğin bir şey var mı?");

        String userStatement = "kız      kavga ettim";
        
        System.out.println("Sen: " + userStatement);
        System.out.println("Magpie: " + magpieBot.getResponse(userStatement));
        System.out.println("Magpie: " + magpieBot.getResponse("Dostum nasılsın"));
        System.out.println("Magpie sinirli hali: " + magpieBot.sinirliMagpie());

    }
}