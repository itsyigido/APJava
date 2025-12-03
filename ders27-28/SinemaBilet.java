public class SinemaBilet {
        public static void main(String[] args) {

        int yas = 17;
        boolean ogrenciMi = true;
        boolean ucDFilmMi = false;
        
        double biletFiyati = 50.0;

        if (yas < 10) {
            biletFiyati = 30.0; 
            System.out.println("10 yaş altı olduğunuz için çocuk indirimi uygulanmıştır.");
        } else {
            if (ogrenciMi == true) {
                biletFiyati = 40.0;  
                System.out.println("Öğrenci olduğunuz için biletinize indirim uygulanmıştır.");
            } else {
               // biletFiyati = 50.0;  
                System.out.println("Tam bilet ücreti uygulanmıştır.");
            }
        }

        if (ucDFilmMi == true) {
            System.out.println("3D film seçildiği için 10 TL ek ücret tanımlanmıştır.");
            biletFiyati += 10.0;
        }

        System.out.println("Toplam Tutar: " + biletFiyati + " TL");
    }
}
