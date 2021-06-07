package ss2_vung_lap_trong_java.bai_tap;

public class HienThi20SoNguyenTodauTien {
    public static void main(String[] args) {
        int n = 2;
        int i = 2;
        int count = 0;
        while (count < 20) {
            if (n >= 2) {
                boolean flag = true;
                for (i = 2; i < n; i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    System.out.print(n + " ");
                    count++;
                }
            }
            n++;
        }
    }
}
