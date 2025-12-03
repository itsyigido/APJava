public class MatematikselHesaplar  {
    public static void main(String[] args) {
        double dikKenarA = 3.0;
        double dikKenarB = 4.0;
        double hipotenus;
        double KarelerToplamı = Math.pow(dikKenarA, 2) + Math.pow(dikKenarB, 2);
        hipotenus = Math.sqrt(KarelerToplamı);
        System.out.println("Birinci Dik Kenarı" + dikKenarA);
        System.out.println("Ikinci Dik Kenar" + dikKenarB);
        System.out.println("Hipotenus" + hipotenus);

    }
}