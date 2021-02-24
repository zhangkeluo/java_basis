package sort;/**
 * Created by zhangkeluo on 2019/5/5.
 */

/**
 * @ClassName QuickSort
 * @Author zhangkeluo
 * @Date 2019/5/5 2:23 PM
 **/
public class QuickSort {
    public static void quickSort(int[] arr,int low,int high){
        if (arr.length <=0 || low >=high){
            return;
        }
        int left = low;
        int right = high;

        int temp = arr[left];

        while (left < right){
            while (right > left && arr[right] >= temp){
                right--;
            }
            arr[left] = arr[right];

            while (right > left && arr[left] <= temp){
                left++;
            }
            arr[right] = arr[left];
        }

        arr[left] = temp;

        quickSort(arr,low,left-1);
        quickSort(arr,left+1,right);
    }
}
