package ss3_mang_cac_phuong_thuc_trong_java.thuc_hanh;

public class TimGiTriNhoNhatCuaPhantuTrongMang {
    public static void main(String[] args) {
        int[] ArrNum = {2, 4, 6, 8, 9};
        System.out.println("giá trị nhỏ nhất của phần trử trong mảng là " + timMin(ArrNum));
    }

    public static int timMin(int[] Arr) {
        int min = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] < min) {
                min = Arr[i];

            }

        }
        return min;
    }

}
