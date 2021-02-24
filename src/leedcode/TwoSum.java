package leedcode;/**
 * Created by zhangkeluo on 2019/5/3.
 */

import com.sun.org.apache.regexp.internal.RE;

import java.util.HashMap;
import java.util.Vector;

/**
 * @ClassName TwoSum
 * @Author zhangkeluo
 * @Date 2019/5/3 4:31 PM
 **/
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //使用hashmap来做
        int[] res = new int[2];

        if (nums==null || nums.length<2){
            return null;
        }
        HashMap<Integer,Integer> map = new HashMap();
        for (int i=0;i<nums.length;i++){
            //先判断map中是否存在和nums[i]和为target的元素，如果有，则输出
            if (map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                break;
            }
            //map中不存在匹配的元素后，将nums[i]加入到map中
            map.put(nums[i],i);
        }
        Vector vector = new Vector();
        HashMap hashMap = new HashMap();
        return res;
    }

    public static void main(String[] args){
        int[] a = {3,2,4};
        System.out.print(twoSum(a,6).toString());
    }
}