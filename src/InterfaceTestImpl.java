/**
 * Created by zhangkeluo on 2019/3/2.
 */
public class InterfaceTestImpl implements InterfaceTest {

    @Override
    public void method() {
        System.out.println("实现InterfaceTest接口中的method方法。");

        this.defaultMethod();
    }
    int i = 3;

    public static void main(String[] args) throws CloneNotSupportedException{

        InterfaceTestImpl interfaceTestImpl = new InterfaceTestImpl();

        interfaceTestImpl.method();
        System.out.print(interfaceTestImpl.clone().toString());
    }
}

