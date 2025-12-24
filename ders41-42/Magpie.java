public class Magpie {
    
    public String getResponse(String cevap) {
        String response = "";

        if (cevap.indexOf("anne") >= 0 || cevap.indexOf("Anne") >= 0 ) {
            response = "Annen hakkında daha fazla anlatır mısın?";
        } else if (cevap.indexOf("baba") >= 0 || cevap.indexOf("Baba") >= 0) {
            response = "Baban hakkında daha fazla anlatır mısın?";
        } else if (cevap.indexOf("kardeş") >= 0) {
            response = "Kardeşinle aran nasıl?";
        } else if (cevap.indexOf("nasılsın") >= 0) {
            response = "Ben bir yapay zekayım, duygularım yok ama seninle konuşmak güzel!";
        } else if (cevap.indexOf("kız arkadaş") >= 0 || cevap.indexOf("sevgili") >= 0) {
            response = "Kız arkadaşınla aran nasıl?";
        } else {
            int WhichResponse = (int)(Math.random() * 3);
    
            if (WhichResponse == 0) {
                response = "İlginç, daha fazla anlat.";
            } else if (WhichResponse == 1) {
                response = "Hmmm.";
            } else {
                response = "Peki, bu konu hakkında ne düşünüyorsun?";
            }
              
        }

        return response;
    }

    public String sinirliMagpie() {

        return "DELLENDİM!!! BIRAKIN BENİ!!!";
        
    }
}