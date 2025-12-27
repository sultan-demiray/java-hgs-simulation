public class Arac {

    protected String plaka;
    protected String hgsEtiketNo;
    protected double kmBasiUcret;

    public Arac(String plaka, String hgsEtiketNo, double kmBasiUcret) {
        this.plaka = plaka;
        this.hgsEtiketNo = hgsEtiketNo;
        this.kmBasiUcret = kmBasiUcret;
    }

    public double gecisUcretiHesapla(double km) throws Exception {

        if (km <= 0) {
            throw new Exception("Geçersiz km bilgisi girildi!");
        }

        double toplamUcret = km * kmBasiUcret;

        if (hgsEtiketNo == null || hgsEtiketNo.trim().isEmpty()) {
            return toplamUcret * 3;
        }

        return toplamUcret;
    }
}

