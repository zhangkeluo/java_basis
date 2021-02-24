package job;/**
 * Created by zhangkeluo on 2019/3/14.
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @ClassName FindNumsAppearOnce
 * @Author zhangkeluo
 * @Date 2019/3/14 6:12 PM
 *
 * 一个整型数组里除了两个数字之外，其他的数字都出现了偶数次。
 * 请写程序找出这两个只出现一次的数字。
 **/
public class FindNumsAppearOnce {
    ArrayList<Integer> list = new ArrayList<Integer>();
    public void findNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            if((i+1)<array.length && array[i]==array[i+1]){
                i++;
            }else{
                list.add(array[i]);
            }
        }
        num1[0]=list.get(0);
        num2[0]=list.get(1);
    }
}

