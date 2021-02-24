package job;/**
 * Created by zhangkeluo on 2019/5/5.
 */

/**
 * @ClassName XPowerN
 * @Author zhangkeluo
 * @Date 2019/5/5 5:06 PM
 **/
public class XPowerN {
    public static double power(double x,int n){
        if (x==0 && n<=0){
            throw new RuntimeException("分母不能为0");
        }
        if (x==0 && n >0){
            return 0.0;
        }
        if (n==0){
            return 1.0;
        }
        if (n==1){
            return x;
        }
        boolean b = (n<0) ?true :false;
        if (n<0){
            n=-1*n;
        }
        double result = 1.0;
        for (int i=0;i<n;i++){
            result = result * x;
        }
        if (b){
            result = 1/result;
        }
        return result;
    }

    public void reOrderArray(int [] array) {
        if (array == null || array.length<=1){
            return;
        }

    }

    public static void main(String[] args){
        System.out.print(power(0,-9));
    }
}
