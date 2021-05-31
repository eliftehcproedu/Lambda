package lambda_tum._1_Lambda.Stream_Porje;

public class Ogrenci {

    private String ad;
    private String soyAd;
    private int yas;
    private double diplomaNotu;
    private String cinsiyet;
    // class icinde
    // Constructor icin sag tikla -> Generate -> Constructor -> Hepsini sec ok'a bas
    // sag tikla -> Generate getter ve setter -> Hepsini sec ok'a bas
    // sag tikla -> Generate toString -> Hepsini sec ok'a bas


    public Ogrenci(String ad, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

   /* @Override
    public String toString() { // orjinal hali; uzerinde degisiklik yapilabilir
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyAd='" + soyAd + '\'' +
                ", yas=" + yas +
                ", diplomaNotu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    } */
   @Override
   public String toString() {
       return
               "ad='" + ad + '\'' +
               ", soy Ad='" + soyAd + '\'' +
               ", yas=" + yas +
               ", diploma Notu=" + diplomaNotu +
               ", cinsiyet='" + cinsiyet + '\'' ;
   }
}
