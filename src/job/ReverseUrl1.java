package job;/**
 * Created by zhangkeluo on 2019/5/2.
 */

/**
 * @ClassName ReverseUrl1
 * @Author zhangkeluo
 * @Date 2019/5/2 4:49 PM
 *
 * https://www.jianshu.com/p/30054f432d60
 * 将 www.baidu.com 转化成  www.udiab.moc
 **/
public class ReverseUrl1 {

    public static String reverseUrl(String s){
        String[] strings = s.split("\\.");
        int length = strings.length;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i =0;i<length;i++){
            if (i != length-1){
                stringBuilder.append(reverseString(strings[i]));
                stringBuilder.append('.');
            }else {
                stringBuilder.append(reverseString(strings[i]));
            }
        }
        return stringBuilder.toString();
    }

    public static String reverseString(String s){
        String reverse = "";
        int length = s.length();
        for (int i=length-1;i>0;i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args){
        System.out.print(reverseUrl("sdadsa.1231.sda"));
    }
}
