package nhap.nhap4.ghi_tu_ban_phim_vao_file;

public class Country {
    private int Id;
    private String name;
    private  String code;

    public Country() {
    }

    public Country(int id, String name, String code) {
        Id = id;
        this.name = name;
        this.code = code;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' ;
    }
}
