public class LX1 {
    public static void main(String[] args) {
        //int [] arr=new int []{1,2,3,4,5,6};
        int[] arr={10000,200,3,4000,500,600000};
        //length
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------------");
        arr[0]=6;
        int i=arr [0];
        System.out.println(i);
        System.out.println(arr [0]);
    }
}
