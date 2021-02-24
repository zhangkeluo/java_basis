/**
 * Created by zhangkeluo on 2019/3/13.
 */

import java.util.concurrent.*;

/**
 * @ClassName test7
 * @Author zhangkeluo
 * @Date 2019/3/13 1:50 PM
 * 使用线程池
 **/
public class ThreadPoolDemo1 {
    public static void main(String[] args){

        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,200,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<Runnable>(5));
        for (int i=0;i<15;i++){
            //executor.execute(new MyTask(i));
            System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
                    executor.getQueue().size()+"，已执行玩别的任务数目："+executor.getCompletedTaskCount());
        }
    }
}
class MyTask implements Runnable{
    private int taskNum;
    public MyTask(int num){
        this.taskNum = num;
    }
    @Override
    public void run(){
        System.out.println("正在执行task "+taskNum);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");
    }
}
