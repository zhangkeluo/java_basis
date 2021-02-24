package sort;/**
 * Created by zhangkeluo on 2019/3/28.
 */

/**
 * @ClassName BubbleSort
 * @Author zhangkeluo
 * @Date 2019/3/28 9:32 PM
 **/
public class BubbleSort {
    public static void main(String[] args){
        int[] a = {57,21,32,21,23,99,123,44,11};
        bubbleSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] + ",");
        }

    }

    private static void bubbleSort(int[] arr){
        int length = arr.length;
        for (int i=0;i<length;i++){
            for (int j=0;j<length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
