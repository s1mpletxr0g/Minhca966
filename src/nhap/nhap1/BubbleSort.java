package nhap.nhap1;

public  class BubbleSort {
    public static void bubble(int [] arr){
        boolean flag=true;
        for(int k=1; k<arr.length && flag;k++ ){
            flag=false;
            for (int i=0;i<arr.length-k;i++){
                if(arr[i]>arr[i+1] ){
                    int tem=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=tem;
                }
                flag=true;
            }

        }
        for (int arr1: arr){
            System.out.print(arr1+"  ");
        }

    }

    public static void main(String[] args) {
        int [] list={3,5,2,8,7,1,6,2};
        bubble(list);

    }
}
