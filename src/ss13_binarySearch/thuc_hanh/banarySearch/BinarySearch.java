package ss13_binarySearch.thuc_hanh.banarySearch;

public  class BinarySearch {
    static int[] list = {10, 12,16,23,45,67,83,100,123,132};

    static int binarySearch(int[] list, int value) {
        int low = 0;
        int higth = list.length - 1;
        while (higth >= low) {
            int mid = (low + higth) / 2;
            if (value == list[mid])
                return mid;
             else if (value < list[mid])
                higth = mid - 1;
             else
                low = mid + 1;
            }
        return -1;


    }
        public static void main (String[]args){

            System.out.println(binarySearch(list, 132));
            System.out.println(binarySearch(list, 12));
            System.out.println(binarySearch(list, 16));
            System.out.println(binarySearch(list, 23));
            System.out.println(binarySearch(list, 100));
            System.out.println(binarySearch(list, 13));
            System.out.println(binarySearch(list, 132));
        }

    }
