package job; /**
 * Created by zhangkeluo on 2019/3/6.
 */

import java.util.concurrent.TimeUnit;

/**
 * @ClassName job.test4
 * @Author zhangkeluo
 * @Date 2019/3/6 2:58 PM
 *
 * 题目：
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * 整数，判断数组中是否含有该整数。
 **/
public class test4 {
    public static void main(String []args){
        int[][] a = {{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(find(a,10));
    }
    public static boolean find(int[][] array,int target){
        int i = array.length-1;
        int j = 0;
        boolean result = false;

        while (i>=0 && j<=array[0].length-1){
            if (array[i][j] == target){
                result = true;
                break;
            }else if(array[i][j] > target){
                i--;
                continue;
            }else{
                j++;
                continue;
            }
        }
        return result;
    }
}
