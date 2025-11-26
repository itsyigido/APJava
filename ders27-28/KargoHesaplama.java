public class KargoHesaplama {
    public static void main(String[] args) {
        double sepetTutari = 550.0;
        boolean vipUyeMi = true;
        double kargoUcreti;
        
        if (sepetTutari >= 500) {
            kargoUcreti = 0.0;
            System.out.println("500 TL Üzeri alışverişlerde kargo ücreti alınmamaktadır.");
        } else {
            System.out.println("Sepet tutarınız 500 TL altında.");

            if(vipUyeMi == true ) {
                kargoUcreti = 15.0;
                System.out.println("VIP Üye Olduğunuz için kargo ücreti 15 TL'dir.");
            } else {
                kargoUcreti = 30.0;
                System.out.println("Standart kargo ücreti işlendi 30 TL");
            }
        }
        double toplamOdeme = sepetTutari+kargoUcreti;
        System.out.println("Toplam Ödenecek Tutar " + toplamOdeme + " TL'dir");
}
}
