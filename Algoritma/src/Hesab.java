public class Hesab {
    private String istifadeci_adi;
    private String parol;
    private int balans;
    public Hesab(String istifadeci_adi, String parol, int balans) {

        this.istifadeci_adi = istifadeci_adi;
        this.parol = parol;
        this.balans = balans;
    }

    public String getIstifadeci_adi() {
        return istifadeci_adi;
    }

    public void setIstifadeci_adi(String istifadeci_adi) {
        this.istifadeci_adi = istifadeci_adi;
    }

    public String getParol() {
        return parol;
    }

    public void setParol(String parol) {
        this.parol = parol;
    }

    public int getBalans() {
        return balans;
    }

    public void setBalans(int balans) {
        this.balans = balans;
    }

    public void balansArtirma(double miqdar){
        balans+=miqdar;
        System.out.println("Yeni balans : "+ balans);
    }
    public void balansCixarma(double miqdar){
        if (balans<miqdar){
            System.out.println("Kifayet qeder balansiniz yoxdur");
        }
        else {
            balans-=miqdar;
            System.out.println("Yeni balans : " + balans);
        }

    }

}
