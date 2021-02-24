package job;/**
 * Created by zhangkeluo on 2019/5/2.
 */

/**
 * @ClassName FindElementIsExistInArray
 * @Author zhangkeluo
 * @Date 2019/5/2 4:28 PM
 *
 * 二维数组中的查找
 *
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
 * 判断数组中是否含有该整数。
 **/
public class FindElementIsExistInArray {
    public static boolean Find(int[][] arr,int target){
        boolean result =false;
        int i=arr.length-1,j=0;
        while (i>=0 && j<=arr[0].length-1){
            if (target > arr[i][j]){
                j++;
                continue;
            }else if (target < arr[i][j]){
                i--;
                continue;
            }else {
                result = true;
                break;
            }
        }

        return result;
    }
}
