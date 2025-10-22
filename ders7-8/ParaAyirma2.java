public class ParaAyirma2 {
    public static void main(String[] args) {
        double anapara = 127.85;
        int lira = (int)anapara;
        double kurus = (double)((anapara - lira) * 100 );
        System.out.println("Paranız " + lira + " Lira " + kurus + " Kuruştur");
    }
}
