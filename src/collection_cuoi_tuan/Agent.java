package collection_cuoi_tuan;

public abstract class Agent implements Interface {
    private  int id;
    private String name;
    private  int age;
    private String address;
    private  String mail;

    public Agent() {
    }

    public Agent(int id, String name, int age, String address, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return
                " id= " + id +
                " , name=' " + name + '\'' +
                " , age= " + age +
                " , address=' " + address + '\'' +
                " , mail=' " + mail + '\'' ;

    }
}
