import java.util.ArrayList;

public class Futbolcu {
    ArrayList<String> futbolcular=new ArrayList<String>();
    public void futbolculari_capedin(){
        System.out.println("Futbolcular listesinde "+ futbolcular.size() +"futbolcu var");
        for (int i=0;i< futbolcular.size();i++){
            System.out.println();
        }
    }
    public void elaveEt(String ad){
        futbolcular.add(ad);
        System.out.println("Futbolcu listine "+ ad +"adli sexs elave olundu");
    }
    public void guncelle(int yeri,String yeni_ad){
        futbolcular.set(yeri, yeni_ad);
        System.out.println("Futbolcular listi guncellendi");
    }
    public void sil(int yeri){
        String ad=futbolcular.get(yeri);
        futbolcular.remove(yeri);
        System.out.println(" "+ ad + "adli sexs listeden silindi");
    }
    public void axtar(String ad){
        int yeri= futbolcular.indexOf(ad);
        if (yeri>=0){
            System.out.println("Futbolcu tapildi");
            System.out.println(ad +"adli futbolcu"+(yeri+1)+ " ci yerdedir");
        }
        else {
            System.out.println("bele futbolcu yoxdur");
        }

    }

}
