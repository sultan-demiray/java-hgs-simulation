public class Kamyonet extends Arac {

    private boolean ticariAracMi;

    public Kamyonet(String plaka, String hgsEtiketNo,
                    double kmBasiUcret, boolean ticariAracMi) {
        super(plaka, hgsEtiketNo, kmBasiUcret);
        this.ticariAracMi = ticariAracMi;
    }

    @Override
    public double gecisUcretiHesapla(double km) throws Exception {

        double ucret = super.gecisUcretiHesapla(km);

        if (ticariAracMi) {
            ucret = ucret * 1.15;
        }

        return ucret;
    }
}

