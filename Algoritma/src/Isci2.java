public class Isci2 extends Member {
    private String ixtisas;

    public Isci2(String name, int age, String phoneNumber, String dress, int salary, String ixtisas) {
        super(name, age, phoneNumber, dress, salary);
        this.ixtisas = ixtisas;
    }

    public String getIxtisas() {
        return ixtisas;
    }

    public void setIxtisas(String ixtisas) {
        this.ixtisas = ixtisas;
    }
}
