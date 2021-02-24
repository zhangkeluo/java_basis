package job;/**
 * Created by zhangkeluo on 2019/4/18.
 */

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName ReverseString
 * @Author zhangkeluo
 * @Date 2019/4/18 3:32 PM
 * 反转字符串
 * 反转字符串（例如，输入http://www.baidu.com/download/apllo，输出apllo/download/com.baidu.www//:http）
 **/
public class ReverseString {
    public static void main(String[] args){

    }

    /**
     * 调用reversel（）方法实现翻转
     * @param s
     * @return
     */
    public static String reverseString1(String s){
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverseString2(String s){
        long num1 = 1;
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =chars.length-1;i>=0;i--){
            stringBuilder.append(chars[i]);
        }

        return stringBuilder.toString();
    }
}
