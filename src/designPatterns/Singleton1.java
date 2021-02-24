package designPatterns;/**
 * Created by zhangkeluo on 2019/5/8.
 */

/**
 * @ClassName Singleton1
 * @Author zhangkeluo
 * @Date 2019/5/8 5:14 PM
 *
 * 饿汉模式
 **/
public class Singleton1 {
    private Singleton1(){

    }
    private static Singleton1 singleton1 = new Singleton1();

    public static Singleton1 getInstance(){
        return singleton1;w
    }
}
