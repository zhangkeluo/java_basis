package leedcode;/**
 * Created by zhangkeluo on 2019/4/27.
 */

/**
 * @ClassName FindMedianSortedArrays
 * @Author zhangkeluo
 * @Date 2019/4/27 8:47 PM
 *
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * （中位数：左边都是<中位数的数，右边都是>中位数的数）
 * 你可以假设 nums1 和 nums2 不会同时为空。
 *
 * 思路：基本思路是从两个数组中依次移除最小最大的一对数，重复操作直到两个数组共剩下1个或者2个数，即为中位数
 **/
public class FindMedianSortedArrays {


    /**
     * 先整合成一个有序数组，然后求中位数
     * @param nums1
     * @param nums2
     * @return
     */
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;

        int[] arr = new int[nums1.length+nums2.length];
        int i=0,j=0,d=0;
        while (i<nums1.length && j<nums2.length){
            if (nums1[i] <= nums2[j]){
                arr[d] = nums1[i];
                d++;
                i++;
            }else {
                arr[d] = nums2[j];
                d++;
                j++;
            }
        }
        if (i==nums1.length){
            for (;d<arr.length;d++){
                arr[d] = nums2[j];
                j++;
            }
        }else {
            for (;d<arr.length;d++){
                arr[d] = nums1[i];
                i++;
            }
        }
        if (arr.length%2 ==0){
            result = (arr[arr.length/2] + arr[arr.length/2-1])/2.0;
        }else {
            result = (double)arr[arr.length/2];
        }
        return result;
    }

    public static void main(String[] args){
        int[] a1 = {1,2};
        int[] a2 = {3,4,5};
        System.out.print(FindMedianSortedArrays.findMedianSortedArrays(a1,a2));
    }
}
