package job;/**
 * Created by zhangkeluo on 2019/4/18.
 */

import java.util.regex.Pattern;

/**
 * @ClassName IpCheck
 * @Author zhangkeluo
 * @Date 2019/4/18 3:06 PM
 * 检查Ip地址是否合法
 **/
public class IpCheck {
    public static void main(String[] args){
        System.out.print(ipCheck("1.2333.33.1"));

    }
    public static boolean ipCheck(String ip){
        boolean result = false;
        if (ip != null || !ip.isEmpty() | ip.length()<16){

            // 定义正则表达式
            String regex = "([1-9]|[1-9][0-9]|1\\d\\d|2[0-4]\\d|25[0-5])\\." +
                    "([1-9]|[1-9][0-9]|1\\d\\d|2[0-4]\\d|25[0-5])\\." +
                    "([1-9]|[1-9][0-9]|1\\d\\d|2[0-4]\\d|25[0-5])\\." +
                    "([1-9]|[1-9][0-9]|1\\d\\d|2[0-4]\\d|25[0-5])";

            result =  Pattern.matches(regex,ip);

        }
        return result;
    }
//    ˜

}
