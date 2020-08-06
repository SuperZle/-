import java.util.Arrays;

public class d {
    public static void main(String[] args) {
        int[] nums1={-1,0,0,3,3,3,0,0,0};
        int[] i={1,2,2};
        merge(nums1,6,i,3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int a=0;
        //Arrays.sort(nums1);
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i]==0 && a<n){
            nums1[i]=nums2[a];
            a++;
            }
        }
        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }
}
