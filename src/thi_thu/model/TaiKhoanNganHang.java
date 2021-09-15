package thi_thu.model;

public class TaiKhoanThanhToan {
//    Id tài khoản, Mã tài khoản, Tên chủ tài khoản, Ngày tạo tài khoản.
    private String maTaiKhoan;
    private  String tenChuTaiKhoan;
    private String ngayTao;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(String maTaiKhoan, String tenChuTaiKhoan, String ngayTao) {
        this.maTaiKhoan = maTaiKhoan;
        this.tenChuTaiKhoan = tenChuTaiKhoan;
        this.ngayTao = ngayTao;
    }

    public String getMaTaiKhoan() {
        return maTaiKhoan;
    }

    public void setMaTaiKhoan(String maTaiKhoan) {
        this.maTaiKhoan = maTaiKhoan;
    }

    public String getTenChuTaiKhoan() {
        return tenChuTaiKhoan;
    }

    public void setTenChuTaiKhoan(String tenChuTaiKhoan) {
        this.tenChuTaiKhoan = tenChuTaiKhoan;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return
                 maTaiKhoan+","+tenChuTaiKhoan+","+ngayTao ;

    }
}
