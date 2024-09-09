public class Manager extends Member {
    private String shobe;

    public Manager(String name, int age, String phoneNumber, String dress, int salary, String shobe) {
        super(name, age, phoneNumber, dress, salary);
        this.shobe = shobe;
    }

    public String getShobe() {
        return shobe;
    }

    public void setShobe(String shobe) {
        this.shobe = shobe;
    }
}
