package job;/**
 * Created by zhangkeluo on 2019/3/21.
 */

/**
 * @ClassName QuickSort
 * @Author zhangkeluo
 * @Date 2019/3/21 11:08 AM
 **/
public class QuickSort {
    public static void quickSort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[low];

        while (start < end){
            while (end > start && a[end]>=key){
                end--;
            }
            if(a[end]<=key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while(end>start&&a[start]<=key){
                start++;}
            if(a[start]>=key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if(start>low) {
            quickSort(a,low,start-1);
        }
        if(end<high){
            quickSort(a,end+1,high);
        }
    }

    public static void main(String[] args){
        int[] a = {1,123,23,12,42,12,3,2,5,9};
        quickSort(a,0,a.length-1);
        System.out.println("1");
    }
}
