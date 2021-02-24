package job;/**
 * Created by zhangkeluo on 2019/5/5.
 */

/**
 * @ClassName ReOrderArray
 * @Author zhangkeluo
 * @Date 2019/5/5 9:22 PM
 *
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 **/
public class ReOrderArray {
    public static void reOrderArray(int [] array) {
        if (array==null || array.length<=1){
            return;
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]%2==0 && array[j+1]%2==1){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print(" ");
    }

    public static void main(String[] args){
        int[] arr = {1,23,12,23,5,4,22,9,10};
        reOrderArray(arr);
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
