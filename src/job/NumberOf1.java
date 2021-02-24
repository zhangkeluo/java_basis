package job;/**
 * Created by zhangkeluo on 2019/5/5.
 */

/**
 * @ClassName NumberOf1
 * @Author zhangkeluo
 * @Date 2019/5/5 10:11 PM
 *
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

 **/
public class NumberOf1 {
    public int numberOf1(int n){
        int temp=1;
        int result = 0;
        while (temp!=0){
            if ((n & temp) !=0){
                result++;
            }
            temp = temp<<1;
        }
        return result;
    }

    /**
     * 转换为string
     * @param n
     * @return
     */
    public int numberOf11(int n){
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }
}
