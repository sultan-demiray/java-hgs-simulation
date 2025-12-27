public class HGSTest {

    public static void main(String[] args) {

        try {
            Otomobil oto = new Otomobil(
                    "34 ABC 123",
                    "HGS12345",
                    2.5,
                    true
            );

            double ucret = oto.gecisUcretiHesapla(10);
            System.out.println("Normal Geçiş");
            System.out.println("Plaka: 34 ABC 123");
            System.out.println("Ödenen Ücret: " + ucret + " TL");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------");

        try {
            Kamyonet kamyonet = new Kamyonet(
                    "06 XYZ 789",
                    "",
                    3.0,
                    true
            );

            double ucret = kamyonet.gecisUcretiHesapla(10);
            System.out.println("HGS Etiketi Yok!");
            System.out.println("Plaka: 06 XYZ 789");
            System.out.println("Cezalı Ücret: " + ucret + " TL");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------");

        try {
            Otomobil oto2 = new Otomobil(
                    "35 AAA 555",
                    "HGS99999",
                    2.0,
                    false
            );

            oto2.gecisUcretiHesapla(-5);

        } catch (Exception e) {
            System.out.println("Hata!");
            System.out.println(e.getMessage());
        }
    }
}
