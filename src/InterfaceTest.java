/**
 * Created by zhangkeluo on 2019/3/2.
 */
public interface InterfaceTest {

    default void defaultMethod() {
        System.out.println("This is a default method!");

        System.out.print("调用本接口中的static方法：");
        InterfaceTest.staticMethod();
    }

    static void staticMethod() {
        System.out.println("This is a static method!");
    }

    public void method();
}

