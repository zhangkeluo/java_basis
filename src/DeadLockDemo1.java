/**
 * Created by zhangkeluo on 2019/3/16.
 */

/**
 * @ClassName DeadLockDemo1
 * @Author zhangkeluo
 * @Date 2019/3/16 2:35 PM
 *
 * 死锁：互相等待获取锁的例子：
 * 线程A：持有锁a，等待获取锁b；
 * 线程B：持有锁b，等待获取锁a；
 **/
public class DeadLockDemo1 {
    public static void main(String[] args) {
        final Object a = new Object();
        final Object b = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a) {
                    try {
                        System.out.println("now i in threadA-locka");
                        Thread.sleep(1000);
                        synchronized (b) {
                            System.out.println("now i in threadA-lockb");
                        }
                    } catch (Exception e) {
                        // ignore
                    }
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b) {
                    try {
                        System.out.println("now i in threadB-lockb");
                        Thread.sleep(1000);
                        synchronized (a) {
                            System.out.println("now i in threadB-locka");
                        }
                    } catch (Exception e) {
                        // ignore
                    }
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
