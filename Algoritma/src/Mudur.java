public class Mudur extends Isci{
    private int sorumli_kisi;

    public Mudur(String maas, String ad, String sahe,int sorumli_kisi) {
        super(maas,ad,sahe);
        this.sorumli_kisi=sorumli_kisi;
    }
    public void afternoon_yemek(){
        super.afternoon_yemek();
        System.out.println("BU qeder sexs sorumludu : " + sorumli_kisi);
    }


    /*
    public void method(){
        System.out.println("sorumlu kisi sayisi : "+sorumli_kisi);
    }
    public void morning_func(){
        System.out.println("Sabahiniz xeyir ! " +sorumli_kisi);
    }

     */
}
