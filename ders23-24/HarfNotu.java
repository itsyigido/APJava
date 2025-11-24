public class HarfNotu {
        public static void main(String[] args) {
            int not = 95;
            System.out.println("Sayısal Not: " + not);

            if (not >=90) {
                System.out.println("Harf Notu: A (Pekiyi)" + " | TAM Not almak için gereken ekstra puan: " + (100 - not));
            } else if (not >= 80) {
                System.out.println("Harf Notu: B (İyi)" + " | A almak için gereken ekstra puan: " + (85 - not));
            } else if (not >= 70) {
                System.out.println("Harf Notu: C (Orta)" + " | B almak için gereken ekstra puan: " + (80 - not));
            } else if (not >= 60) {
                System.out.println("Harf Notu: D (Geçti)" + " | C almak için gereken ekstra puan: " + (70 - not));
            } else {
                System.out.println("Harf Notu: F (Kaldı)" + " | D almak için gereken ekstra puan: " + (60 - not));

            }
        }
}
