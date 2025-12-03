public class Email_Ayiklayici {
        public static void main(String[] args) {
            // indexOf() metodu: Belirtilen bir karakterin veya alt dizinin ilk geçtiği index'i döner
            // substring: alt dizi, bir dizinin parçası
            // başlangıç(dahil) ve bitiş(dahil değil) indexleri ile bir dizinin parçasını alma işlemi
            String s = "Merhaba Dünya";
            String x = s.substring(0,7); // 0'dan başlar, 7 dahil değil
            System.out.println("\n" + "x: " + x); // x: Merhaba
            String y = s.substring(8,11); // 8 dahil, 11 dahil değil
            System.out.println("y: " + y); // y: Dün

        }
}
