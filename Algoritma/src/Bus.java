public class Bus {
    private String color;
    private String model;

    public Bus(String color, String model) {
        this.color = color;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public static void benzinBildirisi(){
        System.out.println("Benzin bitir,depoya yaxnlsin ");
    }
    public void yagBildirisler(){
        System.out.println("Yag azalir,ustaya gedin ");
    }
}

 /*public static double qapi_sayi=2;

    public Bus(String color, String model) {
        this.color = color;
        this.model = model;
        qapi_sayi+=3;
        qapi_sayi-=5;



    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void bus_gosterme(){
        System.out.println("AVTOBUS" + color + "rengdedir");
    }

     */