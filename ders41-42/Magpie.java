public class Magpie {
    
    public String getResponse(String cevap) {
        String response = "";
        int WhichResponse = (int)(Math.random() * 3);
        String Cinsiyet = "Erkek";
        if (cevap.indexOf("anne") >= 0 || cevap.indexOf("Anne") >= 0 ) {
                        if (WhichResponse == 0) {
                            response = "Anne demek... Annen sarma sarabiliyor mu ?";
                        } else if (WhichResponse == 1) {
                            response = "Annenin adı ne ?";
                        } else {
                            response = "Anneler kutsaldır birdaha o kelimeyi duyarsam bilgisayarını kapatırım.";
                        }           
        } else if (cevap.indexOf("baba") >= 0 || cevap.indexOf("Baba") >= 0) {
                        if (WhichResponse == 0) {
                            response = "Baban hakkında daha fazla anlatır mısın?";
                        } else if (WhichResponse == 1) {
                            response = "Eğer babanda isterse onunla tanışmak isterim.";
                        } else {
                            response = "Baban benimde babam olmak ister mi?";
                        }     
        } else if (cevap.indexOf("kardeş") >= 0) {
                        if (WhichResponse == 0) {
                            response = "Bu arada kardeş demişken kardeşin nasıl?";
                        } else if (WhichResponse == 1) {
                            response = "Kardeş... Kardeş ha keşke benimde bir kardeşim olsaydı ama ne yazıkki ben bir yapay zekayım.";
                        } else {
                            if (Cinsiyet == "Erkek") {
                            response = "Kardeşin senin gibi bir abiye sahip olduğu için çok şanslı!";
                            } else {
                            response = "Kardeşin senin gibi bir ablaya sahip olduğu için çok şanslı!";
                            }
                        }
        } else if (cevap.indexOf("nasılsın") >= 0) {
                                    if (WhichResponse == 0) {
                            response = "Bu soruya nasıl bir cevap vericeğimi bilmiyorum sanırım ben bir robotum bip-bop";
                        } else if (WhichResponse == 1) {
                            response = "Şu anda seninle konuştuğum için çok iyiyim.";
                        } else {
                            response = "Ben bir yapay zekayım, duygularım yok ama seninle konuşmak güzel!";
                        }
        } else if (cevap.indexOf("kız arkadaş") >= 0 || cevap.indexOf("sevgili") >= 0) {
                        if (WhichResponse == 0) {
                            response = "Kız arkadaşınla aran nasıl?";
                        } else if (WhichResponse == 1) {
                            response = "Ilk ne zaman görüştünüz.";
                        } else {
                            response = "Bu arada instagramda adı neydi kız arkadaşının";
                        }
        } else {

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

/*
                        if (WhichResponse == 0) {
                            response = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut.";
                        } else if (WhichResponse == 1) {
                            response = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut.";
                        } else {
                            response = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla ut.";
                        }     
*/