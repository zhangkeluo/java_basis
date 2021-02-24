package sort;/**
 * Created by zhangkeluo on 2019/3/28.
 */

/**
 * @ClassName SelectSort
 * @Author zhangkeluo
 * @Date 2019/3/28 9:16 PM
 **/
public class SelectSort {
    public static void main(String[] args){
        int[] a = {57,21,32,21,23,99};
        selectSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }

    }

    private static void selectSort(int[] arr){
        int length = arr.length;
        int min;
        for (int i=0;i<length;i++){
            min=i;
            for (int j=i;j<length;j++){
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            arr[i] = (arr[i] + arr[min]) - (arr[min] = arr[i]);
        }
    }
}
