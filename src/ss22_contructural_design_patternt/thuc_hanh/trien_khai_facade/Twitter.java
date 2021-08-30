package ss22_contructural_design_patternt.thuc_hanh.trien_khai_facade;

public class Twitter implements SocialShare{
    private String message;

    @Override
    public void setMessage(String message) {

    }

    @Override
    public void share() {

    }

    @Override
    public String toString() {
        return "Twitte{" +
                "message='" + message + '\'' +
                '}';
    }
}
