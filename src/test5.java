/**
 * Created by zhangkeluo on 2019/3/11.
 */

import java.sql.Time;
import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName test5
 * @Author zhangkeluo
 * @Date 2019/3/11 5:12 PM
 *
 * synchronized的等待唤醒机制
 * synchronised对象锁
 * waitthread 和 notifythread两个线程
 **/
public class test5 {
    private static Object object = new Object();
    public static void main(String[] args) {
        try {
            waitThread();
            Thread.sleep(1000);
            notifyThread();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    private static void waitThread(){
        Thread waitthread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println(Thread.currentThread().getName() + "wait-before!");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        object.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "after-wait");
                }
            }
        },"this-is-waitthead!");
        waitthread.start();

    }
    private static void notifyThread(){
        Thread notifythread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println(Thread.currentThread().getName() + " notify-before!");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                        object.notify();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "after-notify");
                }
            }
        },"this-is-notifythread!");
        notifythread.start();
        }

}



