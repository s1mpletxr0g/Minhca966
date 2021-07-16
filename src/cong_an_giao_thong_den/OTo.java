package cong_an_giao_thong_den;

public class OTo extends XeMay{
    public OTo() {
    }

    public OTo(String bKS, String tenHang, int namSX, String chuSoHuu, String soChoNgoi, double trongTai, String congSuat) {
        super(bKS, tenHang, namSX, chuSoHuu, soChoNgoi, trongTai, congSuat);
    }

    @Override
    public String getSoChoNgoi() {
        return super.getSoChoNgoi();
    }

    @Override
    public void setSoChoNgoi(String soChoNgoi) {
        super.setSoChoNgoi(soChoNgoi);
    }

    @Override
    public double getTrongTai() {
        return super.getTrongTai();
    }

    @Override
    public void setTrongTai(double trongTai) {
        super.setTrongTai(trongTai);
    }

    @Override
    public String getCongSuat() {
        return super.getCongSuat();
    }

    @Override
    public void setCongSuat(String congSuat) {
        super.setCongSuat(congSuat);
    }

    @Override
    public String getbKS() {
        return super.getbKS();
    }

    @Override
    public void setbKS(String bKS) {
        super.setbKS(bKS);
    }

    @Override
    public String getTenHang() {
        return super.getTenHang();
    }

    @Override
    public void setTenHang(String tenHang) {
        super.setTenHang(tenHang);
    }

    @Override
    public int getNamSX() {
        return super.getNamSX();
    }

    @Override
    public void setNamSX(int namSX) {
        super.setNamSX(namSX);
    }

    @Override
    public String getChuSoHuu() {
        return super.getChuSoHuu();
    }

    @Override
    public void setChuSoHuu(String chuSoHuu) {
        super.setChuSoHuu(chuSoHuu);
    }

    @Override
    public String toString() {
        return " bKS,"+getbKS()+" tenHang, "+ getTenHang()+" namSX,"+ getNamSX()+" chuSoHuu, "+
                getChuSoHuu()+ " soChoNgoi, "+getSoChoNgoi()+" trongTai,"+getTrongTai()+" congSuat "+getCongSuat();
    }


    @Override
    public void add() {
        super.add();
    }

    @Override
    public void edit() {
        super.edit();
    }

    @Override
    public void delete() {
        super.delete();
    }
}
