package designPatterns;/**
 * Created by zhangkeluo on 2019/3/21.
 */

/**
 * @ClassName Singleton
 * @Author zhangkeluo
 * @Date 2019/3/21 9:21 PM
 *
 * 单例模式
 **/
public class Singleton {
    private static volatile Singleton uniquesingleton;
    private Singleton(){}

    public static Singleton getInstance(){
        if (null == uniquesingleton){
            synchronized (Singleton.class){
                if (null == uniquesingleton){
                    uniquesingleton = new Singleton();
                }
            }
        }
        return uniquesingleton;
    }
}
