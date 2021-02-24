package job;/**
 * Created by zhangkeluo on 2019/3/15.
 */

import java.util.ArrayList;

/**
 * @ClassName FindNumbersWithSum
 * @Author zhangkeluo
 * @Date 2019/3/15 10:20 AM
 *
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，
 * 使得他们的和正好是S，如果有多对数字的和等于S，
 * 输出两个数的乘积最小的。
 **/
public class FindNumbersWithSum {
    ArrayList<Integer> result = new ArrayList<>();
    public ArrayList<Integer> findNumbersWithSum(int [] a, int sum) {
        int i = 0;
        int j = a.length-1;
        if (a.length < 2 || a == null){
            return result;
        }
        while (i<j){
            if ((a[i] + a[j]) == sum){
                result.add(a[i]);
                result.add(a[j]);
                break;
            }else if ((a[i] + a[j]) > sum){
                j--;
                continue;
            }else {
                i++;
            }
        }
        return result;
    }
}
