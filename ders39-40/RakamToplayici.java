public class RakamToplayici {
    public static void main(String[] var0) {
        String veri = "Benim telefon numaram : 0544 509 85 06";
        int VeriUzunluk = veri.length();
        String VeriIndex = veri.substring(0, VeriUzunluk);
        System.out.print(VeriIndex);
        int toplam = 0;
        for (int i = 0; i < VeriUzunluk; i++){
            
            String a = veri.substring(i,(i + 1));
            if (a.equals("0") || a.equals("1") || a.equals("2") || a.equals("3") || a.equals("4") || a.equals("5") || a.equals("6") || a.equals("7") || a.equals("8") || a.equals("9")  ) {
                int b = Integer.valueOf(a);
                toplam += b;
            }
        }
        System.out.println("\n" + "Sayıların Toplamı; " + toplam);
        
    }
}