public class Member {
    private String name;
    private int age;
    private String phoneNumber;
    private String dress; //address
    private int salary;

    public void printSalary(){
        System.out.println(salary);
    }

    public Member(String name, int age, String phoneNumber, String dress, int salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.dress = dress;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDress() {
        return dress;
    }

    public void setDress(String dress) {
        this.dress = dress;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}



/*
 Isci2 isci=new Isci2("Nicat",18,"051877","Xetai",100,"Engineer");
        Manager manager=new Manager("Rovshan",18,"051777","Xirdalan",150,
                "Science");

        System.out.println("Ad      Age Nomre   Adress     Salary  Ixtisas    Sobe");
        System.out.println(isci.getName()+"   "+ isci.getAge() + "  "+isci.getPhoneNumber() +"  " +isci.getDress() +"       "+ isci.getSalary() + "    "+isci.getIxtisas());
        System.out.println(manager.getName()+" "+ manager.getAge() +"  "+isci.getPhoneNumber() +"  " +manager.getDress() +"    "+ manager.getSalary() + "               "+manager.getShobe());

 */
