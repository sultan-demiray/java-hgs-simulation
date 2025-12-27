public class Otomobil extends Arac {

    private boolean otomatikOdemeTalimatı;

    public Otomobil(String plaka, String hgsEtiketNo,
                    double kmBasiUcret, boolean otomatikOdemeTalimatı) {
        super(plaka, hgsEtiketNo, kmBasiUcret);
        this.otomatikOdemeTalimatı = otomatikOdemeTalimatı;
    }

    @Override
    public double gecisUcretiHesapla(double km) throws Exception {

        double ucret = super.gecisUcretiHesapla(km);

        if (otomatikOdemeTalimatı) {
            ucret = ucret * 0.95;
        }

        return ucret;
    }
}

