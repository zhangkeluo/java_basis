package sort;/**
 * Created by zhangkeluo on 2019/4/11.
 */

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Hashmaptest
 * @Author zhangkeluo
 * @Date 2019/4/11 9:45 PM
 **/
public class Hashmaptest implements Serializable {
    public static void main(String[] args){
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("name",10);
        Map map = Collections.synchronizedMap(hashMap);
        System.out.print(map.get("name"));
        ObjectInputStream inputStream = new ObjectInputStream();
    }
}
