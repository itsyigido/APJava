
public class DataCollector {
    public String cinsiyet(String veri1) {
        String cinsiyetdata = veri1;
        String cinsiyetstring = "";
        
        if (cinsiyetdata.equals("Erkek")) {
            cinsiyetstring = "Erkek";
        } else {
            cinsiyetstring = "Kadın";
        }
        return cinsiyetstring;
    }
        public String yas(String veri2) {
        int yasdata = 0;
        boolean argolucevaplar;
        if (yasdata >= 18) {
        argolucevaplar = true;
        return "Küfürlü cevap modu aktif. Ayarlardan deaktif hale getirebilirsin";
        } else {
        argolucevaplar = false;
        }
        String yas = Integer.toString(yasdata);
        return yas;
    }


}

