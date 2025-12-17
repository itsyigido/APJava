public class CarpimTablosu {
    public static void main (String[] var0) {
        for (int i = 1; i <= 10; i++){
            System.out.println("\n" + i + " Çarpım Tablosu");
            System.out.println("--------------------------");
            for (int j = 1; j <= 10; j++) { 
                int carpim = i * j;
                System.out.println("| \t" + i + " x " + j + "\t = " + carpim + "\t |" );
            }
            System.out.println("--------------------------");
    }
}
}