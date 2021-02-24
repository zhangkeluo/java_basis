package job;/**
 * Created by zhangkeluo on 2019/3/14.
 */

/**
 * @ClassName ReplaceSpace
 * @Author zhangkeluo
 * @Date 2019/3/14 5:15 PM
 *
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 **/
public class ReplaceSpace {
    public static void main(String[] args){

        System.out.println(replaceSpace(new StringBuffer("zhang ke luo! ")));
    }
    public static String replaceSpace(StringBuffer str){
        String result =null;
        if (str == null){
            System.out.println("输入为空了！");
        }else {
            int numspace =0;
            int length = str.length();
            for (int i=0;i<length;i++){
                if (str.charAt(i) == ' '){
                    numspace++;
                }
            }
            if (numspace != 0){
                int newindex = (length+numspace*2)-1;
                int oldindex = length-1;
                str.setLength(newindex+1);

                for (;oldindex>=0;oldindex--){
                    if (oldindex == newindex){
                        break;
                    }else {
                        if (str.charAt(oldindex) != ' '){
                            str.setCharAt(newindex,str.charAt(oldindex));
                            newindex--;
                        }else {
                            str.setCharAt(newindex--,'0');
                            str.setCharAt(newindex--,'2');
                            str.setCharAt(newindex--,'%');
                        }
                    }

                }
            }
            result = str.toString();
        }
        return result;
    }
}
