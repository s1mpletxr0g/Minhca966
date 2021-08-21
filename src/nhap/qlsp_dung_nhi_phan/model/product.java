package nhap.qlsp_dung_nhi_phan.model;

public class Product {
    private int id;
    private String name;
    private String profile;

    public product() {
    }

    public product(int id, String name, String profile) {
        this.id = id;
        this.name = name;
        this.profile = profile;
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

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
