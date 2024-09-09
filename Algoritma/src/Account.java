public class Account {
    private String name;
    private String hesapNo;
    private double balans;

public Account(){
    this("hecne","hecne",0);
}
public Account(String name,String hesapNo,double balans){
   this.name=name;
    this.hesapNo=hesapNo;
    this.balans=balans;
}

public void melumatlariGosterme(){
    System.out.println("Adi : "+this.name);
    System.out.println("Hesab Nomresi : "+this.hesapNo);
    System.out.println("Balansi : "+this.balans);

}

    public void balansArtirma(double miqdar){
    if (miqdar<0){
        System.out.println("Bele emeliyat mumkun deil !");
    }
      else if (miqdar>10000){
        System.out.println("Bu qeder mebleg bankimizi desteklemir!");
        }
        else {
            balans+=miqdar;
            System.out.println("Yeni balans : " + balans);
        }
    }
    public void balansCekme(double miqdar){
        if (miqdar>10000){
            System.out.println("Bu qeder mebleg cekmek mumkun deyil deyil !");
        }
        if (balans<miqdar){
            System.out.println("Balansinizda kifayet qeder mebleg yoxudr !");
        }
        else {
            balans-=miqdar;
            System.out.println("Yeni balans : " + balans);
        }
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBalans() {
        return balans;
    }

    public void setBalans(double balans) {
        this.balans = balans;
    }
}
