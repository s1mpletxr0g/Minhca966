package ss2_vung_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int i=2;
        int n=2;
        while(n<100){
            if(n>=2){
                boolean flag=true;
                for(i=2;i<n;i++){
                    if(n%i==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.print(n+" ");
                }
                n++;
            }
        }
    }
}
