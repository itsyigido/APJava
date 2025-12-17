public class RakamSayaci {
        public static void main(String[] var0) {
        String veri = "Benim telefon numaram : 0544 509 85 06";
        int VeriUzunluk = veri.length();
        String VeriIndex = veri.substring(0, VeriUzunluk);
        System.out.print(VeriIndex);
        int toplam = 0;
        for (int i = 0; i < VeriUzunluk; i++){
            
            String a = veri.substring(i,(i + 1));
            if (a.compareTo("0") >= 0 && a.compareTo("9") <= 0) {
            toplam++;
                                                                                            }
        
                                            }
        System.out.println("\n" + "Toplam Rakam Sayısı; " + toplam);
        }
    }