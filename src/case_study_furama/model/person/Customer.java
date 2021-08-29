package case_study_furama.model.person;

public class Customer extends Person{
    private String rankCustomer;
    private  String address;

    public Customer() {
    }

    public Customer(String id, String name, int birthday, String gender, String idCard, String phone, String mail) {
        super(id, name, birthday, gender, idCard, phone, mail);
    }

    public Customer(String rankCustomer, String address) {
        this.rankCustomer = rankCustomer;
        this.address = address;
    }

    public Customer(String id, String name, int birthday, String gender,
                    String idCard, String phone, String mail, String rankCustomer, String address) {
        super(id, name, birthday, gender, idCard, phone, mail);
        this.rankCustomer = rankCustomer;
        this.address = address;
    }

    public String getRankCustomer() {
        return rankCustomer;
    }

    public void setRankCustomer(String rankCustomer) {
        this.rankCustomer = rankCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "rankCustomer='" + rankCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
