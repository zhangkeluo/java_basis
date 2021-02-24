/**
 * Created by zhangkeluo on 2019/3/12.
 */

/**
 * @ClassName test6
 * @Author zhangkeluo
 * @Date 2019/3/12 5:19 PM
 *  两个线程交替打印0~100的奇偶数
 **/
public class ThreadDemo {
    public static void main(String[] args){
        thread2();
        thread1();
    }
    private volatile static int num=0;
    private static Object object = new Object();

    //打印奇数
    private static void thread1(){
//        Thread thread3 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        })
        Thread thread1 = new Thread(()->{
            while (num < 101){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName() + "——" + num++);
                    object.notify();
                    try {
                        object.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        },"奇数线程");
        thread1.start();
    }
    //打印偶数
    private static void thread2(){
        Thread thread2 = new Thread(()->{
            while (num < 101){
                synchronized (object){
                    System.out.println(Thread.currentThread().getName() + "————" + num++);
                    object.notify();
                    try {
                        object.wait();
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }

            }
        },"偶数线程");
        thread2.start();
    }
}
