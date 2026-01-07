public class OkulTest {
    public static void main(String[] var0) {
        Ogrenci ogr1 = new Ogrenci("Yiğit", 357, 86.5, true);
        Ogrenci ogr2 = new Ogrenci("Mehmet", 985, 76.5, true);

        System.out.println(ogr1);
        System.out.println(ogr2);
        ogr1.bilgileriYaz();
    }
}
