package leedcode;/**
 * Created by zhangkeluo on 2019/4/27.
 */

/**
 * @ClassName ReverseInt
 * @Author zhangkeluo
 * @Date 2019/4/27 9:35 PM
 **/
public class ReverseInt {
    public static int reverse(int x) {
        double result = 0.0;
        while(x!=0){
            result = result * 10 + x%10;
            x = x /10;
        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            result = 0.0;
        }
        return (int)result;
    }

    public static void main(String[] args){
        System.out.print(ReverseInt.reverse(-1113124434));
    }
}
