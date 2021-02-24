/**
 * Created by zhangkeluo on 2019/4/3.
 */

import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName test6
 * @Author zhangkeluo
 * @Date 2019/4/3 7:15 PM
 **/
public class test6 {
    public static void main(String[] args){
        String uuid = UUID.randomUUID().toString().replace("-","");
        System.out.print(uuid);
        BlockingQueue a = new ArrayBlockingQueue(10);
    }
}
