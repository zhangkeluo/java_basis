/**
 * Created by zhangkeluo on 2019/3/4.
 */
public class test2 implements Runnable{
    private int ticket = 5;
    @Override
    public void run(){
        for (int i=0;i<10;i++)  {
            if(ticket > 0){
                System.out.println("ticket = " + ticket--);
            }
        }
    }

    public static void main(String[] args){
        test2 t = new test2();
        Thread thread1 = new Thread(t);

        Thread thread2 = new Thread(t);
        thread1.start();
        thread2.start();
        System.out.println(thread1.getName());

    }
}
