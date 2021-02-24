package job;/**
 * Created by zhangkeluo on 2019/3/28.
 */

/**
 * @ClassName PrintWanShu
 * @Author zhangkeluo
 * @Date 2019/3/28 8:59 PM
 *
 *
 * 输出数字n之前所有的完数
 * 完数：数字正好等于他的因子之和，例如：6=1+2+3；
 * 因子：n/m余数为0，那么m就是n的一个因子
 **/
public class PrintWanShu {
    public static void main(String[] args){
        int n=1000;
        int sum;
        for (int i=1;i<n;i++){
            sum=0;
            for (int j=1;j<=i-1;j++){
                if (i%j==0){
                    sum += j;
                }
            }
            if (sum == i){
                System.out.println(i);
            }
        }
    }
}
