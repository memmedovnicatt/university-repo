public class Isci {
    private String maas;
    private String ad;
    private String sahe;

    public Isci(String maas, String ad, String sahe) {
        this.maas = maas;
        this.ad = ad;
        this.sahe = sahe;
    }
    public void morning_func(){
        System.out.println("Sabahiniz xeyir ! " +ad);
    }
    public void afternoon_yemek(){
        System.out.println("Yemek vaxtidir ! " + ad) ;

    }
    public void night_func(){
        System.out.println("Geceler xeyre ! ");
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSahe() {
        return sahe;
    }

    public void setSahe(String sahe) {
        this.sahe = sahe;
    }
}
