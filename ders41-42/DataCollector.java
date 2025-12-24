import javax.swing.text.StyledEditorKit.BoldAction;

public class DataCollector {
    public String cinsiyet(String veri1) {
        boolean cinsiyetdata = true;
        String cinsiyetstring = "";
        
        if (cinsiyetdata == true) {
            cinsiyetstring = "Erkek";
        } else {
            cinsiyetstring = "Kadın";
        }
        return cinsiyetstring;
        Cls_Options.cinsiyet = "test";
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

