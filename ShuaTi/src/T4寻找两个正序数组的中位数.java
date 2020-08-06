import java.util.Arrays;

//给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
//
// 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
//
// 你可以假设 nums1 和 nums2 不会同时为空。
//
//
//
// 示例 1:
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
//
//
// 示例 2:
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
//
// Related Topics 数组 二分查找 分治算法
public class T4寻找两个正序数组的中位数 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //假设num1不变
        int m=nums1.length;

        int n=nums2.length;



//        Arrays.sort(nums1);
//
//        Arrays.sort(nums2);

        if (m == 0 && n != 0){

            if (n%2 == 0){

                return (nums2[n/2-1]+nums2[n/2])/2.0;

            }else {

                return nums2[(n-1)/2];
            }
        }
        if (n == 0 && m != 0){

            if (m%2 == 0){
                return (nums1[m/2-1]+nums1[m/2])/2.0;

            }else {
                return nums1[(m-1)/2];
            }
        }

        int[] i=new int[m+n];

        System.arraycopy(nums1,0,i,0,m);
        System.arraycopy(nums2,0,i,m,n);

        Arrays.sort(i);

        if (i.length%2==0){
            return (i[i.length/2-1]+i[i.length/2])/2.0;
        }else{

        return i[(i.length-1)/2]*1.0;

        }
    }
    public static void main(String[] args) {
        int[] a={1,3};
        int[] b={2,5,6,1,1,5,15,5};
        double medianSortedArrays = findMedianSortedArrays(a, b);
        System.out.println(medianSortedArrays);
    }
}
