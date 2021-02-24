package job;/**
 * Created by zhangkeluo on 2019/5/2.
 */

import java.util.HashMap;
import java.util.LinkedList;

/**
 * @ClassName GetMostFrequentInArrayList
 * @Author zhangkeluo
 * @Date 2019/5/2 9:03 PM
 *
 * 求一个数组中的出现次数最多的元素的个数
 * https://blog.csdn.net/sinat_23092639/article/details/69808244
 *
 * 使用hashmap
 **/
public class GetMostFrequentInArrayList {
    public static <T> int getMostFrequentByMap(T a[]){
        if (a == null || a.length==0){
            return 0;
        }
        int result = 0;

        int length = a.length;
        HashMap<T,LinkedList<T>> hashMap = new HashMap<>();
        for (int i=0;i<length;i++){
            if (hashMap.get(a[i])!=null){
                hashMap.get(a[i]).add(a[i]);
            }else {
                LinkedList<T> linkedList = new LinkedList<>();
                linkedList.add(a[i]);
                hashMap.put(a[i],linkedList);
            }
        }

        //遍历找出出现次数最大的元素
        LinkedList<T> list = null;
        for (LinkedList<T> temp : hashMap.values()){
            if (list == null){
                list = temp;
                continue;
            }
            if (temp.size() > list.size()){
                list = temp;
            }
        }

        result = list.size();
        return result;

    }

    public static void main(String[] args){
        Integer[] a = {1,23,42,1,3,123,4,122,33,22,11,23,1,1,};
        System.out.print(getMostFrequentByMap(a));
        ThreadLocal threadLocal  = new ThreadLocal();
    }
}
